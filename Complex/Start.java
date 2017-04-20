import java.util.Scanner;

public class Start {
	

	public static void main(String[] args) {
		System.out.println("Enter the first complex number");
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();		
		boolean findSign1 = false;
		String firstRe ="";
		String firstIm="";	
		for (int i = 0; i < first.length(); i++) {
			char symb = first.charAt(i);
			do {
				if (findSign1 == true) {
					if (symb != '+' && symb != '-'&& symb != 'i') {
						firstIm += symb;
					}
					i++;
				} else {
					if (symb != '+' && symb != '-') {
						firstRe += symb;
					}
					if (symb == '+') {						
						findSign1 = true;
					}
					if (symb == '-') {
						firstIm +=symb;
						findSign1 = true;
					}
					i++;

				}
				if (i < first.length()) {
					symb = first.charAt(i);
				}

			} while (i < first.length());
		}
	
	 
		System.out.println("Enter the second complex number");
		String second = sc.nextLine();
		boolean findSign2 = false;
		String secondRe = "";
		String secondIm = "";
		char secondZnak = 0;
		for (int i = 0; i < second.length(); i++) {
			char symb = second.charAt(i);
			do {
				if (findSign2 == true) {
					if (symb != '+' && symb != '-'&& symb != 'i') {
						secondIm += symb;
					}
					i++;
				} else {
					if (symb != '+' && symb != '-') {
						secondRe += symb;
					}
					if (symb == '+') {						
						findSign2 = true;
					}
					if (symb == '-') {
						secondIm +=symb;
						findSign2 = true;
					}
					i++;

				}
				if (i < second.length()) {
					symb = second.charAt(i);
				}

			} while (i < second.length());
		}
		System.out.println("Enter operation (+, -, * or /)");
		String operation = sc.nextLine();	
		Complex Complex = new Complex(firstRe, firstIm, secondRe,secondIm, operation );
    	String result = Complex.calculate();
    	System.out.println("Result:" + result);
    
	}

}
