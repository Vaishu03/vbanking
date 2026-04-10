package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.CreditCardRepo;
import com.vbanking.vbanking.Entity.CreditCarddetails;
// import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;

@Service
public class CreditCardService {

    @Autowired
	private final CreditCardRepo creditCardRepo;

    public CreditCardService(CreditCardRepo creditCardRepo) 
	{
		this.creditCardRepo = creditCardRepo;
	}

	public List<CreditCarddetails> getCreditcarddetails(Long acno){     
		return creditCardRepo.getCreditcarddetails(acno);
	}
}