package app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import account.Account;
import account.AccountDao;
import account.AccountFileDao;
import account.AccountListDao;
import account.NoAccountException;

public class WoojinConsoleBank01 {

	static String[] startMenu = { "0.종료", "1.계좌등록", "2.계좌조회", "3.입금", "4.출금" };
	static Scanner sc = new Scanner(System.in);
	static AccountDao accountDao = new AccountListDao();

	public static void main(String[] args) {
		welcomMessage();
		bankMenu();
		goodbyeMessage();

	}

	private static void bankMenu() {
		while (true) {
			int menu = getMenu(startMenu);
			switch (menu) {
			case 1:
				menuAccountRegist();
				break;
			case 2:
				menuAccountList();
				break;
			case 3:
				menuDeposit();
				break;
			case 4:
				menuWithDraw();
				break;
			case 0:
				return;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}

	}

	private static void menuAccountRegist() {
		// 계좌주 이름, 비밀번호, 초기 입금액
		System.out.println("[계좌 등록]");
		System.out.print("계좌주 :");
		String owner = sc.nextLine();
		System.out.print("비밀번호 :");
		String password = sc.nextLine();
		System.out.print("초기 입금액 :");

		int amount = sc.nextInt();
		sc.nextLine();

		if (accountDao.createAccount(owner, password, amount)) {
			System.out.println("계좌를 등록했습니다.");
		} else {
			System.out.println("계좌를 등록할 수 없습니다.");
		}

	}

	private static void menuAccountList() {
		System.out.println("[계좌 조회]");
		List<Account> accountList = accountDao.selectAll();
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}

	}

	private static void menuDeposit() {
		System.out.println("[입금]");
		showAccountList();
		// 계좌번호, 입금액 입력
		System.out.print("계좌번호 : ");
		int accountNo = sc.nextInt();
		System.out.print("입금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();

		// Dao에게 입금 요청
		try {
			accountDao.deposit(accountNo, amount);
			System.out.println("입금하였습니다.");
		} catch (NoAccountException e) {
			System.out.println("입금할 수 없습니다. :" + e.getMessage());

		}
	}

	private static void showAccountList() {
		List<Account> accountList = accountDao.selectAll();
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
	}

	private static void menuWithDraw() {
		System.out.println("[출금]");
		showAccountList();
		// 계좌번호, 출금액 입력
		System.out.print("계좌번호 : ");
		int accountNo = sc.nextInt();
		System.out.print("출금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();

		// Dao에게 출금 요청
		try {
				accountDao.withdraw(accountNo, amount);
				System.out.println("출금하였습니다.");
			} catch (NoAccountException e) {
				System.out.println("출금할 수 없습니다."+ e.getMessage());
		}
	
			

	}

	private static int getMenu(String[] menuList) {
		System.out.println("======================");
		// 메뉴 출력
		for (int i = 1; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println(menuList[0]);
		System.out.println("======================");

		// 메뉴 선택
		System.out.print(">> 메뉴 선택 : ");

		try {
			int menuNum = Integer.parseInt(sc.nextLine());

			return menuNum;
		} catch (Exception e) {
			return -1;
		}

	}

	private static void welcomMessage() {
		System.out.println("Welcom Console Bank");
	}

	private static void goodbyeMessage() {
		System.out.println("Good Bye Console Bank");

	}

}
