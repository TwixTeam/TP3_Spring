package isep.web.sakila.webapi.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import isep.web.sakila.jpa.entities.City;
import isep.web.sakila.dao.repositories.CityRepository;
import isep.web.sakila.webapi.model.CityWO;

public class CityServiceImpl implements CityService{
	
	private static final Log log= LogFactory.getLog(CityServiceImpl.class);

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public CityWO findById(int id) {
		log.debug(String.format("Looking for address by Id %s", id));
		City address = cityRepository.findOne(id);

		if (address != null)
		{
			return new CityWO(address);
		}
		return null;
	}

	@Override
	public List<CityWO> findAllCountries() {
		// TODO Auto-generated method stub
		return null;
	}

}