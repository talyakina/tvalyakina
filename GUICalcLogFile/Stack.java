package calc;

public class Stack {
		public static final int CAPACITY = 1000; 
		private int capacity; 
		private Object arr[]; 
				private int top = -1;
		public Stack() { 
			this.capacity = CAPACITY;
			arr = new Object[capacity];
		} 		
		public Stack(int capacity) { 
			this.capacity = capacity; 
			arr = new Object[this.capacity]; 
		}		
		public int size() { 
			return (top + 1); 
		} 
		public boolean isEmpty() { 
			if(top < 0 ){
				return true;
			}else{
				return false;
			}
		}		
		public void push(Object obj) { 
			if (size() == capacity){
				System.out.println("ERROR.Stack is full. The push method is impossible");
			}else{
				top++;
				arr[top] = obj; 
			}	
		} 
		public Object top() { 
			if (isEmpty()) {
				System.out.println("ERROR.Stack is empty.");
				String error = "ERROR";
				return error;
			} else{
				return arr[top]; 
			}
		} 
		public Object pop(){ 
			Object elem; 
			if (isEmpty()) {
				System.out.println("ERROR.Stack is empty.");
				String error = "ERROR";
				return error;
			}
			elem = arr[top]; 
			arr[top] = null; 
			top--;
			return elem; 
		}
	}