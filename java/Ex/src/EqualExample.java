import java.util.*;

public class EqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] original={{1,2},{3,4}};
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1=Arrays.copyOf(original, original.length);
		System.out.println("배열번지 비교:"+original.equals(cloned1));
		System.out.println("1차 배열 항목값을 비교:"+Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교:"+Arrays.deepEquals(original, cloned1));
		
		System.out.println("\n[깊으 복사후 비교]");
		int [][] cloned2=Arrays.copyOf(original, original.length);
		cloned2[0]=Arrays.copyOf(original[0], original[0].length);
		cloned2[1]=Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열번지 비교:"+original.equals(cloned2));
		System.out.println("1차 배열 항목값을 비교:"+Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교:"+Arrays.deepEquals(original, cloned2));
		
	}

}
