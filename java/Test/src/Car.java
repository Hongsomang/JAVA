
public class Car {
	int speed=0;
	public int speedUp(){
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
	public int speedUp(){
		return speed+30;
	}
}
