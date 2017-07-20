
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={23,14,13,13,14,15,17};
		int[] b={1,1,2,3,5,8,13,21};
		for(int i=0;i<a.length;i++){
			for(int j=b.length;j<0;j--){
				a[i]+=b[j];
			
			}
		}
	}

}
