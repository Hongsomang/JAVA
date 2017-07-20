import java.awt.*;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<10;i++){
					toolkit.beep();
					try{
						Thread.sleep(300);
					}catch(InterruptedException e){
						
					}
				}
	}

}
