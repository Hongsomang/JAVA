package Ex1;


public class DBuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB aref=new DB2();
		aref.connection();
		aref.runTransaction();
		aref.commit();
	}
	

}
