
public class UsingLocalVariable {
	void method(int arg){
		int localVar=40;
		 //arg=31;
		localVar=41;
		MyFunctionalInterface fi= ()->{
			System.out.println("arg:"+arg);
			//System.out.println("localVar"+localVar+"\n");
		};
		fi.method();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
