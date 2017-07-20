package exam;
 class  BalanceInsufficientException extends Exception{
	public BalanceInsufficientException(){}
	public  BalanceInsufficientException(String message){
		super(message);
	}
}
	
public class AccountExeption {
	private long balance;
	public  AccountExeption() {}
	
	public long getBalance(){
		return balance;
	}
	public void deposit(int money){
		balance+=money;
	}
	public void withdraw(int money)throws BalanceInsufficientException{
		if(balance<money){
			throw new BalanceInsufficientException("잔고부족"+(money-balance)+"모자람");
		}
		balance-=money;
	}

}
