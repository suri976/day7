package day7;

public class Total {
	public static void main(String[] args) {
		
		for(Month m:Month.values())
		{
			System.out.println(m +" is "+(m.getMon(m))+" month");
		}
		
	}

}
