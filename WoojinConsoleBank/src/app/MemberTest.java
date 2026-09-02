package app;

import java.util.List;

import member.Member;
import member.MemberDao;
import member.MemberMapDao;
import member.MemberService;

public class MemberTest {

	public static void main(String[] args) {
		testDao();

		
	}
	
	static void testService() {
		MemberService ms = new MemberService(new MemberMapDao());
		ms.registerMember("aaa","bbb","1234");
		printMemberList(ms.getMembers());
		
		ms.login("admin", "admin");
		System.out.println(ms.getLoginMember());
	}
	
	
	


	static void testDao() {
		MemberDao mdao = new MemberMapDao();
		
		mdao.createMember(new Member("1", "woo", "1234"));
		List<Member> mlist = mdao.selectAll();
		for(Member m : mlist) {
			System.out.println(m);
		}
		
		System.out.println(mdao.selectById("1"));
		
		Member m = new Member("1", "bbb", "1111");
		mdao.updateMember(m);
		System.out.println(mdao.selectById("1"));
		
		mdao.deleteMember("1");
		mlist = mdao.selectAll();


	}
	
	 static void printMemberList(List<Member> mlist) {
		for(Member m2 : mlist) {
			System.out.println(m2);
		}
	}

}
