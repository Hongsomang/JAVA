import java.util.*;

public class TreeMapRxample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> scores=new TreeMap<Integer,String>();
		scores.put(new Integer(87),"ȫ�浿");
		scores.put(new Integer(98),"�̵���");
		scores.put(new Integer(75),"�ڱ��");
		scores.put(new Integer(95),"�ſ��");
		scores.put(new Integer(90),"���ڹ�");
		Map.Entry<Integer, String> entry=null;
		Integer score=null;
		 entry=scores.firstEntry();
		 System.out.println("���峷�� ����:"+score);
		 entry=scores.lastEntry();
		 System.out.println("���� ���� ����:"+score+"\n"); 
		 entry=scores.lowerEntry(new Integer(95));
		 System.out.println("95�� �Ʒ� ����:"+score);
		entry=scores.higherEntry(new Integer(95));
		 System.out.println("95�� ���� ����:"+score);
		 entry=scores.floorEntry(new Integer(95));
		 System.out.println("95�� �̰ų� �ٷ� �Ʒ�����:"+score);
		 entry=scores.ceilingEntry(new Integer(85));
		 System.out.println("85���̰ų� �ٷ� ���� ����:"+score);
		  while(!scores.isEmpty()){
			  entry=scores.pollFirstEntry();
			  System.out.println();
			
		  }

	}
}