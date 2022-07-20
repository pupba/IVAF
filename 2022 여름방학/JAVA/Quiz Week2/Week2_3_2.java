package IVAF_JAVA_정광원_Week2;

class MyCar4{
	boolean status;
	int speed;
	static int count = 0;
	MyCar4(){
		this.speed = 0;
		this.status = false;
		count ++;
	}
	MyCar4(int speed){
		this.status = false;
		this.speed = speed;
		count ++;
	}
	public void turnOn() {this.status = true;}
	public void turnOff() {this.status = false;}
	static public int returnCarCount() {return count;}
}
public class Week2_3_2 {
	public static void main(String[] args) {
		MyCar4 cars[] = new MyCar4[5];
		cars[0] = new MyCar4();
		cars[1] = new MyCar4(10);
		cars[2] = new MyCar4(20);
		cars[3] = new MyCar4();
		cars[4] = new MyCar4(30);
		System.out.println("차 개수는 "+MyCar4.returnCarCount()+"대 입니다.");
	}

}
