
public class CompareMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair<Integer,String> p1=new pair<Integer,String>(1,"사과");
		pair<Integer,String> p2=new pair<Integer,String>(1,"사과");
		boolean result1=Until.compare(p1, p2);
		if(result1){
			System.out.println("같음");
		}else{
			System.out.println("다름");
		}
		pair<Integer,String> p3=new pair<Integer,String>(1,"사과");
		pair<Integer,String> p4=new pair<Integer,String>(2,"사과");
		boolean result2=Until.compare(p3, p4);
		if(result2){
			System.out.println("같음");
		}else{
			System.out.println("다름");
		}
	}

}
