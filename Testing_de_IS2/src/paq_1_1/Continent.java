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

	public String toString() {
		return "Name: " + this.getName() + " Num of countries: " + this.getNum() + "\n" + list.toString() + "\n" + languages.toString() + "\n\n\n";
	}
}
