package parte2;

public class NewRelease extends Category {
	
	double getPrice(Rental rental) {
		return rental.getDays() * 3;
	}
	
	int getPoints(Rental rental) {
		// 2) Cada alquiler da 1 punto. Punto extra para novedades alquiladas 2 o m�s d�as
		int points = 1;
		if (rental.getDays() > 1)
			points = 2;
		return points;
	}	

}