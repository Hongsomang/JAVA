package exam;
class Car{
	
}
class Tv{
	
}
public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv,String> product1=new Product<Tv,String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");
		Tv tv=product1.getKind();
		String tvModel=product1.getmodel();
		System.out.print(tvModel);
		Product<Car,String> product2=new Product<Car,String>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car=product2.getKind();
		String carModel=product2.getmodel();
		System.out.println(carModel);
	}


}
