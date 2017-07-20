package deep;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i= new Integer(10);
		Double d=new Double(10.1);
		
		System.out.println(i);
		System.out.println(d);
		
		i=new Integer(i.intValue()+28);
		d=new Double(d.doubleValue()+0.4);
		System.out.println(i);
		System.out.println(d);
	}

}
