package day7;

public enum Cars {
	
	Bugatti,Lamborgini,Ferrari,Audi,Benz,Toyota,Tata,Mahindra;
	
	int getCars(Cars c)
	{
		return c.ordinal()+1;
	}

}
