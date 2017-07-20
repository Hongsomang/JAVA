
public class Member2 {
	public String name;
	public int age;
	
	public Member2(String name, int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj){
		if(obj instanceof Member2){
			Member2 member=(Member2) obj;
			return member.name.equals(name)&&(member.age==age);
		}else{
			return false;
		}
	}
	public int hashCode(){
		return name.hashCode();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
