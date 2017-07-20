import java.util.*;

public class TreeMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(new Integer(87),"홍길동");
		map.put(new Integer(98),"이동순");
		map.put(new Integer(75),"박길순");
		map.put(new Integer(95),"신용권");
		map.put(new Integer(80),"김자바");
	
		NavigableMap<Integer,String> descendingMap=map.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet=descendingMap.entrySet();
		for(Map.Entry<Integer, String>entry: descendingEntrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue()+" ");
		}
		System.out.println();
		
		NavigableMap<Integer,String> ascendingMap=descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet=ascendingMap.entrySet();
		for(Map.Entry<Integer, String>entry: ascendingEntrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue()+" ");
		}
	}

}
