package IVAF_JAVA_정광원_Week1;

import java.util.Scanner;

public class Week1_6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자(+,-,*,/,%)--> ");
		char op = sc.next().charAt(0);
		System.out.print("숫자1--> ");
		int n1 = sc.nextInt();
		System.out.print("숫자2--> ");
		int n2 = sc.nextInt();
		switch(op) {
		case '+':System.out.println(n1+" + "+n2+" = "+(n1+n2));break;
		case '-':System.out.println(n1+" - "+n2+" = "+(n1-n2));break;
		case '*':System.out.println(n1+" * "+n2+" = "+(n1*n2));break;
		case '/':System.out.println(n1+" / "+n2+" = "+(n1/n2));break;
		case '%':System.out.println(n1+" % "+n2+" = "+(n1%n2));break;
		}
		sc.close();
	}

}
