package paq_1_1;

import java.util.ArrayList;

public class World extends Template<Continent> {
	
	public World() {
		this.type = "World";
		this.list = new ArrayList<Continent>();
		initContinents();
		/*for (ContinentEnum c : ContinentEnum)
			list.addElem(new Continent());
			*/
	}
	
	public World(String name, long population) {
		this.type = "World";
		this.list = new ArrayList<Continent>();
		this.setName(name);
		this.setPopulation(population);
		initContinents();
	}

	public String toString() {
		return (this.getName() + " has " + this.getNum() + " continents" + "\n\n" + list.toString());
	}
	
	private void initContinents() {
		for (ContinentEnum c : ContinentEnum.values()) {
			list.add(new Continent(c.name(), c.getPopulation()));
		}
	}
}
