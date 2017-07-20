package Ex2;

public class BixingMethidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer>box1=Util.<Integer>boxing(100);
		int intValue=box1.get();
		System.out.println(intValue);
		Box<String> box2=Util.boxing("ȫ�浿");
		String strValue=box2.get();
		System.out.println(strValue);
				}

}
