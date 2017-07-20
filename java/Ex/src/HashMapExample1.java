import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("½Å¿ë±Ç",85);
		map.put("È«±æµ¿",90);
		map.put("µ¿Àå±º",80);
		map.put("È«±æµ¿",95);
		
		System.out.println("ÃÑEmtry:"+map.size());
		
		System.out.println("\tÈ«±æµ¿:"+map.get("È«±æµ¿"));
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
		map.remove("È«±æµ¿");
		System.out.println("ÃÑ Entry ¼ö:"+map.size());
	}



}
