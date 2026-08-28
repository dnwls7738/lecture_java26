package account;

import java.util.List;

public class AccountService {
	
	public static int noSeq = 111111;
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	public boolean createAccount(String owner, String password, int amount) {
		Account ac = new Account(noSeq++, owner,password, amount);
		return accountDao.createAccount(ac);		
	}
	
	public List<Account> getAllAcounts(){
		return accountDao.selectAll();	
	}
	
	public List<Account> getMembersAccounts(){
		return null;
	}
	
	public boolean deposit(int accountNo, int amount) {
		return true;
	}
	
	public boolean withdraw(int accountNo, int amount, String password) {
		return true;
	}
	
	public boolean deleteAccount(int accountNo, String password) {
		return true;
	}
}
