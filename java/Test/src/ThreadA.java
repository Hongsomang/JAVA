
public class ThreadA extends Thread{
	public boolean work=true;
	public boolean stop=false;
	public void run(){
		while(!stop){
			if(work){
				System.out.println("A����");
			}
			else{
				Thread.yield();
			}
		}
		System.out.println("A����");

	}


}
