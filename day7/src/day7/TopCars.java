package day7;

public class TopCars {
	
public static void main(String[] args) {
		
		for(Cars c:Cars.values())
		{
			System.out.println(c +" is "+(c.getCars(c))+" Car");
		}
		
	}

}
