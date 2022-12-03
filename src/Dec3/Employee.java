package Dec3;

import java.io.Serializable;

//encapsulated
//data memebers are private
//class is serialized for transferring one place to another
//Getters and setters for the data members
//User defined objects/Pojo
public class Employee implements Serializable {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * 
	 */
	//option
	//Discuss about serialization topic will discuss in details
	private static final long serialVersionUID = 1L;



	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	



	

	private String name;
	
	private int age;
	
	private String gender;
	
	private int salary;
	
	
	private String bankName;

	
	
	
}
