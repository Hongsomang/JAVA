
public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBox dataBox=new DataBox();
		ProduceThread p=new ProduceThread(dataBox);
		ConsumerThread c=new ConsumerThread(dataBox);
		p.start();
		c.start();
	}

}
