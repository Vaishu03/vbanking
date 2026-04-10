package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.DebitCardRepo;
import com.vbanking.vbanking.Entity.DebitCardDetails;
// import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;

@Service
public class DebitCardService {

    @Autowired
	private final DebitCardRepo debitCardRepo;

    public DebitCardService(DebitCardRepo debitCardRepo) 
	{
		this.debitCardRepo = debitCardRepo;
	}

	public List<DebitCardDetails> getDebitCardDetails(Long acno){     
		return debitCardRepo.getDebitCardDetails(acno);
	}
}