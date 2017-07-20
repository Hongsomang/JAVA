
public class ThreadStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatePrintThread statePrintThead=new StatePrintThread(new TargetThread());
		statePrintThead.start();
	}

}
