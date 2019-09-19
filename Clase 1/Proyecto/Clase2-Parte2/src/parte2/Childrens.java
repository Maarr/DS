package parte2;

public class Childrens extends Category {
	
	public Childrens() {
		super();
	}
	
	double getPrice(Rental rental) {
		double price = 1.5;
		if (rental.getDays() > 3)
			price += (rental.getDays() - 3) * 1.5;
		return price;
	}
	
	int getPoints(Rental rental) {
		return 1;
	}

}