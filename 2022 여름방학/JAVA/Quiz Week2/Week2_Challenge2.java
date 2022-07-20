package IVAF_JAVA_정광원_Week2;

class User1 implements Novice,Worrior{
	protected int LEVEL;
	protected int HP;
	protected int MP;
	protected int STR;
	protected int DEX;
	protected int INT;
	protected int LUK;
	User1(){
		this.LEVEL = 1;
		this.HP = Novice.HP + Worrior.HP_UP;
		this.MP = Novice.MP + Worrior.MP_UP;
		this.STR = Novice.STR + Worrior.STR_UP;
		this.DEX = Novice.DEX + Worrior.DEX_UP;
		this.INT = Novice.INT;
		this.LUK = Novice.LUK;
	}
	@Override
	public int attack() {return this.STR * 1 + this.LEVEL;}
	@Override
	public int bash() {
		this.MP -= 10;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("배쉬!!");
			return this.STR * 5 * this.LEVEL;
		}
	}
	@Override
	public int slash() {
		this.MP -= 5;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("슬래쉬!!");
			return this.STR * 10 * this.LEVEL;		
		}
	}
}
class User2 implements Novice,Archer{
	protected int LEVEL;
	protected int HP;
	protected int MP;
	protected int STR;
	protected int DEX;
	protected int INT;
	protected int LUK;
	User2(){
		this.LEVEL = 1;
		this.HP = Novice.HP + Archer.HP_UP;
		this.MP = Novice.MP + Archer.MP_UP;
		this.STR = Novice.STR + Archer.STR_UP;
		this.DEX = Novice.DEX + Archer.DEX_UP;
		this.INT = Novice.INT;
		this.LUK = Novice.LUK;
	}
	@Override
	public int attack() {return (this.STR/2) * (this.DEX/2) * 1 + this.LEVEL;}
	@Override
	public int doubleShot() {
		this.MP -= 10;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("더블 샷!!");
			return this.DEX * 4 * 2 * this.LEVEL;
		}
	}
	@Override
	public int doubleJump() {
		this.MP -= 4;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("더블 점프!!");
			return 2;
		}
	}
}
class User3 implements Novice,Thief{
	protected int LEVEL;
	protected int HP;
	protected int MP;
	protected int STR;
	protected int DEX;
	protected int INT;
	protected int LUK;
	User3(){
		this.LEVEL = 1;
		this.HP = Novice.HP + Thief.HP_UP;
		this.MP = Novice.MP + Thief.MP_UP;
		this.STR = Novice.STR;
		this.DEX = Novice.DEX + Thief.DEX_UP;
		this.INT = Novice.INT;
		this.LUK = Novice.LUK + Thief.LUK_UP;
	}
	@Override
	public int attack() {return (this.DEX/2) * (this.LUK/2) * 1 + this.LEVEL;}
	@Override
	public int doubleThrow() {
		this.MP -= 10;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("더블 쓰로우!!");
			return (this.DEX/2) * (this.LUK) * 5 * this.LEVEL;
		}
	}
	@Override
	public int stealth() {
		this.MP -= 8;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("은신!!");
			return this.LUK * 10;
		}
	}
}
class User4 implements Novice,Wizard{
	protected int LEVEL;
	protected int HP;
	protected int MP;
	protected int STR;
	protected int DEX;
	protected int INT;
	protected int LUK;
	User4(){
		this.LEVEL = 1;
		this.HP = Novice.HP + Wizard.HP_UP;
		this.MP = Novice.MP + Wizard.MP_UP;
		this.STR = Novice.STR;
		this.DEX = Novice.DEX;
		this.INT = Novice.INT + Wizard.INT_UP;
		this.LUK = Novice.LUK + Wizard.LUK_UP;
	}
	@Override
	public int attack() {return this.INT + this.LEVEL;}
	@Override
	public int magicMissile() {
		this.MP -= 10;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("매직 미사일!!");
			return this.INT * 10 * this.LUK/2 + this.LEVEL;
		}
	}
	@Override
	public int blink() {
		this.MP -= 8;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("블링크!!");
			return this.INT * 2;
		}
	}
}
class User5 implements Novice{
	protected int LEVEL;
	protected int HP;
	protected int MP;
	protected int STR;
	protected int DEX;
	protected int INT;
	protected int LUK;
	User5(){
		this.LEVEL = 1;
		this.HP = Novice.HP;
		this.MP = Novice.MP;
		this.STR = Novice.STR;
		this.DEX = Novice.DEX;
		this.INT = Novice.INT;
		this.LUK = Novice.LUK;
	}
	@Override
	public int attack() {return this.STR*1+this.LEVEL;}
}
class FlameWizard extends User4{
	final int FWINT_UP = 20;
	final int FWMP_UP = 50;
	FlameWizard(){
		this.LEVEL = 30;
		this.HP = Novice.HP + Wizard.HP_UP * this.LEVEL;
		this.MP = Novice.MP + Wizard.MP_UP * this.LEVEL + 200;
		this.STR = Novice.STR * this.LEVEL;
		this.DEX = Novice.DEX * this.LEVEL;
		this.INT = Novice.INT + Wizard.INT_UP * this.LEVEL + 50;
		this.LUK = Novice.LUK + Wizard.LUK_UP * this.LEVEL;
	}
	public int flameBuster() {
		this.MP -= 50;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("플레임 버스터!");
			return this.INT * 80 * this.LEVEL;
		}
	}
	public int firewall() {
		this.MP -= 30;
		if(this.MP < 0) {
			System.out.println("MP가 부족합니다.");
			this.MP = 0;
			return -1;
		}
		else {
			System.out.println("파이어 월!");
			return this.INT * 50 * this.LEVEL;
		}
	}
}