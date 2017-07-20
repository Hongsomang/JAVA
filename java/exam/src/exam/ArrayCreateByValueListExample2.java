package exam;

public class ArrayCreateByValueListExample2 {
	private int money;
	
	
	
	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={83,90,87};
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=nums[i];
		}
		System.out.println("รัวี:"+sum);
		
		//int sum2=add(nums);
		int sum2=add(new int[]{83,90,87});
		System.out.println("รัวี:"+sum2);
		System.out.println();
	}



	public static int add(int[]nums){
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=nums[i];
		}
		return sum;
	}
}
