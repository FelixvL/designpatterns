package designpatterns.examples.command;

public class InsertBootQuery implements SQLCommand{
	private SQLQuery sqlQuery;
	
	public InsertBootQuery(SQLQuery sqlQuery) {
		this.sqlQuery = sqlQuery;
	}
	
	@Override
	public String executeDatabaseQuery() {
		return sqlQuery.insert();
	}
	
}
