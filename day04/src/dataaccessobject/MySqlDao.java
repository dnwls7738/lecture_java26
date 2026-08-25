package dataaccessobject;

public class MySqlDao implements DataAccessObject{
	
	
	String mysql;
	
	
	public MySqlDao(String mysql) {
		this.mysql = mysql;
	}
	
	@Override
	public void select() {
		System.out.println(mysql + " DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println(mysql + " DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println(mysql + " DB를 수정");
	}
	@Override
	public void delete() {
		System.out.println(mysql + " DB에서 삭제");
	}

}
