
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={5,2,1,4,3};
		int temp=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5-1;i++){
				if(num[i+1]>num[i]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					}
				
			}
			
		}
		for(int i=0;i<5;i++){
			System.out.println(num[i]);
		}

	}

}
