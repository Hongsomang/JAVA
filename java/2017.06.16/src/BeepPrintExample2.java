import java.awt.*;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runnable beepTesk=new BeepTest();
		//Thread thread=new Thread(beepTesk);
		
		//�͸���ü �̿�
		/*Thread thread=new Thread(new Runnable(){
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
		});*/
			
		//���ٽ�
		Thread thread=new Thread(()->{
			Toolkit toolkit=Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++){
				toolkit.beep();
				try{
					Thread.sleep(500);
				}catch(Exception e){
					
				}
				}
			});	
		thread.start();
		for(int i=0; i<5;i++){
			System.out.println("��");
		}try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
	}

}
