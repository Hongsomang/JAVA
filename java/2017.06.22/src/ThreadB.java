
public class ThreadB extends Thread{
	public boolean stop=false;
	public boolean work=true;
	public void rnu(){
		while(!stop){
			if(work){
				System.out.println("ThreadB �۾�");
			}else{
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
