package member;

import java.util.List;

public interface MemberDao {
	boolean createMember(Member m);
	List<Member> selectAll();
	Member selectById(String memberId);
	List<Member> selectByMember(String nikname);
	
	boolean updateMember(Member m);
	boolean deleteMember(String memberId);
}
