package paq_1_1;

public class World extends Template<Continent>{
	
	public World() {
		this.type = "World";
	}
	
	/*private String name; 
	private int numContinents;
	private List<Continent> list;
	
	
	
	
	public World() {
		this.setName("Ada Madrina");
		this.setNumContinents(6);
		this.list = new List<Continent>();
		for (int i = 0; i < this.numContinents; i++)
			list.addElem(new Continent());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumContinents() {
		return numContinents;
	}

	public void setNumContinents(int numContinents) {
		this.numContinents = numContinents;
	}*/

	public String toString() {
		return (this.getName() + " has " + this.getNumCountries() + " continents" + "\n" + list.toString());
	}
}
