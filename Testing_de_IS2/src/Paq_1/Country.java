package Paq_1;

public class Country extends Template<Object>{
	
	
	public Country() {
		this.type = "Country";
		this.setPopulation(100);
	}
	/*private String name;
	private int population;
	
	public Country() {
		this.setName("default");
		this.setPopulation(100);
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
	*/
	public String toString() {
		return "Country: " + this.getName() + " Populaton: " + this.getPopulation() + "\n";
	}
}
