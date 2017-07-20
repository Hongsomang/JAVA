package exam;

import java.util.*;


public class bankApplication2 {
	private static Account[] accountArray=new Account[100];
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while(run){
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� |2.���¸��|3.����|4.���|5.����");
			System.out.println("-----------------------------------------");
			System.out.println("����>");
			int selectNo=scanner.nextInt();
			if(selectNo==1){
				createAccount();
			}
			else if(selectNo==2){
				accountList();
			}
			else if(selectNo==3){
				deposit();
			}
			else if(selectNo==4){
				withdraw();
			}
			else if(selectNo==5){
				run=false;
			}
			
		}
		System.out.println("���α׷� ����");
	}
	private static void createAccount(){
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		System.out.println("���¹�ȣ:");
		String ano=scanner.next();
		System.out.println("������:");
		String owner=scanner.next();
		System.out.println("�ʱ��Աݾ�:");
		int balance=scanner.nextInt();
		Account a=new Account(ano,owner,balance);
		
		for(int i=0;i<accountArray.length;i++){
			if(accountArray[i]==null){
				accountArray[i]=a;
				System.out.println("���:���°� �����Ǿ����ϴ�. ");
				break;
			}
		}
		
	
		
	}
	private static void accountList(){
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
		for(int i=0;i<accountArray.length;i++){
			Account account=accountArray[i];
			if(accountArray[i]==null){
				System.out.print(account.getAno());
				System.out.print("   ");
				System.out.print(account.getOwner());
				System.out.print("   ");
				System.out.print(account.getBalance());
				System.out.println();
			}
			
		}
	}
	private static void deposit(){
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.println("���¹�ȣ:");
		String ano=scanner.next();
		System.out.println("��ݾ�:");
		int money=scanner.nextInt();
		Account account=findAccount(ano);
		if(account==null){
			System.out.println("��� :���°������ϴ�");
			return;
		}
		
		account.setBalance(account.getBalance()-money);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}
	private static void withdraw(){
		System.out.println("���¹�ȣ:");
		String ano=scanner.next();
		System.out.println("���ݾ�:");
		int money=scanner.nextInt();
		Account account=findAccount(ano);
		if(account==null){
			System.out.println("��� :���°������ϴ�");
			return;
		}
		
		account.setBalance(account.getBalance()+money);
		System.out.println("���: �����̼��������� �Ǿ����ϴ�.");
		
	}
	private static Account findAccount(String ano){
		Account account=null;
		for(int i=0;i<accountArray.length;i++){
			if(accountArray[i]==null){
				String dbAno=accountArray[i].getAno();
				if(dbAno.equals(ano)){
					account=accountArray[i];
					break;
				}
			}
		}
		
		return account ;
	}
}