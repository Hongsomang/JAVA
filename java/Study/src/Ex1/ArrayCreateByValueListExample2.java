package Ex1;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores={83,90,87};
		int sum1=0;
		for(int i=0;i<3;i++){
			sum1+=scores[i];
		}
		System.out.println("����:"+sum1);
		int sum2=add(new int[]{83,90,87});
	}

	private static int add(int[] scores) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=scores[i];
		}
		return sum;
	}

}
