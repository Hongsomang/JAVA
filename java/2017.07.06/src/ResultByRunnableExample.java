/*import java.util.concurrent.*;

import javax.naming.spi.DirStateFactory.*;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService e=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[�۾�ó�� ��û]");
		class Task implements Runnable{
			Result result;
			Task(Result result){
				this.result=result;
			}
			@Override
			public void run(){
				int sum=0;
				for(int i=0;i<10;i++){
					sum+=i;
				}
			}
		}
	}
	Result result=new Result();
	Runnable task1=new Task(result);
	Runnable task2=new Task(result);
	Future<Result> future1=e.submit(task1,result);
	Future<Result> future2=e.submit(task2,result);
	try{
		result=future1.get();
		result=future2.get();
		System.out.println("[ó�� ���]"+result.accumValue);
		System.out.println("[���� ó�� �·�]");
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("[���� ���� �߻���]"+e.getMessage());
	}
	e.shutdown();
}
}
class Result{
	int accumValue;
	synchronized void addValue(int value){
		accumValue +=value;
	}
}
*/