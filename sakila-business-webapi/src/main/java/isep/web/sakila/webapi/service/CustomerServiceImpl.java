package isep.web.sakila.webapi.service;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import isep.web.sakila.dao.repositories.CustomerRepository;
import isep.web.sakila.jpa.entities.Customer;
import isep.web.sakila.webapi.model.CustomerWO;
import isep.web.sakila.dao.repositories.AddressRepository;
import isep.web.sakila.jpa.entities.Address;
import isep.web.sakila.webapi.model.AddressWO;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerRepository addressRepository;
	@Autowired
	private CustomerRepository cityRepository;
	
	private static final Log log= LogFactory.getLog(CustomerServiceImpl.class);

	@Override
	public CustomerWO findById(int id) {
		log.debug(String.format("Looking for customer by Id %s", id));
		Customer customer = customerRepository.findOne(id);
		

		if (customer != null)
		{
			return new CustomerWO(customer);
		}
		return null;
	}

	public List<CustomerWO> findAllCustomers()
	{
		List<CustomerWO> customers = new LinkedList<CustomerWO>();

		for (Customer customer : customerRepository.findAll())
		{
			customers.add(new CustomerWO(customer));
			log.debug("Adding " + customer);
		}

		return customers;
	}

	public void saveCustomer(CustomerWO customerWO)
	{
		Customer customer = new Customer();
		customer.setLastName(customerWO.getLastName());
		customer.setFirstName(customerWO.getFirstName());
		customer.setEmail(customerWO.getEmail());
		customer.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		customerRepository.save(customer);
	}

	public void updateCustomer(CustomerWO customerWO)
	{
		Customer actor2update = customerRepository.findOne(customerWO.getCustomerId());
		actor2update.setLastName(customerWO.getLastName());
		actor2update.setFirstName(customerWO.getFirstName());
		actor2update.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		customerRepository.save(actor2update);
	}

	@Override
	public void deleteCustomerById(int id)
	{
		customerRepository.delete(id);
	}

}
