package member2;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit stroberry= Fruit.APPLE;
		Fruit apple=Fruit.APPLE;
		Fruit banana=Fruit.BANANA;
		String s=stroberry.name();
		String a=apple.name();
		String b=banana.name();
	

		System.out.println("과일 이름 :"+s);
		System.out.println("과일 이름 :"+a);
		System.out.println("과일 이름 :"+b);
		
		
	}

}
