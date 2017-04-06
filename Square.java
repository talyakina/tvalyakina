

 public class Square implements Figure {
	
	    private int a;
	    private int b;
		public void setSquare(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }	   
	    public int  getS() {
	        int result = a*b;
	        return result;
	    }  
		public int getP() {
			 int result = 4*a ;
		        return result;
		}
	}

