import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int result = 0;
	
		Scanner s=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		a=s.nextInt();
		System.out.println("��ȣ�� ������ 1.���ϱ� 2.���� 3.���ϱ� 4.������");
		b=s.nextInt();
		System.out.println("���ڸ� �Է��ϼ���");
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
