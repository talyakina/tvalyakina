
public class Complex {	
	private static String firstRe;
	private static  String secondRe;
	private static String secondIm;
	private static  String firstIm;
	private static String operation;

	public  Complex(String firstRe, String firstIm, String secondRe,String secondIm, String operation) {
        this.firstRe = firstRe;
        this.firstIm = firstIm;
        this.secondRe = secondRe;
        this.secondIm = secondIm;
        this.operation = operation;        
        }     
    public  String calculate() { 
    	String result = "";
    	int predResult;
    	int resultRE;
		int resultIm;
		int i =0;
		int firstReStr=Integer.parseInt(firstRe); 
		int secondReStr=Integer.parseInt(secondRe); 
		int firstImStr=Integer.parseInt(firstIm); 
		int secondImStr=Integer.parseInt(secondIm); 
    	switch (operation) {    	   
		case "*":
			if(firstIm.charAt(0) == '-' && secondIm.charAt(0) != '-'){			
			String predResult2 = (Integer.toString((firstReStr*secondReStr) + firstImStr*secondImStr*(-1)))+ '+' + (Integer.toString((firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';			
			result = predResult2;
			}if(firstIm.charAt(0) == '-' && secondIm.charAt(0) == '-'){
				String predResult2 = (Integer.toString((firstReStr*secondReStr) + firstImStr*secondImStr*(-1))) + (Integer.toString((firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';			
				result = predResult2;
			}if(firstIm.charAt(0) != '-' && secondIm.charAt(0) == '-'){
				String predResult2 = (Integer.toString((firstReStr*secondReStr) + firstImStr*secondImStr*(-1))) + (Integer.toString((firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';			
				result = predResult2;
			}if(firstIm.charAt(0) != '-' && secondIm.charAt(0) != '-'){
				String predResult2 = (Integer.toString((firstReStr*secondReStr) + firstImStr*secondImStr*(-1))) + '+'+ (Integer.toString((firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';			
				result = predResult2;
			}			
			break;
		case "/":
			if(firstIm.charAt(0) != '-' && secondIm.charAt(0) == '-'){
				String denominator = (Integer.toString((secondReStr*secondReStr) + (-1)*(secondImStr*((-1)*secondImStr))))+ '+' + (Integer.toString((secondReStr*secondImStr)+secondImStr*(-1)*secondReStr))+ 'i';			
				String numerator = (Integer.toString((firstReStr*secondReStr) - firstImStr*secondImStr*(-1)))+ '+' + (Integer.toString((firstReStr*(-1)*secondImStr)+firstImStr*secondReStr))+ 'i';			
				result = numerator+'/'+denominator;
			}if(firstIm.charAt(0) != '-' && secondIm.charAt(0) != '-'){
				String numerator = (Integer.toString((firstReStr*secondReStr) - firstImStr*secondImStr*(-1))) + (Integer.toString(((-1)*firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';					
				String denominator = (Integer.toString((secondReStr*secondReStr) + (-1)*(secondImStr*((-1)*secondImStr))))+ '+' + (Integer.toString((secondReStr*secondImStr)+secondImStr*(-1)*secondReStr))+ 'i';			
				result = numerator+'/'+denominator;
			}if(firstIm.charAt(0) == '-' && secondIm.charAt(0) == '-'){
				String numerator = (Integer.toString((firstReStr*secondReStr) - firstImStr*secondImStr*(-1))) + (Integer.toString((firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';					
				String denominator = (Integer.toString((secondReStr*secondReStr) + (-1)*(secondImStr*((-1)*secondImStr))))+ '+' + (Integer.toString((secondReStr*secondImStr)+secondImStr*(-1)*secondReStr))+ 'i';			
				result = numerator+'/'+denominator;
			}if(firstIm.charAt(0) == '-' && secondIm.charAt(0) != '-'){
				String numerator =(Integer.toString((firstReStr*secondReStr) - firstImStr*secondImStr*(-1))) + (Integer.toString(((-1)*firstReStr*secondImStr)+firstImStr*secondReStr))+ 'i';			
				String denominator = (Integer.toString((secondReStr*secondReStr) + (-1)*(secondImStr*((-1)*secondImStr)))) + '+'+ (Integer.toString((secondReStr*secondImStr)+secondImStr*(-1)*secondReStr))+ 'i';			
				//if(){
					
				//}
				result = numerator+'/'+denominator;
				
			}							
		 break;
		case "+":			
			 resultRE = firstReStr + secondReStr;
			 resultIm = firstImStr  + secondImStr;
			 if(Integer.toString(resultIm).charAt(0) == '-'){
				 result = Integer.toString(resultRE)  + Integer.toString(resultIm) + 'i';	
			 }else{
				 result = Integer.toString(resultRE) + '+' + Integer.toString(resultIm) + 'i';	
			 }
			 
			
			break;
		case "-":
			resultRE = firstReStr - secondImStr;
			 resultIm = firstImStr  - secondImStr;
			 if(Integer.toString(resultIm).charAt(0) == '-'){
				 result = Integer.toString(resultRE) +  Integer.toString(resultIm) + 'i';
			 }else{				
				 result = Integer.toString(resultRE)  + '-' + Integer.toString(resultIm) + 'i';
			 }
			break;
		}

		return result;
    	
    }

	
}
    
 