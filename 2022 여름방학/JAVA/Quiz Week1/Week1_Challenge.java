package IVAF_JAVA_정광원_Week1;

import java.util.Scanner;

public class Week1_Challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("운동 횟수 체크 프로그램");
		System.out.println("운동 선택");
		System.out.print("1. 윗몸일으키기, 2. 팔굽혀펴기, 3. 풀업 --> ");
		int n1 = sc.nextInt();
		System.out.print("세트 --> ");
		int set = sc.nextInt();
		System.out.print("개수 --> ");
		int count = sc.nextInt();
		int now=0;
		int setCheck=0;
		switch(n1) {
		case 1:System.out.print("윗몸일으키기 ");break;
		case 2:System.out.print("팔굽혀펴기 ");break;
		case 3:System.out.print("풀업 ");break;
		}
		System.out.println("Start!!");
		sc.nextLine();
		while(true) {
			if(setCheck == set)
				break;
			sc.nextLine();
			now++;
			System.out.println(now+"개");
			
			if((now%(count+1))==count) {
				now=0;
				setCheck++;
				System.out.println(setCheck+"세트!");
			}
		}
		System.out.println("운동 완료");
		sc.close();
	}

}
