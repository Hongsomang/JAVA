
public class MyMethodReferencesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		fi=(x) ->{
			int str=x*5;
			System.out.println(str);
			
		};
		fi.method(2);
		fi=(x) -> {System.out.println(x*5);};
		fi.method(2);
		fi=(x) -> {System.out.println(x*5);};
		fi.method(2);
	}
	}


