package calculator;
public class Calc_double implements Calc<Double>{
	@Override
	public Double operation(Double x, Double y, char op) {
		Double result = 0.0;
		switch(op) {
		case '+':result=x+y;break;
		case '-':result=x-y;break;
		case '*':result=x*y;break;
		case '/':result=x/y;break;
		case '%':result=x%y;break;
		}
		return result;
	}
}
