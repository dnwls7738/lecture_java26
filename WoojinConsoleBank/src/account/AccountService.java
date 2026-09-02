package account;

import java.util.List;

public class AccountService {
	
	public static int noSeq = 111111;
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	public boolean createAccount(String memeberId, String password, int amount) {
		Account ac = new Account(noSeq++, memeberId,password, amount);
		return accountDao.createAccount(ac);		
	}
	
	public List<Account> getAllAcounts(){
		return accountDao.selectAll();	
	}
	
	public List<Account> getMembersAccounts(){
		return null;
	}
	
	public boolean deposit(int accountNo, int amount)throws NoAccountException {
		Account ac = accountDao.selectByNo(accountNo);
		if(ac != null) {
			ac.setBalance(ac.getBalance() + amount);
			accountDao.updateAccount(ac);
		}

		// 없는 계좌번호 -> 예외 객체 생성하여 던짐
		throw new NoAccountException(accountNo);
	}
	
	public boolean withdraw(int accountNo, int amount, String password) throws NoAccountException{
		//계좌찾기
		Account ac = accountDao.selectByNo(accountNo);
		if(ac != null) {
			if(password.equals(ac.getPassword())) {
				//잔액확인
				if(amount >= ac.getBalance()) {
					//출금처리
					ac.setBalance(ac.getBalance()- amount);
					accountDao.updateAccount(ac);
					return true;
				}
			
			}
			
			return false;
		}
		
		// 없는 계좌번호 -> 예외 객체 생성하여 던짐
				throw new NoAccountException(accountNo);
	}
	
	public boolean deleteAccount(int accountNo, String password) {
		return true;
	}
}
