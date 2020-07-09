package designpatterns.examples.command;

public class DeleteBootQuery implements SQLCommand{
	private SQLQuery sqlQuery;
	
	public DeleteBootQuery(SQLQuery sqlQuery) {
		this.sqlQuery = sqlQuery;
	}
	
	@Override
	public String executeDatabaseQuery() {
		return sqlQuery.delete();
	}
	
}
