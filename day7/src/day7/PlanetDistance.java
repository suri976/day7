package day7;

public class PlanetDistance {
	public static void main(String[] args) {
		//Planet p;
		for(Planet p:Planet.values())
		{
			System.out.println("Planet is "+p+" And Radius = "+p.ShowDistance()+"km ");
		}
	}
	
	
	

}
