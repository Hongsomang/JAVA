import java.util.function.*;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate predicateA=a-> a%2==0;
		IntPredicate predicateB=a-> a%3==0;
		
		IntPredicate predicateAB;
		boolean result;
		predicateAB=predicateA.and(predicateB);
		result=predicateAB.test(9);
		System.out.println("9와 2와 3의 배수 입니까?"+result);
		
		predicateAB=predicateA.or(predicateB);
		result=predicateA.test(9);
		System.out.println("9또는 2와 3의 배수입니까?"+result);
		
		predicateAB=predicateA.negate();
		result=predicateA.test(9);
		System.out.println("9는 홀수 입니까?"+result);
		
	}

}
