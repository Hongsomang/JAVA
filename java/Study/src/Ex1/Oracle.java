package Ex1;

public class Oracle implements DB {
	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("오라클에 접족 ");
	}

	@Override
	public void runTransaction() {
		// TODO Auto-generated method stub
		System.out.println("오라클 연결");
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("오라클에 저장");
	}
	
}
