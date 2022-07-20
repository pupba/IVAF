package IVAF_JAVA_정광원_Week2;

class MyCar3{
	boolean status;
	int speed;
	static int count = 0;
	MyCar3(){
		this.speed = 0;
		this.status = false;
		count ++;
	}
	MyCar3(int speed){
		this.status = false;
		this.speed = speed;
		count ++;
	}
	public void turnOn() {this.status = true;}
	public void turnOff() {this.status = false;}
	static public int returnCarCount() {return count;}
}
public class Week2_3_1 {
	public static void main(String[] args) {
		
	}

}
