import java.util.*;

public class ThreadInfoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread a=new AutoSaveThread();
		a.setName("AutoSaveThread");
		a.setDaemon(true);
		a.start();
		Map<Thread,StackTraceElement[]> map=Thread.getAllStackTraces();
		Set<Thread> threads=map.keySet();
		for(Thread thread : threads){
			System.out.println("Name:"+thread.getName()+(thread.isDaemon()?"(데몬)":"(주)"));
			System.out.println("\t"+"소속그룹"+thread.getThreadGroup().getName());
			System.out.println();
		}
	}

}
