package exam;
interface Afunction{
	void searchInform(String name, int phoneNum);
	void runService(int memberId, int request);
}
class AfunctionImpl implements Afunction{

	@Override
	public void searchInform(String name, int phoneNum) {
		// TODO Auto-generated method stub
		System.out.println(name+"������ ������ ã�ҽ��ϴ�");
	}

	@Override
	public void runService(int memberId, int request) {
		// TODO Auto-generated method stub
		System.out.println(memberId+"������ ��û�Ͻ� ���񽺸� �����մϴ�.");
	}
	
}
public class InterfaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Afunction aref=new AfunctionImpl();
		
		aref.searchInform("���ƺ�",0101112222);
		aref.runService(100, 1);
	}

}
