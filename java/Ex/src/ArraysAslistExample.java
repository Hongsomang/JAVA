import java.util.*;

public class ArraysAslistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("이율곡","이순신","세종대왕");
		for(String name: list1){
			System.out.println(name);
		}
		List<Integer> list2=Arrays.asList(1,2,3);
		for(int value:list2){
			System.out.println(value);
		}
	}

}
