
public class DemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread a=new AutoSaveThread();
		a.setDaemon(true);
		a.start();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			
		}
		System.out.println("���ν����� ����");
	}

}
