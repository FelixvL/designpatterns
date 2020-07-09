package designpatterns.examples.command;

public class UpdateBootQuery implements SQLCommand{
	private SQLQuery sqlQuery;
	
	public UpdateBootQuery(SQLQuery sqlQuery) {
		this.sqlQuery = sqlQuery;
	}
	
	@Override
	public String executeDatabaseQuery() {
		return sqlQuery.update();
	}
	
}
