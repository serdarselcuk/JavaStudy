package day42_OOP_Encapsulation;

public class TestData {
	
	/*
	 * Name
	 * ID
	 */
	private String name = "Bekir";		//the data is not visible to any other classes
	private int iD = 586;
	
//GETTER
	
	public String getName() {			// this method will provide too see the data from another class. but it will be read only (GETTER METHOD)
		return name;
	}	
	public int getId() {
		return iD;
	}
//SETTER
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int iD) {
		this.iD = iD;
	}
	
}
