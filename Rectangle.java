
public class Rectangle implements Figure {
	private int a;
	private int b;
	public void setRectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getS() {
		int result = a * b;
		return result;
	}

	public int getP() {
		int result = 2*a + 2*b;
		return result;
	}
}
