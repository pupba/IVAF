package IVAF_JAVA_정광원_Week3;
import testpackage.Test2;
class Test2_c implements Test2{
	@Override
	public void method1() {
		System.out.println("hello");
	}
	@Override
	public void method2(int n1) {
		System.out.println(n1);
	}
}
public class Week3_1_3_2{
	public static void main(String[] args) {
		Test2_c t = new Test2_c();
		t.method1();
		t.method2(2);
	}
}
