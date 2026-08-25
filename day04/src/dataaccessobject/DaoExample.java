package dataaccessobject;

public class DaoExample {

	public static void dbWork(DataAccessObject dao){
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		
		DataAccessObject o = (DataAccessObject) new OracleDao("Oracle");
		DataAccessObject m = (DataAccessObject) new OracleDao("MySql");
		dbWork(o);
		dbWork(m);

	}

}
