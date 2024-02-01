package paq_1_1;

public class Continent extends Template<Country>{
	
	public Continent() {
		this.type = "Continent";
	}
	/*private int numCountries;
	private List<Country> list;
	private String name;
	
	public Continent() {
		this.name = "DEF_country";
		this.numCountries = 7;
		this.list = new List<Country>();
		for (int i = 0; i < this.numCountries; i++)
			list.addElem(new Country());
	}*/
	
	public String toString() {
		return "Name: " + this.getName() + " Num of countries: " + this.getNumCountries() + "\n" + list.toString() + "\n";
	}
}
