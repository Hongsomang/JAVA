package exam;

enum Parents{FATHER,MOTHER}
public class EnumParents2 {
	public static void printParents(Parents p){
		System.out.println(p);
	}
	public static void print(Parents d){
		switch(d){
		case FATHER:
			System.out.println("�ƺ�");
			break;
		case MOTHER:
			System.out.println("����");
		default:
			 System.out.println("�θ�� �� �� �и�!!");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printParents(Parents.MOTHER);
		print(Parents.FATHER);
		print(Parents.MOTHER);
		for(Parents p:Parents.values()){
			System.out.println("enum ���ε����� :"+p);
		}
	}

}
