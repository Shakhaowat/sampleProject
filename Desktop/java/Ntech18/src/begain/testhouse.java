package begain;

public class testhouse {

	public static void main(String[] args) 
	{
	
	
	house myHouse=new house();//To create an instance to access house class;
	myHouse.showHname();
	myHouse.NewHouse();
	//To create an instance to access NumberOfHouse class;
	NumberOfHouse Number=new NumberOfHouse();
    Number.Numb();
    //To create an instance to access Math class;
    Math test=new Math();
    System.out.println("Sum of x and y :"+test.HouseCount(10,20));
   
    
    }
}