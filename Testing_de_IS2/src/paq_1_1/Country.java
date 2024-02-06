package paq_1_1;

public class Country extends Template<Object>{
	
	protected String Olanguage;
	private City capitalCity;
	
	
	public Country() {
		this.type = "Country";
		this.setPopulation(100);
		this.Olanguage = "English";
	}
	
	public Country(String name, long population, LanguagesEnum lang) {
		this.type = "Country";
		this.setName(name);
		this.setPopulation(population);
		this.setOlanguage(lang.toString());
		this.initCity();
	}
	
	private void initCity() {
		for (CitiesEnum c : CitiesEnum.values()) {
			if (c.getCountry().toString() == this.getName())
				this.capitalCity = new City(c.name(), c.getPopulation(), c.getDimX(), c.getDimY());
		}
		if (this.capitalCity == null)
			this.capitalCity = new City();
	}

	public String getOlanguage() {
		return Olanguage;
	}

	public void setOlanguage(String olanguage) {
		Olanguage = olanguage;
	}

	public String toString() {
		return "Country: " + this.getName() + ". Population: " + this.getPopulation() + ", Oficial language: " + this.Olanguage + "\n" + this.capitalCity.toString() + "\n";
	}
}
