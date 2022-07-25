package IVAF_JAVA_정광원_Week3;

import java.util.Scanner;

class Program extends Calculator<Integer> {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("n1--> ");
		int n1 = sc.nextInt();
		System.out.print("n2--> ");
		int n2 = sc.nextInt();
		char con = super.operation();
		int result=0;
		switch(con) {
		case '+':result = n1+n2;break;
		case '-':result = n1-n2;break;
		case '*':result = n1*n2;break;
		case '/':result = n1/n2;break;
		case '%':result = n1%n2;break;
		}
		System.out.print(n1+" "+con+" "+n2+" = "+result);
		sc.close();
	}
}
public class Week3_4_1_3 {
	public static void main(String args[]) {
		Program p = new Program();
		p.run();
	}
}
