package paq_1_1;

public class Country extends Template<Object>{
	
	
	public Country() {
		this.type = "Country";
		this.setPopulation(100);
	}

	public String toString() {
		return "Country: " + this.getName() + " Populaton: " + this.getPopulation() + "\n";
	}
}
