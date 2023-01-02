package project;

import java.util.HashMap;
import java.util.Map;

public class SaveLogic {
	
	
	public Map<Integer, Entry> saveData(Entry ex)
	{
		Map<Integer, Entry> m1 = new HashMap<Integer, Entry>();
	
		m1.put(ex.getVehiclenumber(),ex);
		return m1;
	}

}
