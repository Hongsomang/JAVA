package exam;
class Singletontest{
	private static Singletontest sgt=new Singletontest();
	private int cnt=0;
	private Singletontest(){};
	
	public static Singletontest getIntstance(){
		return sgt;
	}
	public int getNextInt(){
		return cnt+1;
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEx s=new SingletonEx();
		s.methodX();
		s.methodY();
		
	}
	public void methodX(){
		Singletontest st=Singletontest.getIntstance();
		int count=st.getNextInt();
		System.out.println(count);
	
	}
	public void methodY(){
		Singletontest st=Singletontest.getIntstance();
		int count=st.getNextInt();
		System.out.println(count);
	}

}
