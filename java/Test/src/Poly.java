import java.util.*;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar=null;
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		switch(key){
			case 1:
				mycar=new CompactCar();
				System.out.println("������ ���� �Ǿ����ϴ�.");
				break;
				
			case 2:
				mycar=new Sedan();
				System.out.println("������ ���� �Ǿ����ϴ�.");
				break;
				
			case 3:
				mycar=new SportsCar();
				System.out.println("������ī�� ���� �Ǿ����ϴ�.");
				break;
		}
		int currentSpeed=mycar.speedUp();
		System.out.println(currentSpeed);
	}

}
