package IVAF_JAVA_정광원_Week2;

class MyCar2{
	boolean status;
	int speed;
	MyCar2(){
		this.speed = 0;
		this.status = false;
	}
	MyCar2(int speed){
		this.status = false;
		this.speed = speed;
	}
	public void turnOn() {this.status = true;}
	public void turnOff() {this.status = false;}
}
public class Week2_2_2 {
	public static void main(String[] args) {
		
	}

}
