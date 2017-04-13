

	public class Triangle implements Figure{
	    private int a, b, c, h;

	   // public Triangle(int a, int b, int c, int h) {
	  //      setTriangle(a, b, c, h);
	   // }

	    public void setTriangle(int a, int b, int c, int h)  {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.h = h;
	    }

	    
	    public int getS() {
	    	int result = (a*h)/2;
	        return result;	        
	    }
	    public int getP() {
	    	int result = a+b+c;
	        return result;	   
	    }
	}

