package Module3;


public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(4, 2);
		calculator.mPlus(calculator.add(5, 2), 1);
		calculator.mClear(calculator.mPlus(calculator.add(5, 2), 1));

	}

}
