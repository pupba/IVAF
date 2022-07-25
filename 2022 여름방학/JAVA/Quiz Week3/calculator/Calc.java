package calculator;

public interface Calc<E> {
	abstract public E operation(E x,E y,char op);
}
