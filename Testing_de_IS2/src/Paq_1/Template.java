package Paq_1;

public class Template<T extends Object> {
	protected String type;
	private int numCountries;
	protected List<T> list;
	private String name;
	private int population;
	
	public Template() {
		this.name = "DEF_country";
		this.numCountries = 7;
		this.list = new List<T>();
		for (int i = 0; i < this.numCountries; i++)
			list.addElem((T) new Object());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public int getNumCountries() {
		return this.numCountries;
	}
	
	public String toString() {
		return "Name: " + this.name + " Num of countries: " + this.numCountries + "\n" + list.toString() + "\n";
	}
}
