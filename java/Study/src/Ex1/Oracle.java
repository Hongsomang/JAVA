package Ex1;

public class Oracle implements DB {
	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ�� ���� ");
	}

	@Override
	public void runTransaction() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ ����");
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ�� ����");
	}
	
}
