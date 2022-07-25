package IVAF_JAVA_정광원_Week3;
import java.util.*;
public class Week3_5_1 {

	public static void main(String[] args) {
		ArrayList <Integer>keys = new ArrayList<Integer>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		for(int i=0;i<10;i++)
			keys.add(i);
		Scanner sc = new Scanner(System.in);
		for(Integer key: keys) {
			System.out.print("Key "+key+"'s value --> ");
			hm.put(key, sc.next());
		}
		sc.close();
		Set<Integer> keyset = hm.keySet();
		for(Integer i :keyset)
			System.out.println("key "+i+"'s value --> "+hm.get(i));

	}

}
