/** EVA CURRY CSC202 Week 6 - Chapter 8 */

public class Address {
	
	private int houseNum;
	private String street;
	private int aptNum = 0;
	private String city;
	private String state;
	private int zipCode;
	
	
//Constructor with apartment number parameter	
	public Address(int setHouseNum, String setStreet, int setAptNum, String setCity, String setState, int setZipCode)
	{
		houseNum = setHouseNum;
		street = setStreet;
		aptNum = setAptNum;
		city = setCity;
		state = setState;
		zipCode = setZipCode;
	}
	
//Constructor without apartment number parameter
	public Address(int setHouseNum, String setStreet, String setCity, String setState, int setZipCode)
	{
		houseNum = setHouseNum;
		street = setStreet;
		city = setCity;
		state = setState;
		zipCode = setZipCode;
	}
	
	public int getZip()
	{
		return zipCode;
	}
	
//print method prints two ways depending on if apartment number is not zero
	public void printAddress()
	{
		if (aptNum == 0)
		{
			System.out.println(houseNum + " " + street);
			System.out.println(city + ", " + state + ", " + zipCode);
		}
		else
		{
			System.out.println(houseNum + " " + street + ", Apt " + aptNum + ",");
			System.out.println(city + ", " + state + ", " + zipCode);
		}
	}
	
//Checks whether the address calling the method comes before another method
	public boolean comesBefore(Address other)
	{
		if (other.getZip() < this.getZip())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Address myAddress = new Address(500, "Lancaster Rd", 2, "Richmond", "Virginia", 13000);
		myAddress.printAddress();
		
		Address yourAddress = new Address(123, "Hawthorne", "Richmond", "Virginia", 12000);
		yourAddress.printAddress();
		
		System.out.println(myAddress.comesBefore(yourAddress));		
	}
}
