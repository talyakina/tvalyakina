package talyakina;

import java.util.Scanner;

public class Start {
	 
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String inputString = "";
	        Stack intStack = new Stack();
	        intStack.push(45);
	        intStack.push(12);
	        intStack.push(25);
	        intStack.push(94);
	        intStack.push(76);
	        intStack.push(36);
	        intStack.push(86);
	        intStack.push(38);
	        intStack.push(29);
	        intStack.push(85);	    
	        do{ 
	        	inputString = "";	        	
	        	System.out.println("Enter 1,if you want to see the top element of stack");
	        	System.out.println("Enter 2,if you want to see and delete the top element of stack");
	        	System.out.println("Enter 3,if you want to see the current size of stack");
	        	System.out.println("Enter 4,���� ������ �����");
	        	inputString = sc.nextLine();
	        	switch(inputString){
	        	
	        	case "1":
	        		try{
	            		int topInt = intStack.top();
	            		System.out.println("The top element:\n" + topInt);
	        		}catch(Exception e){
	        			System.out.println(e.getMessage());
	        		}
	        		break;
	        	case "2":
	        		try{
	        			int popInt = intStack.pop();
	            		System.out.println("Deleted element:\n" + popInt);
	        		}catch(Exception e){
	        			System.out.println(e.getMessage());
	        		}
	        		break;	
	        	case "3":
	        		int size = intStack.size();
	        		System.out.println("Size of stack = " + size);
	        		break;
	        	case "4":
	        		System.out.println("The end");
	        		break;
	        	default:
	        		System.out.println("Enter 0,1,2,3 or 4");
	        	}
	        }while(!inputString.equals("4"));

		}

	}