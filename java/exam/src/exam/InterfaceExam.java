package exam;
interface Afunction{
	void searchInform(String name, int phoneNum);
	void runService(int memberId, int request);
}
class AfunctionImpl implements Afunction{

	@Override
	public void searchInform(String name, int phoneNum) {
		// TODO Auto-generated method stub
		System.out.println(name+"고객늼의 정보를 찾았습니다");
	}

	@Override
	public void runService(int memberId, int request) {
		// TODO Auto-generated method stub
		System.out.println(memberId+"고객님이 요청하신 서비스를 수행합니다.");
	}
	
}
public class InterfaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Afunction aref=new AfunctionImpl();
		
		aref.searchInform("도꺠비",0101112222);
		aref.runService(100, 1);
	}

}
