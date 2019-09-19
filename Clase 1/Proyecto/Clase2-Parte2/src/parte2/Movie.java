package parte2;
public class Movie	// Pel�cula
{
	private String title;
	private int category;


	public Movie(String title, int category) 
	{
		this.title = title;
		this.category = category;
	}
	
	public int getCategory() 
	{
		return category;
	}

	public void setCategory(int category) 
	{
		this.category = category;
	}
	
	public String getTitle() 
	{
		return title;
	}

	double getPrice(Rental rental) {
		return category.getPrice(rental);
	}

	int getPoints(Rental rental) {
		return category.getPoints(rental);
	}	
}
