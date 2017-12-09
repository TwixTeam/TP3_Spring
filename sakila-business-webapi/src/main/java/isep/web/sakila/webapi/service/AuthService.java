//package isep.web.sakila.webapi.service;
//
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.nelioalves.cursomc.domain.Cliente;
//import com.nelioalves.cursomc.repositories.ClienteRepository;
//import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;
//
//import isep.web.sakila.dao.repositories.CustomerRepository;
//import isep.web.sakila.dao.repositories.StaffRepository;
//import isep.web.sakila.jpa.entities.Customer;
//import isep.web.sakila.jpa.entities.Staff;
//
//@Service
//public class AuthService {
//
//	@Autowired
//	private StaffRepository staffRepository;
//	
//	@Autowired
//	private BCryptPasswordEncoder pe;
//	
//	@Autowired
//	private EmailService emailService;
//	
//	private Random rand = new Random();
//	
//	public void sendNewPassword(String email) {
//		
//		Staff staff = staffRepository.findByEmail(email);
//		if (staff == null) {
//			throw new ObjectNotFoundException("Email não encontrado");
//		}
//		
//		String newPass = newPassword();
//		
//		staff.setPassword(pe.encode(newPass));
//		
//		staffRepository.save(staff);
//		emailService.sendNewPasswordEmail(staff, newPass);
//	}
//
//	private String newPassword() {
//		char[] vet = new char[10];
//		for (int i=0; i<10; i++) {
//			vet[i] = randomChar();
//		}
//		return new String(vet);
//	}
//
//	private char randomChar() {
//		int opt = rand.nextInt(3);
//		if (opt == 0) { // gera um digito
//			return (char) (rand.nextInt(10) + 48);
//		}
//		else if (opt == 1) { // gera letra maiuscula
//			return (char) (rand.nextInt(26) + 65);
//		}
//		else { // gera letra minuscula
//			return (char) (rand.nextInt(26) + 97);
//		}
//	}
//}
