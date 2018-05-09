package Module3;


public class Calculator {
	public static double add(double a, double b) {
		double result=0;
		result=a+b;
		System.out.println(a + "+" + b + " = " + result);
		return result;
	}
	public static double minus(double a, double b) {
		double result=0;
		result=a-b;
		System.out.println(a + "-" + b + " = " + result);
		return result;
	}
	public static double div(double a, double b) {
		double result=0;
		result=a/b;
		System.out.println(a + "/" + b + " = " + result);
		return result;
	}
	
	public static double mult(double a, double b) {
		double result=0;
		result=a*b;
		System.out.println(a + "*" + b + " = " + result);
		return result;
	}
	double mSave(double result){
		System.out.println(result);
		return result;
	}
	double mClear(double result){
		result=0;
		System.out.println(result);
		return result;
	}
	double mPlus(double result, double a){
		result+=a;
		System.out.println(result);
		return result;
		
	}
	double mMinus(double result, double a){
		result-=a;
		System.out.println(result);
		return result;
	}
	public static double calc(double a, double b, String operation) {
		double result=0;
		switch(operation) {
		case "+":
			result=a+b;
			System.out.println(a + "*" + b + " = " + result);
			break;
		case "-":
			result=a-b;
			System.out.println(a + "*" + b + " = " + result);
			break;
		case "*":
			result=a*b;
			System.out.println(a + "*" + b + " = " + result);
			break;
		case "/":
			result=a/b;
			System.out.println(a + "*" + b + " = " + result);
			break;
		}
		return result;
		
	}
	
	
}
