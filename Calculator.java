
public class Calculator {
	public String expression;

	public Calculator(String exp) {
		expression = exp;

	}

	public void setExpression(String exp) {
		expression = exp;
	}

	public int calculate() {
		int result = 0;
		String first = "";
		String second = "";
		char znak = 0;
		boolean findSign = false;
		for (int i = 0; i < expression.length(); i++) {
			char symb = expression.charAt(i);
			do {
				if (findSign == true) {
					if (symb != '+' && symb != '-' && symb != '/' && symb != '*') {
						second += symb;
					}
					i++;
				} else {
					if (symb != '+' && symb != '-' && symb != '/' && symb != '*') {
						first += symb;
					}
					if (symb == '+' || symb == '-' || symb == '/' || symb == '*') {
						znak += symb;
						findSign = true;
					}
					i++;

				}
				if (i < expression.length()) {
					symb = expression.charAt(i);
				}

			} while (i < expression.length());
		}
		switch (znak) {
		case '*':
			result = Integer.parseInt(first) * Integer.parseInt(second);
			break;
		case '/':
			result = Integer.parseInt(first) / Integer.parseInt(second);
			break;
		case '+':
			result = Integer.parseInt(first) + Integer.parseInt(second);
			break;
		case '-':
			result = Integer.parseInt(first) - Integer.parseInt(second);
			break;
		}
		return result;

	}
}
