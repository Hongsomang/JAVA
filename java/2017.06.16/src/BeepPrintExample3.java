import java.awt.*;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread thread=new BeepThread();
		
		//how2
		Thread thread=new Thread(){
			public void run(){
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++){
					toolkit.beep();
					try{
						Thread.sleep(500);
					}catch(Exception e){
						
					
					}
			
				}
				
			}
		};
		thread.start();
		for(int i=0; i<5;i++){
			System.out.println("��");
		}try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
	}
}

