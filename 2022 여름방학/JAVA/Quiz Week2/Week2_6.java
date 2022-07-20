package IVAF_JAVA_정광원_Week2;

abstract class MyCar5{
	boolean status;
	int speed;
	static int count = 0;
	MyCar5(){
		this.speed = 0;
		this.status = false;
		count ++;
	}
	MyCar5(int speed){
		this.status = false;
		this.speed = speed;
		count ++;
	}
	abstract public void turnOn();
	abstract public void turnOff();
	static public int returnCarCount() {return count;}
}

class Benz extends MyCar5{
	private String brandName;
	private String carName;
	private int price;
	Benz(){
		this.brandName = "Benz";
	}
	public void initCar(String carName,int speed,int price) {
		super.speed = speed;
		this.carName = carName;
		this.price = price;
	}
	@Override
	public void turnOn() {
		super.status = true;
		System.out.println(this.carName+", 시동이 켜집니다. 좋은 운전 되세요.");
	}
	@Override
	public void turnOff() {
		super.status = false;
		System.out.println(this.carName+", 시동이 꺼집니다. 수고하셨습니다.");
	}
}
class Lamborghini extends MyCar5{
	private String brandName;
	private String carName;
	private int price;
	Lamborghini(){
		this.brandName = "Lamborghini";
	}
	public void initCar(String carName,int speed,int price) {
		super.speed = speed;
		this.carName = carName;
		this.price = price;
	}
	@Override
	public void turnOn() {
		super.status = true;
		System.out.println(this.carName+", 시동이 켜집니다. 좋은 운전 되세요.");
	}
	@Override
	public void turnOff() {
		super.status = false;
		System.out.println(this.carName+", 시동이 꺼집니다. 수고하셨습니다.");
	}
}
class Genesis extends MyCar5{
	private String brandName;
	private String carName;
	private int price;
	Genesis(){
		this.brandName = "Genesis";
	}
	public void initCar(String carName,int speed,int price) {
		super.speed = speed;
		this.carName = carName;
		this.price = price;
	}
	@Override
	public void turnOn() {
		super.status = true;
		System.out.println(this.carName+", 시동이 켜집니다. 좋은 운전 되세요.");
	}
	@Override
	public void turnOff() {
		super.status = false;
		System.out.println(this.carName+", 시동이 꺼집니다. 수고하셨습니다.");
	}
}


public class Week2_6 {

	public static void main(String[] args) {
		MyCar5[] cars = new MyCar5[5];
		cars[0] = new Genesis();
		Genesis gv80 = (Genesis)cars[0];
		gv80.initCar("gv80", 240, 6100);
		gv80.turnOn();
		cars[1] = new Genesis();
		Genesis gv60 = (Genesis)cars[1];
		gv60.initCar("gv60", 240, 6200);
		gv60.turnOn();
		cars[2] = new Benz();
		Benz s580 = (Benz)cars[2];
		s580.initCar("s580", 240, 26060);
		s580.turnOff();
		cars[3] = new Benz();
		Benz amgGT = (Benz)cars[3];
		amgGT.initCar("AMG-GT", 240, 13760);
		amgGT.turnOff();
		cars[4] = new Lamborghini();
		Lamborghini aventador = (Lamborghini)cars[4];
		aventador.initCar("Aventador", 300, 57730);
		aventador.turnOn();
	}

}
