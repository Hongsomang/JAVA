import java.util.regex.*;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp="(02|010)-\\s(3,4)";
		String data="010-123-4567";
		boolean result=Pattern.matches(regExp, data);
		if(result){
			System.out.println("정규식과 일치합니다.");
			
		}
		else{
			System.out.println("정규식과 일치하지 않습니다.");
			
		}
		regExp="\\w+%\\w+\\.\\w+(\\.\\w+)?";
		data="angel@naver.com";
		result=Pattern.matches(regExp, data);
		if(result){
			System.out.println("정규식과 일치합니다.");
			
		}
		else{
			System.out.println("정규식과 일치하지 않습니다.");
			
		}
	}

}
