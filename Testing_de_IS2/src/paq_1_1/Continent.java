package paq_1_1;

public class Continent extends Template<Country>{
	
	public Continent() {
		this.type = "Continent";
		this.list = new List<Country>();
		for (int i = 0; i < this.getNum(); i++)
			list.addElem(new Country());
	}

	public String toString() {
		return "Name: " + this.getName() + " Num of countries: " + this.getNum() + "\n" + list.toString() + "\n";
	}
}
