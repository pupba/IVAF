package calculator;

public class Test {

	public static void main(String[] args) {
		Calc_int i = new Calc_int();
		Calc_double d = new Calc_double();
		System.out.println(i.operation(10, 20, '*'));
		System.out.println(d.operation(20.0, 5.0, '/'));
	}

}
