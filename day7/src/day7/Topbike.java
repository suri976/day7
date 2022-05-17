package day7;

public enum Topbike {
ktm,royalenfield,yamaha,ninja,apache,glamour;
int getBike(Topbike b)
{
	return b.ordinal()+1;
}

}
