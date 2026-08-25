package account;

public interface AccountDao {
	//계좌등록
	boolean createAccount(String owner, String password, int balance);
	//계좌조회 : 전체, 계좌번호, 계좌주
	Account[] selectAll();
	Account selectByNo(int accountNO);
	Account[] selectByOwner(String owner);
	//입금, 출금
	boolean deposit(int accoutNo, int amount);
	boolean withdraw(int accoutNo, int amount);
}
