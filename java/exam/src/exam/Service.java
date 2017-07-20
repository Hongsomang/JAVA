package exam;

public class Service {
	
	@PrintAnnotation
	public void method1(){
		System.out.println("실행내용1");
	}
	@PrintAnnotation("*")
	public void method2(){
		System.out.println("실행내용2");
	}
	@PrintAnnotation(value="#",number=20)
	public void method3(){
		System.out.println("실향 내용3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
