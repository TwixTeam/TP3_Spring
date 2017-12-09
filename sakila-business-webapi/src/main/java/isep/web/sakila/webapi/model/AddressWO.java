package isep.web.sakila.webapi.model;

import isep.web.sakila.jpa.entities.Address;

public class AddressWO extends WebObject {

	private static final long serialVersionUID = -6521276739474548000L;
	
	private int addressId;
	private String address;
	private String address2;
	private String district;
	private CityWO city;
	private String postalCode;
	private String phone;
	
	public AddressWO()
	{
		super();
	}

	public AddressWO(int addressId, String address, String address2, String district, CityWO city, String postalCode, String phone)
	{
		super();
		this.addressId = addressId;
		this.address = address;
		this.address2 = address2;
		this.district = district;
		this.city = city;
		this.postalCode = postalCode;
		this.phone = phone;
		
	}

	public AddressWO(final Address address)
	{
		super();
		this.addressId = address.getAddressId();
		this.address = address.getAddress();
		this.address2 = address.getAddress2();
		this.district = address.getDistrict();
		this.city = new CityWO(address.getCity());
		this.postalCode = address.getPostalCode();
		this.phone = address.getPhone();
	}

	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public CityWO getCity() {
		return city;
	}
	public void setCity(CityWO city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString()
	{
		return "Address [id=" + this.addressId + ", address=" + this.address + ", address2=" + this.address2 +
				", district=" + this.district + ", postalCode=" + this.postalCode + ", phone=" + this.phone +
				 " " + this.city +"]";
	}
}
