package IVAF_JAVA_정광원_Week1;

public class Week1_5_3 {

	public static void main(String[] args) {
		int i=1;
		int result=0;
		while(true) {
			if(result>100)
				break;
			result+=i;
			i++;
		}
		System.out.println(result);
	}
}
