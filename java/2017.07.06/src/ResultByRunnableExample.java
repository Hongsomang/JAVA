/*import java.util.concurrent.*;

import javax.naming.spi.DirStateFactory.*;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService e=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[작업처리 요청]");
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
		System.out.println("[처리 결과]"+result.accumValue);
		System.out.println("[착업 처리 온료]");
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("[실행 예외 발생함]"+e.getMessage());
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