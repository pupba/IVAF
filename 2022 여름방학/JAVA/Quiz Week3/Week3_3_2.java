package IVAF_JAVA_정광원_Week3;

import java.io.*;

public class Week3_3_2 {
	public static void error1() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	public static void error2() throws StreamCorruptedException{
		throw new StreamCorruptedException();
	}
	public static void error3() throws InterruptedIOException{
		throw new InterruptedIOException();
	}	
	public static void main(String[] args) {
		try {
			error1();
			error2();
			error3();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (StreamCorruptedException e) {
			System.err.println("StreamCorrupted 에러");
		} catch (InterruptedIOException e) {
			System.err.println("IO 인터럽트 에러");
		}
	}

}
