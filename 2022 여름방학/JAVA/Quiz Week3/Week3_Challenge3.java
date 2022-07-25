package IVAF_JAVA_정광원_Week3;
interface Calc<E>{
	abstract public E operation(E x,E y,char op);
}
class Calc_int implements Calc<Integer>{
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
class Calc_double implements Calc<Double>{
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
public class Week3_Challenge3 {

	public static void main(String[] args) {
		Calc_int i = new Calc_int();
		Calc_double d = new Calc_double();
		System.out.println(i.operation(10, 20, '*'));
		System.out.println(d.operation(20.0, 5.0, '/'));
	}

}
