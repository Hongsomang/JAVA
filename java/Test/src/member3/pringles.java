package member3;

public class pringles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack s=new Snack();
		s.setKind("감자칩");
		s.setName("프링글스");
		s.setPrice(3500);
		System.out.println("과자이름:"+s.getName()+"과자 종류:"+s.getKind()+"가격:"+s.getPrice());
	}

}
