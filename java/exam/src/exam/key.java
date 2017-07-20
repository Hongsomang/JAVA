package exam;

public class key {
	public int number;
	public key(int number){
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals");
		if(obj instanceof key){
			key compareKey=(key) obj;
			if(this.number==compareKey.number){
				return true;
			}
		}
		return false;
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashCode:"+number);
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
