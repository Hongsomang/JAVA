import java.util.*;

public class TreeMapRxample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> scores=new TreeMap<Integer,String>();
		scores.put(new Integer(87),"홍길동");
		scores.put(new Integer(98),"이동수");
		scores.put(new Integer(75),"박길순");
		scores.put(new Integer(95),"신용권");
		scores.put(new Integer(90),"김자바");
		Map.Entry<Integer, String> entry=null;
		Integer score=null;
		 entry=scores.firstEntry();
		 System.out.println("가장낮은 점수:"+score);
		 entry=scores.lastEntry();
		 System.out.println("가장 높은 점수:"+score+"\n"); 
		 entry=scores.lowerEntry(new Integer(95));
		 System.out.println("95점 아래 점수:"+score);
		entry=scores.higherEntry(new Integer(95));
		 System.out.println("95점 위의 점수:"+score);
		 entry=scores.floorEntry(new Integer(95));
		 System.out.println("95점 이거나 바로 아래점수:"+score);
		 entry=scores.ceilingEntry(new Integer(85));
		 System.out.println("85점이거나 바로 위의 점수:"+score);
		  while(!scores.isEmpty()){
			  entry=scores.pollFirstEntry();
			  System.out.println();
			
		  }

	}
}