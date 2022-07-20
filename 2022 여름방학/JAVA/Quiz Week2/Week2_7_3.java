package IVAF_JAVA_정광원_Week2;
class Adam extends ProtoTypeRobot{
	final String NAME = "Adam";
	Adam(){
		System.out.println("반갑습니다. 사용자 저는 "+NAME+" 입니다.");
	}
	public void attack(String target) {
		System.out.println("목표--> "+target+"를 공격합니다.");
		this.see(target);
		this.armUp();
		System.out.println("공격!");
		this.armDown();
		System.out.println("공격을 종료합니다.");
	}
	public void bye() {
		this.armUp();
		System.out.println("안녕히가십시오.");
		this.armDown();
	}
}
class Eve extends ProtoTypeRobot{
	final String NAME = "Eve";
	Eve(){
		System.out.println("반갑습니다. 사용자 저는 "+NAME+" 입니다.");
	}
	public void move(String target,int distance) {
		System.out.println(target+"까지 이동합니다.");
		this.see(target);
		System.out.println(target+"까지의 거리는 "+distance+" 입니다.");
		System.out.println("이동 시작");
		for(int i=0;i<distance;i++) {
			this.legUp();
			this.legDown();
		}
		System.out.println("도착 완료!!\n대기합니다.");
	}
	public void bye() {
		this.armUp();
		System.out.println("안녕히가십시오.");
		this.armDown();
	}
}
