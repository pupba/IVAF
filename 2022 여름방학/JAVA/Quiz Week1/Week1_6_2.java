package IVAF_JAVA_정광원_Week1;

import java.util.Scanner;

public class Week1_6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학과,학번,이름 형식으로 입력하세요 --> ");
		String[] str = sc.nextLine().split(",");
		System.out.print("학과: ");
		System.out.print(str[0]+" ,");
		System.out.print("학번: ");
		System.out.print(str[1]+" ,");
		System.out.print("이름: ");
		System.out.print(str[2]);
		System.out.println("");
		sc.close();
	}

}
