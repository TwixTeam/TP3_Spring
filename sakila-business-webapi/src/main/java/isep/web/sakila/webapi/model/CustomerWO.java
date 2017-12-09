package isep.web.sakila.webapi.model;

import isep.web.sakila.jpa.entities.Customer;

public class CustomerWO extends WebObject {

	private static final long serialVersionUID = 4803037019034574852L;

	protected int customerId;
	protected String lastName;
	protected String firstName;
	protected String email;
	protected AddressWO address;

	public CustomerWO()
	{
		super();
	}

	public CustomerWO(int customerId, String lastName, String firstName, String email, AddressWO address)
	{
		super();
		this.customerId = customerId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
	}

	public CustomerWO(final Customer customer)
	{
		super();
		this.customerId = customer.getCustomerId();
		this.lastName = customer.getLastName();
		this.firstName = customer.getFirstName();
		this.address = new AddressWO(customer.getAddress());
	}

	public String getFirstName()
	{
		return firstName;
	}

	public int getCustomerId()
	{
		return customerId;
	}

	public String getLastName()
	{
		return lastName;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public AddressWO getAddressWO() 
	{
		return address;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	

	@Override
	public String toString()
	{
		return "Customer [id=" + this.customerId + ", LastName=" + this.lastName + ", First=" + this.firstName +
				", Email=" + this.email + " " + this.address + "]";
	}
}
