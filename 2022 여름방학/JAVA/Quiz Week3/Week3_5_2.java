package IVAF_JAVA_정광원_Week3;
import java.util.*;
class MyHashMap<Key,Value>{
	private ArrayList <Key> a1 = new ArrayList<Key>();
	private ArrayList <Value> a2 = new ArrayList<Value>();
	public void put(Key key, Value value) {
		System.out.println("Key --> "+key);
		System.out.println("Value --> "+value);
		this.a1.add(key);
		this.a2.add(value);
		System.out.println("Complete!!");
	}
	public Value get(Key key) {
		int n = (int)key;
		return this.a2.get(n);
	}
}
public class Week3_5_2 {

	public static void main(String[] args) {
		MyHashMap<Integer,String> hm = new MyHashMap<Integer,String>();
		String st[] = {"h","e","l","l","o"};
		for(int i=0;i<5;i++)
			hm.put(i,st[i]);
		for(int i=0;i<5;i++) 
			System.out.print(hm.get(i));
		System.out.println("");
	}

}
