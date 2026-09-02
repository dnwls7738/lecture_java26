package account;

import java.util.List;

public interface AccountDao {
	//계좌등록
	boolean createAccount(Account ac);
	//계좌조회 : 전체, 계좌번호, 계좌주
	List<Account> selectAll();
	Account selectByNo(int accountNo);
	List<Account> selectByMemberId(String memeberId);
	//입금, 출금
	boolean updateAccount(Account ac);
	boolean deleteAccount(int accountNo);
}
