package IVAF_JAVA_정광원_Week2;

public class Week2_Challenge3 {

	public static void main(String[] args) {
		Novice user[] = new Novice[6];
		user[0] = new User1();
		User1 A = (User1)user[0];
		A.bash();
		A.slash();
		user[1] = new User2();
		User2 B = (User2)user[1];
		B.doubleJump();
		B.doubleShot();
		user[2] = new User3();
		User3 C = (User3)user[2];
		C.doubleThrow();
		C.stealth();
		user[3] = new User4();
		User4 D = (User4)user[3];
		D.blink();
		D.magicMissile();
		user[4] = new User5();
		User5 E = (User5)user[4];
		E.attack();
		user[5] = new FlameWizard();
		FlameWizard F = (FlameWizard)user[5];
		F.blink();F.magicMissile();
		F.flameBuster();F.firewall();
	}

}
