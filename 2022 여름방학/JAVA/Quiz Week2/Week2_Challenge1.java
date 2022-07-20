package IVAF_JAVA_정광원_Week2;
interface Novice{ // 초보자
	final int HP = 50;
	final int MP = 50;
	final int STR = 5;
	final int DEX = 5;
	final int INT = 5;
	final int LUK = 5;
	abstract public int attack();
}
interface Worrior{
	final int HP_UP = 10;
	final int MP_UP = 5;
	final int STR_UP = 10;
	final int DEX_UP = 5;
	abstract public int bash();
	abstract public int slash();
}
interface Archer{
	final int HP_UP = 8;
	final int MP_UP = 7;
	final int STR_UP = 5;
	final int DEX_UP = 10;
	abstract public int doubleShot();
	abstract public int doubleJump();
}
interface Thief{
	final int HP_UP = 7;
	final int MP_UP = 8;
	final int DEX_UP = 7;
	final int LUK_UP = 8;
	abstract public int doubleThrow();
	abstract public int stealth();
}
interface Wizard{
	final int HP_UP = 5;
	final int MP_UP = 10;
	final int INT_UP = 11;
	final int LUK_UP = 4;
	abstract public int magicMissile();
	abstract public int blink();
}
