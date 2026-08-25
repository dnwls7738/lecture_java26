package account;

public class AccountFileDao implements AccountDao{

	@Override
	public boolean createAccount(String owner, String password, int balance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account[] selectAll() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public boolean deposit(int accoutNo, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(int accoutNo, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
