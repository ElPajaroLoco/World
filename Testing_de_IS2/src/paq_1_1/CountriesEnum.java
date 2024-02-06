package paq_1_1;

public enum CountriesEnum {
	USA(ContinentEnum.AMERICA, 3, LanguagesEnum.ENGLISH),
	CANADA(ContinentEnum.AMERICA, 4, LanguagesEnum.ENGLISH),
	BRAZIL(ContinentEnum.AMERICA, 3, LanguagesEnum.BRAZILIAN),
    ARGENTINA(ContinentEnum.AMERICA, 2, LanguagesEnum.SPANISH),
    CHINA(ContinentEnum.ASIA, 3, LanguagesEnum.CHINESE),
    INDIA(ContinentEnum.ASIA, 4, LanguagesEnum.HINDI),
    EGYPT(ContinentEnum.AFRICA, 3, LanguagesEnum.ARABIC),
    SOUTH_AFRICA(ContinentEnum.AFRICA, 3, LanguagesEnum.AFRIKAANS),
    FRANCE(ContinentEnum.EUROPE, 3, LanguagesEnum.FRENCH),
    SPAIN(ContinentEnum.EUROPE, 3, LanguagesEnum.SPANISH),
    GERMANY(ContinentEnum.EUROPE, 3, LanguagesEnum.GERMAN),
    AUSTRALIA(ContinentEnum.OCEANIA, 3, LanguagesEnum.ENGLISH),
    NEW_ZEALAND(ContinentEnum.OCEANIA, 3, LanguagesEnum.ENGLISH),
    JAPAN(ContinentEnum.ASIA, 3, LanguagesEnum.JAPANESE);
	
	private final ContinentEnum continent;
	private final long population;
	private final LanguagesEnum lang;
	
	CountriesEnum(ContinentEnum continent, long population, LanguagesEnum lang) {
		this.continent = continent;
		this.population = population;
		this.lang = lang;
	}
	
	public ContinentEnum getContinent() {
		return (this.continent);
	}
	
	public long getPopulation() {
		return (this.population);
	}
	
	public LanguagesEnum getLanguage() {
		return (this.lang);
	}
}
