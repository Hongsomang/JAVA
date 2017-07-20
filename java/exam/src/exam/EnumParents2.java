package exam;

enum Parents{FATHER,MOTHER}
public class EnumParents2 {
	public static void printParents(Parents p){
		System.out.println(p);
	}
	public static void print(Parents d){
		switch(d){
		case FATHER:
			System.out.println("아빠");
			break;
		case MOTHER:
			System.out.println("엄마");
		default:
			 System.out.println("부모님 중 한 분만!!");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printParents(Parents.MOTHER);
		print(Parents.FATHER);
		print(Parents.MOTHER);
		for(Parents p:Parents.values()){
			System.out.println("enum 내부데이터 :"+p);
		}
	}

}
