package oops;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {

		Map<Employee, String> empMap = new HashMap<Employee, String>();
		
		Employee e1 = new Employee("Naveen", 20);
		
		empMap.put(e1, "permanent");
		
		e1.setAge(25);

		System.out.println(empMap.get(e1));
		Map<String, Integer> m1=new HashMap<String, Integer>();
		String e11="Tom";
		m1.put(e11, 100);
		System.out.println(m1.get(e11));
		
//		m1.put("Sharanya", 1);
		e11="Naveen";
		m1.put(e11, 200);
		System.out.println(m1.get("Naveen"));
		System.out.println(m1.get("Tom"));		
	}
}
