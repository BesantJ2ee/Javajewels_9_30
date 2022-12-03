package Dec3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mapdiscussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String>   adf= new HashMap<Integer, String>();
adf.put(2, "a");
adf.put(2, "b");
adf.put(2, "c");
adf.put(null, null);
adf.put(null, "e");

for(Map.Entry<Integer, String> afg:adf.entrySet())
{
//	System.out.println("Key  ="+afg.getKey()+"  "+"Value  ="+afg.getValue());
//	System.out.println();
	
}

Employee e1 = new Employee();
e1.setName("Rahul");

Employee e2 = new Employee();
e2.setName("Rohith");


Product p1 = new Product();
p1.setGiftName("Amazone voucher");
p1.setGiftAmount(1000);


Product p2 = new Product();
p2.setGiftName("Flipkart voucher");
p2.setGiftAmount(500);



Map<Employee, Product>   organizatonLoyality= new HashMap<Employee, Product>();
organizatonLoyality.put(e1, p1);
organizatonLoyality.put(e2, p2);

for(Map.Entry<Employee, Product> afg:organizatonLoyality.entrySet())
{
	System.out.println("Key  ="+afg.getKey().getName()+"  "+"Value  ="+afg.getValue().getGiftAmount());
	System.out.println();
	
}


ArrayList<Employee> df = new ArrayList<Employee>();
df.add(e2);
df.add(e1);



for(Employee gh:df)
{
	//System.out.println(gh.getName());
	System.out.println(gh.getAge());
	
	
}









Map<String, String>   adf1= new HashMap<String, String>();
adf1.put("2", "a");
adf1.put("2", "b");
adf1.put("2", "c");



	}

}
