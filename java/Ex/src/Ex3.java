import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("년도를 입력해주세요");
		a=s.nextInt();
		if(a%4==0&&(a%100!=0||a%400==0)){
			
			System.out.println("윤년입니다.");
		}
		else{
			System.out.println("윤년이 아닙니다.");
		}
		
				
	}

}
