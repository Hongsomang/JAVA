import java.util.*;

public class ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num;
		num=new int [5];
		int sum=0;
		System.out.println("[������]");
		for(int i=0;i<num.length;i++){
			num[i]=(int)(Math.random()*50)+1;
			System.out.print("num"+"["+i+"]"+"="+num[i]);
			sum+=num[i];
		}
		System.out.println()      ;
		System.out.println("[������]");
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			System.out.print("num"+"["+i+"]"+"="+num[i]);
		}
		System.out.println();
		System.out.println(sum);
	}

}