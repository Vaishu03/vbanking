package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.NomineeRepo;
import com.vbanking.vbanking.Entity.NomineeDetails;
// import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;

@Service
public class NomineeService {

    @Autowired
	private final NomineeRepo nomineeRepo;

    public NomineeService(NomineeRepo nomineeRepo) 
	{
		this.nomineeRepo = nomineeRepo;
	}

	public List<NomineeDetails> getNomineeDetails(Long acno){     
		return nomineeRepo.getNomineeDetails(acno);
	}
}