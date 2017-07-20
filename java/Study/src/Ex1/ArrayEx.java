package Ex1;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,4,6,8,10,12,14,16};
		int[] b={1,1,2,3,13,21};
		for(int i=0;i<a.length;i++){
			for(int j=b.length;j>0;j--){
				a[i]+=b[j];
				System.out.println(a[i]);
			}
		}
	}

}
