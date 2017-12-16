package Constructor;

public class House {
public String HouseName;
int HouseNumber;
public House(){}
public House(String HouseName,int HouseNumber)
{
	this.HouseName=HouseName;
	this.HouseNumber=HouseNumber;
	
}

	
/*public void  setHouseName(String HouseName)
{
	this.HouseName=HouseName;
	
	
}*/	
public String getHouseName()
     {
		
		return HouseName;
		
     }
public int getHouseNumber()
{
	
	return HouseNumber;
	
}

}
