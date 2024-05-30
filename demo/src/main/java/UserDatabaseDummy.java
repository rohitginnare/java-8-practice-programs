import java.util.ArrayList;
import java.util.List;

//DAO Layer
public class UserDatabaseDummy {
	public static List<UserDemo> getUsers(){
		List<UserDemo> list = new ArrayList<>();
		list.add(new UserDemo(100, "Rohit",15000));
		list.add(new UserDemo(101, "Java Techie",25000));
		list.add(new UserDemo(102, "Rohan",20000));
		list.add(new UserDemo(103, "Aakash",55000));
		list.add(new UserDemo(104, "Rahul",35000));
		
		return list;
	}
	
}
