package talyakina;

public class Node {
	
		private int element;
		private Node prevEl;
		
		Node(int element,Node prevEl){
			this.element = element;
			this.prevEl = prevEl;
		}
		
		public int getElement(){
			return element;
		}
		public void setElement (int elementNew){
			element = elementNew;
		}
		public Node getPrevEl(){
			return prevEl;
		}
		public void setPrevEl (Node elNew){//нова €чейка
			prevEl = elNew;;
		}
	}


