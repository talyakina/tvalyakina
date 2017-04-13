
public class Circle implements Figure {
	private int a;
	private static final double PI = 3.14;
	public void setCircle(int a, double PI)  {
        this.a = a;
    }

    
    public int getS() {
    	int result =  (int)Math.round(PI)*a*a;
        return result;	        
    }
    public int getP() {
    	int result = 2*(int)Math.round(PI)*a;
        return result;	   
    }
}
