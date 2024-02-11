package paq_1_1;

import java.util.List;

public class Template<T extends Object> {
	protected String type;
	private int num;
	protected List<T> list;
	private String name;
	private long population;
	
	public Template() {
		this.name = "DEF_name";
		this.num = 7;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	public int getNum() {
		return this.num;
	}
	
	/*public String toString() {
		return "Name: " + this.getName() + " Num of countries: " + this.getNum() + "\n" + list.toString() + "\n";
	}*/
}
