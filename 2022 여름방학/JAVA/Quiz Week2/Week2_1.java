package IVAF_JAVA_정광원_Week2;

import java.util.Scanner;

public class Week2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=1;i<=arr.length;i++) {
			System.out.print(i+"번 쨰 정수를 입력하시오. --> ");
			arr[i-1] = sc.nextInt();
		}
		System.out.println("입력 완료...");
		int result = 0;
		for(int ele : arr)
			result +=ele;
		System.out.println("총 합은 "+result+"입니다.");
		sc.close();
	}

}
