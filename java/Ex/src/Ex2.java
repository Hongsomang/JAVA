import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int result = 0;
	
		Scanner s=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		a=s.nextInt();
		System.out.println("기호를 고르세요 1.더하기 2.빼기 3.곱하기 4.나누기");
		b=s.nextInt();
		System.out.println("숫자를 입력하세요");
		c=s.nextInt();
		if(b==1){
			result=a+c;
			
		}
		else if(b==2){
			result=a-c;
			
		}
		else if(b==3){
			result=a*c;
			
		}
		else if(b==4){
			result=a/c;
			
		}
		System.out.println(result);
	}

}
