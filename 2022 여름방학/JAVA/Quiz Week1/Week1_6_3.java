package IVAF_JAVA_정광원_Week1;

import java.util.Scanner;
import java.util.Random;
public class Week1_6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		System.out.print("1~10 사이의 숫자 1개를 입력하시오--> ");
		int n = sc.nextInt();
		int pre=0;
		int count=0;
		while(true) {
			pre = rand.nextInt(9)+1;
			if(pre==n)
				break;
			count++;
		}
		System.out.println(count+"번 만에 찾았습니다.");
		sc.close();
	}

}
