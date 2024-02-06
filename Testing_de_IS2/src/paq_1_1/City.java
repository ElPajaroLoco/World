package paq_1_1;

public class City extends Template<Object> {
	
	private int[][] buildings;
	private CityBuilder builder;
	
	public City() {
		this.type = "City";
		this.setName("DEF city");
		this.setPopulation(10);
		this.builder = new CityBuilder(1, 1);
		this.buildings = builder.generateBuildings();
	}
	
	public City(String name, long population, int dimX, int dimY) {
		this.type = "City";
		this.setName(name);
		this.setPopulation(population);
		this.builder = new CityBuilder(dimX, dimY);
		this.buildings = builder.generateBuildings();
	}
	
	public String buildCity(int dimX, int dimY, int[][] buildings) {
		String str = "";
		for (int i = 0; i < this.builder.getDimX(); ++i) {
			for (int j = 0; j < this.builder.getDimY(); ++j) {
				if (buildings[i][j] == 1)
					str += "*";
				else
					str += " ";
			}
			str += "\n";
		}
		return str;
	}
	
	public String toString() {
		String str = "City: " + this.getName() + ". Population: " + this.getPopulation() + "\n";
		str += "City map:\n";
		str += buildCity(this.builder.getDimX(), this.builder.getDimY(), this.buildings);
		return str;
	}
	

}
