package isep.web.sakila.webapi.model;

import isep.web.sakila.jpa.entities.City;


public class CityWO extends WebObject {

	private static final long serialVersionUID = -810104683296886022L;
	
	private int cityId;
	private String city;
	private CountryWO country;
	
	public CityWO()
	{
		super();
	}

	public CityWO(int cityId, String city)
	{
		super();
		this.cityId= cityId;
		this.city=city;
		
	}

	public CityWO(final City city)
	{
		super();
		this.cityId= city.getCityId();
		this.city=city.getCity();
		this.country= new CountryWO(city.getCountry());
	}
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public CountryWO getCountry() {
		return country;
	}
	public void setCountry(CountryWO country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString()
	{
		return "Address [id=" + this.cityId + ", address=" + this.city +
				 " " + this.country +"]";
	}

}
