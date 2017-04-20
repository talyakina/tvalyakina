package calc;

import java.util.logging.Logger;



public class Calculator {
	private String expression;
	private String polishExp;
	private Logger log;
	
	public Calculator(String exp/*, Logger log*/){
		expression = exp;
		//this.log = log;
	}
	
	public void setExpression(String exp){
		expression = exp;
	}
	
	public String getPolish(){
		return polishExp;
	}
	
	public boolean check(){
		boolean checkFlag = true;
		char[] goodSymbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '+', '/', '*'};

		Stack stack = new Stack();
		int i = 0;
		do{
			char symb = expression.charAt(i);
			int j = 0;
			 do{
				 if (j == goodSymbols.length-1){
					 checkFlag = false;
					 log.info("Expression contains wrong symbol");
				 }else{
					 j++;
				 }
			 } while(checkFlag == true && symb != goodSymbols[j]);
			 
			 i++;
		} while(checkFlag == true && i < expression.length()) ;
		if(stack.isEmpty() == false){
			checkFlag = false;
		}
		return  checkFlag;
	}

	public int calculate()throws Exception{
		boolean checkFlag = check();
		if(checkFlag == true){
			polishString();
			int result = polishCalculate();
			log.info("Result of calculate is " + result);
			return result;
		}else{
			throw new Exception("Error. Invalid expression");
		}
	}
	
	public void polishString()throws Exception{//����� �������� ������
		Stack forPolish = new Stack();
		polishExp = "";
		for(int i = 0; i < expression.length(); i++){
			String helpStr = "";
			char symb = expression.charAt(i);
			do{
				if(symb!= '+' && symb != '-' && symb != '/' && symb!= '*'){//���� ������ �����
					helpStr += symb;//���������� �� ��������������� ����������
					i++;
					if(i < expression.length()){
						symb = expression.charAt(i);
					}
				}				
			}while(i < expression.length() && symb!= '+' && symb != '-' && symb != '/' && symb!= '*' );//����������, ���� �� ������ �����
			
			if(helpStr.isEmpty() == false){
				int element = Integer.parseInt(helpStr);
				polishExp += String.valueOf(element);
				polishExp += ",";
			}
			char symbFromStack = ' ';
			switch(symb){			
			case '*':
				do{
					if(forPolish.isEmpty() == false){
						symbFromStack = (Character)forPolish.pop();
						if(symbFromStack == '*'){
							polishExp += symbFromStack;
							polishExp += ",";
						}else{
							forPolish.push(symbFromStack);
						}
					}
				}while(symbFromStack == '*' || symbFromStack == '/'  && forPolish.isEmpty() == false);
				forPolish.push('*');
				break;
			case '/':
				do{
					if(forPolish.isEmpty() == false){
						symbFromStack = (Character)forPolish.pop();
						if(symbFromStack == '/' ){
							polishExp += symbFromStack;
							polishExp += ",";
						}else{
							forPolish.push(symbFromStack);
						}
					}
				}while(symbFromStack == '*' || symbFromStack == '/'  && forPolish.isEmpty() == false);
				forPolish.push('/');
				break;	
			case '+':
				do{
					if(forPolish.isEmpty() == false){
							polishExp += symbFromStack;
							polishExp += ",";						
							forPolish.push(symbFromStack);						
					}
				}while(forPolish.isEmpty() == false);
				forPolish.push('+');
				break;
			case '-':
				do{
					if(forPolish.isEmpty() == false){						
							polishExp += symbFromStack;
							polishExp += ",";						
							forPolish.push(symbFromStack);					
					}
				}while(forPolish.isEmpty() == false);
				forPolish.push('-');
				break;	
			}
				}
		while(forPolish.isEmpty() == false){
			char symbFromStack = (Character)forPolish.pop();
			polishExp += symbFromStack;
			polishExp += ",";
		}
	}
	
	public int polishCalculate()throws Exception{
		int resultP = 0;
		Stack stack = new Stack();
		for(int i = 0; i < polishExp.length(); i++){
			String helpStr = "";
			boolean findSign = false;
			char symb = polishExp.charAt(i);
			do{
				if(symb== '+'|| symb == '-' || symb== '/' || symb== '*'){//���� ����
					findSign = true;
				}else{//���� �����
					if(symb !=','){
					helpStr += symb;					
					i++;
					if(i < polishExp.length()){
						symb = polishExp.charAt(i);
					}
					}
				}
			}while(i < polishExp.length() && findSign == false && symb != ',');
			
			if(helpStr.isEmpty() == false){
				int forStack = Integer.parseInt(helpStr);
				stack.push(forStack);	
			}
			if(symb !=','){
				int el_1;
				int el_2;
				int result;
				switch(symb){
				case'*':
					el_1 = (Integer)stack.pop();
					el_2 = (Integer)stack.pop();
					result = el_2 * el_1;
					stack.push(result);
				break;
				case'/':
					el_1 = (Integer)stack.pop();
					el_2 = (Integer)stack.pop();
					result = el_2 / el_1;
					stack.push(result);
				break;
				case'+':
					el_1 = (Integer)stack.pop();
					el_2 = (Integer)stack.pop();
					result = el_2 + el_1;
					stack.push(result);
				break;
				case'-':
					el_1 = (Integer)stack.pop();
					el_2 = (Integer)stack.pop();
					result = el_2 - el_1;
					stack.push(result);
				break;
				}
				
			}
		}
		resultP = (Integer)stack.pop();
		if(stack.isEmpty() == false){
			throw new Exception("Stack is not empty.");
		}
		return resultP;
	}
	
	
}

