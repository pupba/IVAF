package IVAF_JAVA_정광원_Week3;

import java.util.Scanner;

public class Week3_3_1 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
		    String[] container = new String[5];
		    for(int i = 0;i < 10; i++)
		        container[i] = scanner.next();
		    for(int i = 0;i < container.length; i++)
		        System.out.print(container[i]);
		    System.out.println("");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("배열의 최대 범위를 넘어갔습니다...");
		}
		finally {
			System.out.println("예외가 발생해도 출력된다!!");
		}
	}

}
