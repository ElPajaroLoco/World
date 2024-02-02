package paq_1_1;

public class Country extends Template<Object>{
	
	protected String Olanguage;
	
	
	public Country() {
		this.type = "Country";
		this.setPopulation(100);
		this.Olanguage = "English";
	}

	public String getOlanguage() {
		return Olanguage;
	}

	public void setOlanguage(String olanguage) {
		Olanguage = olanguage;
	}

	public String toString() {
		return "Country: " + this.getName() + " Populaton: " + this.getPopulation() + " Oficial language: " + this.Olanguage + "\n";
	}
}
