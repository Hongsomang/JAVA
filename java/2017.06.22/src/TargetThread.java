
public class TargetThread extends Thread{
	public void run(){
		for(long i=0;i<1000000000;i++){}
			try{
				Thread.sleep(15000);
			}catch(Exception e){
				
			}
			for(long i=0; i<1000000000;i++){
				
			}
		
	}
}
