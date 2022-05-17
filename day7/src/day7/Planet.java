package day7;

public enum Planet {
	Jupiter(69911,"Brown"),Saturn(58232,"Golden"),Uranus(25362,"Bluegreen"),Neptune(24622,"Blue"),Earth(6371,"white"),Venus(6051,"Brown"),Mars(3389,"Red"),Mercury(2439,"Grey");
	int distance;
	String colour;
	Planet(int distance,String colour)
	{
		this.distance=distance;
		this.colour=colour;
	}
	int ShowDistance() {
		return this.distance;
	}
	String Colour() {
		return this.colour;
	}
	
	

}
