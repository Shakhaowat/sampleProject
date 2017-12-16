package Abstract;



public class Vehicle extends MotorCar implements car {

	@Override
	public void HybridCar() 
	{
		System.out.println("This is still in progress");
	}

	@Override
	public void Wheel() {
		System.out.println("This is my Car's wheel");
		
	}

	@Override
	public void Drive() 
	{
		System.out.println("This is  my drive function");
	}

	@Override
	public void Start() 
	{
		System.out.println("This is Start button");
		
	}

	@Override
	public void SizeOfCar() 
	{
		System.out.println("The car size has to be 12 feets");
	}

	

}
