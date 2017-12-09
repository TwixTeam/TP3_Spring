package isep.web.sakila.webapi.model;

import isep.web.sakila.jpa.entities.City;

public class CityWO extends WebObject {

	private static final long serialVersionUID = -810104683296886022L;

	private int cityId;
	private String city;
	private CountryWO country;
	
	public CityWO() {
		super();
	}
	
	public CityWO(int cityId, String city, CountryWO country ) {
		this.cityId = cityId;
		this.city = city;
		this.country = country;
	}
	
	public CityWO(final City city ) {
		this.cityId = city.getCityId();
		this.city = city.getCity();
		this.country = new CountryWO(city.getCountry());
	}
	
	@Override
	public String toString()
	{
		return "City [id=" + this.cityId + ", city=" + this.city + " " + this.country + "]";
	}

}
