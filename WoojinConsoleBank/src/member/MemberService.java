package member;

import java.util.List;

public class MemberService {
	
	final String ADMIN_ID = "admin";
	final String ADMIN_PASSWORD = "1234";
	
	private MemberDao memberDao;
	private Member loginMember;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	public boolean registerMember(String id, String nickname, String password) {
		
		if(memberDao.selectById(id) != null) {
			Member m = new Member(id,nickname,password);
			memberDao.createMember(m);
			return true;
		}
		
		return false;
	}
	
	public boolean login(String id, String password) {
		if(id.equals(ADMIN_ID)) {
			if(password.equals(ADMIN_PASSWORD)) {
				// 관리자 로그인
				loginMember = new Member(ADMIN_ID,"ADMIN", ADMIN_PASSWORD);
			}
			return false;
		}
		
		Member member = memberDao.selectById(id);
		if (member != null && member.getPassword().equals(password)) {
			loginMember = member;
			return false;
		}
		return false;
	}
	
	public boolean logout() {
		loginMember = null;
		return true;
	}
	
	public List<Member> getMembers() {
		return memberDao.selectAll();
	}


	public Member getLoginMember() {
		return loginMember;
	}


	public Member getAdminId() {
		return memberDao.selectById(ADMIN_ID);
	}
	
	
}
