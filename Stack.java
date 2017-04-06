package talyakina;
public class Stack {
	private int size;
	 
	//последний ячейка
	private Node top; 

	//конструктор создает пустой стек
	public Stack() { 
		size = 0;
		top = null;
	} 
	
	public int size() { 
		return size; 
	} 

	public boolean isEmpty() { 
		if(top == null){
			return true;
		}else{
			return false;
		}
	} 
	
	//добавление
	public void push(int obj) {
		Node el = new Node(obj, top);
		top = el;
		size++;
	}

	//забираем
	public int top() throws Exception{ 
		if (isEmpty()) {
			throw new Exception("Error. Stack is empty");
		} else{
			return top.getElement(); 
		}
	} 

	// забираем элемент и удаляем 
	public int pop() throws Exception {
		int oldElem;
		if (isEmpty()) {
			throw new Exception("Error. Stack is empty");
		} else {
			oldElem = top.getElement();
			top = top.getPrevEl();
			size--;
			return oldElem;
		}
	}
}
