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
				System.out.println("경차가 선택 되었습니다.");
				break;
				
			case 2:
				mycar=new Sedan();
				System.out.println("세단이 선택 되었습니다.");
				break;
				
			case 3:
				mycar=new SportsCar();
				System.out.println("스포츠카가 선택 되었습니다.");
				break;
		}
		int currentSpeed=mycar.speedUp();
		System.out.println(currentSpeed);
	}

}
