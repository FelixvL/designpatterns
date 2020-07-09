package designpatterns.examples.command;

public class SelectBootQuery implements SQLCommand{
	private SQLQuery sqlQuery;
	
	public SelectBootQuery(SQLQuery sqlQuery) {
		this.sqlQuery = sqlQuery;
	}
	
	@Override
	public String executeDatabaseQuery() {
		return sqlQuery.select();
	}
	
}
