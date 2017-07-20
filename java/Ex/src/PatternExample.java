import java.util.regex.*;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp="(02|010)-\\s(3,4)";
		String data="010-123-4567";
		boolean result=Pattern.matches(regExp, data);
		if(result){
			System.out.println("���Խİ� ��ġ�մϴ�.");
			
		}
		else{
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
			
		}
		regExp="\\w+%\\w+\\.\\w+(\\.\\w+)?";
		data="angel@naver.com";
		result=Pattern.matches(regExp, data);
		if(result){
			System.out.println("���Խİ� ��ġ�մϴ�.");
			
		}
		else{
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
			
		}
	}

}
