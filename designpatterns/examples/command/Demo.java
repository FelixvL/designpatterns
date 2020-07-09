package designpatterns.examples.command;

public class Demo {
	public static void main(String[] args) {
		Boot boot = new Boot(2,"Nemo",55,"Nautilus",65);
		Boot boot2 = new Boot(6,"Edward Smith",55,"Titanic",65);
		
		SQLQuery sqlQuery1 = new SQLQuery(boot);
		SQLQuery sqlQuery2 = new SQLQuery(boot2);
		
		InsertBootQuery ibq = new InsertBootQuery(sqlQuery1);
		SelectBootQuery sbq = new SelectBootQuery(sqlQuery1);
		UpdateBootQuery ubq = new UpdateBootQuery(sqlQuery1);
		DeleteBootQuery dbq = new DeleteBootQuery(sqlQuery1);
			
		BootSQLCommandsBroker bscb = new BootSQLCommandsBroker();
		bscb.voegCommandToe(ibq);
		bscb.voegCommandToe(sbq);
		bscb.voegCommandToe(ubq);
		bscb.voegCommandToe(dbq);
		bscb.voegCommandToe(new InsertBootQuery(sqlQuery2));
		bscb.voegCommandToe(new SelectBootQuery(sqlQuery2));
		bscb.voegCommandToe(new UpdateBootQuery(sqlQuery2));
		bscb.voegCommandToe(new DeleteBootQuery(sqlQuery2));
				
		bscb.voerCommandosUit();
	}
}
