import java.util.function.*;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer=t-> System.out.println(t+"8");
		consumer.accept("java");
		BiConsumer<String, String> bigConsumer=(t,u)-> System.out.println(t+u);
		bigConsumer.accept("java","8");
		DoubleConsumer doubleConsumer= d-> System.out.println("java"+d);
		ObjIntConsumer<String> objIntConsumer=(t,i)->System.out.println(t+i);
		objIntConsumer.accept("Java",8);
	}

}
