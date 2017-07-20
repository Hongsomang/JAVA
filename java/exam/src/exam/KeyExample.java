package exam;

import java.util.*;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<key,String> hashMap= new HashMap<key, String>();
		
		hashMap.put(new key(1), "ȫ�浿");
		
		String value=hashMap.get(new key(1));
		System.out.println(value);
		
		Object obj=new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}

}
      