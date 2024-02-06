package paq_1_1;

public enum ContinentEnum {
	EUROPE(745173774L),
	ASIA(4694576167L),
	AFRICA(1393676444L),
	AMERICA((595783465L + 434254119L)),
	OCEANIA(44491724L),
	ANTARTICA(0L);
	// L used to tell Java the number is treated as a long int
	
	private final long population;
	
	ContinentEnum(long population) {
		this.population = population;
	}
	
	public long getPopulation() {
		return this.population;
	}
}
