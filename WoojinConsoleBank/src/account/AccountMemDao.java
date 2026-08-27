package account;

public class AccountMemDao implements AccountDao{
	public static int noSeq = 111111;
	public static Account[] accountDB = new Account[100];
	private int numAccount;

	// 계좌 등록
	public boolean createAccount(String owner, String password, int balance) {

		int no = noSeq++;
		accountDB[numAccount++] = new Account(no, owner, password, balance);

		return true;
	}
	
	// 계좌 조회
	public Account[] selectAll() {
		Account[] accountList = new Account[numAccount];
		for(int i = 0; i<numAccount; i++) {
			accountList[i] = accountDB[i];
			
		}
		return accountList;
	}
	
	//입금
	public boolean deposit(int accountNo, int amount) throws NoAccountException {
		for (int i =0; i < numAccount; i++) {
			if(accountNo == accountDB[i].getNo()) {
				//입금 처리
				accountDB[i].setBalance(accountDB[i].getBalance() + amount);
				return true;
			}
		}
		// 없는 계좌번호 -> 예외 객체 생성하여 던짐
		throw new NoAccountException(accountNo);
		
	}
	
	//출금
	public boolean withdraw(int accountNo, int amount) throws NoAccountException {
		for (int i = 0; i < numAccount; i++) {
			if(accountNo == accountDB[i].getNo()) {
				accountDB[i].setBalance(accountDB[i].getBalance() - amount);
				return true;
			}else {
				return false;
			}
		}
		throw new NoAccountException(accountNo);
	}

	@Override
	public Account selectByNo(int accountNO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] selectByOwner(String owner) {
		// TODO Auto-generated method stub
		return null;
	}

}
