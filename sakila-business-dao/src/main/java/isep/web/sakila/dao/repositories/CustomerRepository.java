package isep.web.sakila.dao.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import isep.web.sakila.jpa.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>  {

	@Query("from Customer p where p.firstName = ?1")
	public Customer findCustomerByName(String nom);
}
