package soo.md.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import soo.md.domain.Address;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AddressServiceTests {
	@Setter(onMethod_= {@Autowired})
	private AddressService addressService;
	
	/*
	@Test
	public void listS(){
		log.info("#AddressSerivceTests addressService: " + addressService);
		List<Address> list = addressService.listS();
		log.info("#AddressSerivceTests list: " + list);
	}*/
	
	/*
	@Test
	public void insertS() {
		Address address = new Address(-1L, "최민정", "대한민국", null);
		addressService.insertS(address);
		log.info("#AddressSerivceTests insertS() 완료");
	}*/
	@Test
	public void deleteS() {
		long seq = 6L;
		addressService.deleteS(seq);
		log.info("#AddressSerivceTests deleteS() 완료");
	}
}
