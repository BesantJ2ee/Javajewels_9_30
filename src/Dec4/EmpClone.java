package Dec4;

public class EmpClone implements Cloneable{
	
	int id;
	String name;
	
	EmpClone(int id, String name)
	{
		this.id=id;  
		this.name=name;  	
		
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		EmpClone sa= new EmpClone(12,"rakesh");
		
		EmpClone s3= (EmpClone)sa.clone();
		
		
		EmpClone s2= (EmpClone)sa.clone();
		
		System.out.println(s2.id);
		System.out.println(s2.name);

	}

}
