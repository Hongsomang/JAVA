import java.awt.*;

public class BeepPrintExample2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runnable run=new BeepTesk();
		Thread thread=new Thread(run);*/
		Thread thread=new Thread(()->{
			Toolkit toolkit=Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++){
				toolkit.beep();
				try{
					Thread.sleep(500);
				}catch(Exception e){}
			}
		});
		thread.start();
		for(int i=0;i<5;i++){
			System.out.println("��");
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}

}
