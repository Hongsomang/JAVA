import java.util.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student2, Integer> map=new HashMap<Student2, Integer>();
		map.put(new Student2(1,"È«±æµ¿"), 95);
		map.put(new Student2(1,"È«±æµ¿"), 95);
		System.out.println("ÃÑ Entry ¼ö:"+map.size());
	}

}
