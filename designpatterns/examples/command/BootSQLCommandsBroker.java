package designpatterns.examples.command;

import java.util.ArrayList;
import java.util.List;


public class BootSQLCommandsBroker {
	private List<SQLCommand> sqlQueryList = new ArrayList<SQLCommand>();

	public void voegCommandToe(SQLCommand order) {
		sqlQueryList.add(order);
	}

	public void voerCommandosUit() {
		for (SQLCommand order : sqlQueryList) {
			System.out.println(order.executeDatabaseQuery());
		}
		sqlQueryList.clear();
	}
}
