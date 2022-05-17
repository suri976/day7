package day7;

public enum Month {
	jan,feb,mar,apr,may,jun,july,aug,sep,nov,dec;
	int getMon(Month m)
	{
		return m.ordinal()+1;
	}

}
