package exam;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AccountExeption account=new AccountExeption();
		account.deposit(10000);
		System.out.println("¿¹±Ý¾×:"+ account.getBalance());
		try{
			account.withdraw(30000);
			
		}catch(BalanceInsufficientException e){
			String message=e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
