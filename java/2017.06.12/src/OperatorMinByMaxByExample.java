import java.util.function.*;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Fruit> bunaryOperator;
		Fruit fruit;
		 bunaryOperator=BinaryOperator.minBy((f1,f2)-> Integer.compare(f1.price, f2.price));
		fruit= bunaryOperator.apply(new Fruit("µþ±â",6000),new Fruit("¼ö¹Ú",1000));
		System.out.println(fruit.name);
		
		bunaryOperator=BinaryOperator.minBy((f1,f2)-> Integer.compare(f1.price, f2.price));
		fruit=bunaryOperator.apply(new Fruit("µþ±â",6000),new Fruit("¼ö¹Ú",1000));
		System.out.println(fruit.name);
		
	}

}
