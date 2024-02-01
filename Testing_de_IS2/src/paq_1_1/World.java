package paq_1_1;

public class World extends Template<Continent>{
	
	public World() {
		this.type = "World";
		this.list = new List<Continent>();
		for (int i = 0; i < this.getNum(); i++)
			list.addElem(new Continent());
	}

	public String toString() {
		return (this.getName() + " has " + this.getNum() + " continents" + "\n\n" + list.toString());
	}
}
