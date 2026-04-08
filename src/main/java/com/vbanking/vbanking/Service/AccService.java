package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.AccRepo;
import com.vbanking.vbanking.Entity.AccDetails;
import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;


@Service
public class AccService {

    @Autowired
	private final AccRepo accRepo;

    public AccService(AccRepo accRepo) 
	{
		this.accRepo = accRepo;
	}

	public List<AccDetails> getAccdetails()
	{
		return accRepo.getAccdetails();
	}

    public List<AccdetailsProjection> getBalance(Long cifNo){     
		return accRepo.getBalance(cifNo);
	}
    
}