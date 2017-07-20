import java.util.function.*;

public class IntSupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier intSupplier=()->{
			int num=(int)(Math.random()*6)+1;
			return num;
		};
		int num=intSupplier.getAsInt();
		System.out.println(num);
	}

}
