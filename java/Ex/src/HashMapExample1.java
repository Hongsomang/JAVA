import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("�ſ��",85);
		map.put("ȫ�浿",90);
		map.put("���屺",80);
		map.put("ȫ�浿",95);
		
		System.out.println("��Emtry:"+map.size());
		
		System.out.println("\tȫ�浿:"+map.get("ȫ�浿"));
		System.out.println();
		
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()){
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key+":"+value);
			
		}System.out.println();
		Set<Map.Entry<String, Integer>>entrySet=map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIteratior=entrySet.iterator();
		while(entryIteratior.hasNext()){
			//Map.Entry<String, Integer> entry= entryIteratior;
			//String key=entry.getKey();
			//Integer value=entry.getValue();
			//System.out.println("\t"+key+":"+value);
			
		}System.out.println();
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��:"+map.size());
	}



}
