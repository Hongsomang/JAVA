/*package exam;

import java.util.*;

class Car{
	int speed =0;
	public int speedUP(){
		return speed;
	}
	
}
class CompactCar extends Car{
	public int speedUP(){
	return speed+10;
	}
}
class Sedan extends Car{
	public int speedUP(){
		return speed+20;
	}
}
class SportsCar extends Car{
	public int speedUP(){
		return speed+30;
	}
}
public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar=null;
		Scanner input=new Scanner(System.in);
		int key= input.nextInt();
		switch(key){
		case 1:
			myCar=new CompactCar();
			System.out.println("������ ���õǾ����ϴ�.");
			break;
		case 2:
			myCar =new Sedan();
			System.out.println("������ ���õǾ����ϴ�.");
			break;
		case 3:
			myCar=new SportsCar();
			System.out.println("������ī�� ���� �Ǿ����ϴ�.");
		}
		int currentSpeed=myCar.speedUP();
		System.out.println("�����Ͻ� �ڵ����� ���� �ӵ���"+currentSpeed+"�Դϴ�");
	}

}
*/