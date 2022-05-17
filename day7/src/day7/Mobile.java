package day7;

public enum Mobile {
	Apple(3909),Mi(6778),micromax(6790);
	
int price;

	Mobile(int price) {
		this.price=price;
		
		// TODO Auto-generated constructor stub
	}
	int ShowPrice() {
		return this.price;
	}

}
