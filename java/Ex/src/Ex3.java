import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("�⵵�� �Է����ּ���");
		a=s.nextInt();
		if(a%4==0&&(a%100!=0||a%400==0)){
			
			System.out.println("�����Դϴ�.");
		}
		else{
			System.out.println("������ �ƴմϴ�.");
		}
		
				
	}

}
