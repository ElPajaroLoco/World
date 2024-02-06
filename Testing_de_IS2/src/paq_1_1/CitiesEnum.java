package paq_1_1;

public enum CitiesEnum {
	MADRID(CountriesEnum.SPAIN,6783241L, 10, 10),
	TOKYO(CountriesEnum.JAPAN, 37115035L, 10, 10),
	WASHINGTON_D_C(CountriesEnum.USA, 689545L, 10, 10),
	OTTAWA(CountriesEnum.CANADA, 1451571L, 10, 10),
	BRASILIA(CountriesEnum.BRAZIL, 4935274L, 10, 10),
	BUENOS_AIRES(CountriesEnum.ARGENTINA, 15618288L, 10, 10),
	BEIJIN(CountriesEnum.CHINA, 22189082L, 10, 10),
	NEW_DELHI(CountriesEnum.INDIA, 33807000L, 10, 10),
	CAIRO(CountriesEnum.EGYPT, 22623874L, 10, 10),
	CAPE_TOWN(CountriesEnum.SOUTH_AFRICA, 4977833L, 10, 10),
	PARIS(CountriesEnum.FRANCE, 11276701L, 10, 10),
	BERLIN(CountriesEnum.GERMANY, 3576873L, 10, 10),
	CANBERRA(CountriesEnum.AUSTRALIA, 395790L, 10, 10),
	WELLINGTON(CountriesEnum.NEW_ZEALAND, 202737L, 10, 10)
	;
	
	private CountriesEnum country;
	private long population;
	private int dimX;
	private int dimY;
	
	CitiesEnum(CountriesEnum country, long population, int dimX, int dimY) {
		this.country = country;
		this.population = population;
		this.dimX = dimX;
		this.dimY = dimY;
	}
	
	public CountriesEnum getCountry() {
		return this.country;
	}
	
	public long getPopulation() {
		return this.population;
	}
	
	public int getDimX() {
		return this.dimX;
	}
	
	public int getDimY() {
		return this.dimY;
	}
}
