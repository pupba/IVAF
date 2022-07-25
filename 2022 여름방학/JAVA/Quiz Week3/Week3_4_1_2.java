package IVAF_JAVA_정광원_Week3;

import java.util.Scanner;

class Calculator<E> implements Cal<E>{
	@Override
	public char operation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pick op");
		System.out.println("1. +, 2. -, 3. *, 4. /, 5. %");
		System.out.print("--> ");
		int op = sc.nextInt();
		char return_c='.';
		switch(op) {
		case 1:return_c = PLUS;break;
		case 2:return_c = MINUS;break;
		case 3:return_c = MUL;break;
		case 4:return_c =  DIV;break;
		case 5:return_c =  MOD;break;
		}
		return return_c;
	}
}
public class Week3_4_1_2 {

}
