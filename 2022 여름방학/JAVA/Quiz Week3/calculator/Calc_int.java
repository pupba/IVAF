package calculator;

public class Calc_int implements Calc<Integer>{
	@Override
	public Integer operation(Integer x, Integer y, char op) {
		Integer result = 0;
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
