package isep.web.sakila.webapi.service;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import isep.web.sakila.dao.repositories.AddressRepository;
import isep.web.sakila.jpa.entities.Address;
import isep.web.sakila.webapi.model.AddressWO;

public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	private static final Log log= LogFactory.getLog(AddressServiceImpl.class);

	@Override
	public AddressWO findById(int id) {
		log.debug(String.format("Looking for address by Id %s", id));
		Address address = addressRepository.findOne(id);

		if (address != null)
		{
			return new AddressWO(address);
		}
		return null;
	}
}
