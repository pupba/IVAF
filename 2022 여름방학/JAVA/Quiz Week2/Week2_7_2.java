package IVAF_JAVA_정광원_Week2;

class ProtoTypeRobot implements Head,Arms,Body,Legs{
	@Override
	public void see(String object) {
		System.out.println(object+"가 보입니다.");
	}
	@Override
	public void spinHead() {
		System.out.println("머리 회전");
		System.out.println(HEAD_LOCATION+" -> 90도 회전");
	}
	@Override
	public void armUp() {
		System.out.println("손을 듭니다.");
	}
	@Override
	public void armDown() {
		System.out.println("손을 내립니다.");
	}
	@Override
	public void spinBody() {
		System.out.println("몸을 돌립니다.");
	}
	@Override
	public void hugry() {
		System.out.println("배터리가 부족합니다...");
	}
	@Override
	public void legUp() {
		System.out.println("다리를 듭니다.");
	}
	@Override
	public void legDown() {
		System.out.println("다리를 내립니다.");
	}
}
