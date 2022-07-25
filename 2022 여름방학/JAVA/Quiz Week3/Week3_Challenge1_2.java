package IVAF_JAVA_정광원_Week3;
interface Sub2<E>{
	abstract void opSub(E n1,E n2[]);
}
public class Week3_Challenge1_2 {

	public static void main(String[] args) {
		Sub2<Double> sub_Double = (Double n1,Double n2[])->{
			System.out.print(n1);
			Double re = (Double)n1;
			for(Object n : n2) {
				System.out.print(" - "+n);
				re -=(Double)n;
			}
			System.out.println(" = "+re);
		};
		Double s[] = {1.2,1.2,4.2,5.0};
		sub_Double.opSub(10.1, s);
	}
}
