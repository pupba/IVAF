package IVAF_JAVA_정광원_Week3;
interface Sub{
	abstract void opSub(int n1,int n2);
}
public class Week3_6 {

	public static void main(String[] args) {
		Sub b = (int n1,int n2)->{
			System.out.println(n1+" - "+n2+" = "+(n1-n2));
		};
		b.opSub(10, 5);
	}
}
