package Ex1;

public class DB2 implements DB {
	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("DB2에 접속");
	}

	@Override
	public void runTransaction() {
		// TODO Auto-generated method stub
		System.out.println("DB2에 연결");
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("DB2에 저장");
	}
}
