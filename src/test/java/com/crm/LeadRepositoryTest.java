package com.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;

import com.crm.entities.Lead;
import com.crmrepository.LeadRepository;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LeadRepositoryTest {
	@Autowired
	private LeadRepository leadRepo;
	
	@Test
	public void saveOneLead() {
		Lead l = new Lead("md","muhafiz","muhafiz@gmail.com","Radio","9010976316");
		leadRepo.save(l);
		
		
	}
	

}
