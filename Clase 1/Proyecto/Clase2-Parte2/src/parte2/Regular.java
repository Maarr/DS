package parte2;

public class Regular extends Category {
	
	double getPrice(Rental rental) {
		double price = 2;
		if (rental.getDays() > 2)
			price += (rental.getDays() - 2) * 1.5;
		return price;
	}
	
	int getPoints(Rental rental) {
		return 1;
}	

}