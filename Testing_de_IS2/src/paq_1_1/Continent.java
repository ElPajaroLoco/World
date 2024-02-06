package paq_1_1;

import java.util.Set;
import java.util.TreeSet;

public class Continent extends Template<Country>{
	
	protected Set<String> languages;
	
	public Continent() {
		this.type = "Continent";
		this.list = new List<Country>();
		this.languages = new TreeSet<String>();
		for (int i = 0; i < this.getNum(); i++) {
			list.addElem(new Country());
			languages.add(list.getElem(i).Olanguage);
		}
	}
	
	public Continent(String continent, long population) {
		this.type = "Continent";
		this.setName(continent);
		this.setPopulation(population);
		this.list = new List<Country>();
		initCountries();
	}

	public String toString() {
		String str = "Name: " + this.getName() + ". Num of countries: " + this.list.getNum() + "\n";
		str += "-".repeat(40) + "\n";
		str += "\nContinent Languages: \n";
		for (int i = 0; i < this.list.getNum(); i++)
			str += this.list.getElem(i).getOlanguage() + "\n";
		str += "\nList of Countries: \n" + list.toString();
		return str + "\n\n\n";
	}
	
	private void initCountries() {
		for (CountriesEnum c : CountriesEnum.values())
			if (c.getContinent().toString() == this.getName())
				this.list.addElem(new Country(c.name(), c.getPopulation(), c.getLanguage()));
	}
}
