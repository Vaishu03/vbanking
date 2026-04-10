package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.AccRepo;
import com.vbanking.vbanking.Entity.AccDetails;
import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;
import com.vbanking.vbanking.Repository.Projection.InbFacility;
import com.vbanking.vbanking.Repository.Projection.DebitCardFacility;
import com.vbanking.vbanking.Repository.Projection.AadharLinkage;
import com.vbanking.vbanking.Repository.Projection.KycEnquiry;
import com.vbanking.vbanking.Repository.Projection.NomineeFacility;


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

	public Long getAcno(Long cifNo)
	{
		return accRepo.getAcno(cifNo);
	}

	public List<InbFacility> getInbFacility(Long cifNo)
	{
		return accRepo.getInbFacility(cifNo);
	}

	public List<DebitCardFacility> getDebitCardFacility(Long cifNo)
	{
		return accRepo.getDebitCardFacility(cifNo);
	}

	public List<AadharLinkage> getAadharLinkage(Long cifNo)
	{
		return accRepo.getAadharLinkage(cifNo);
	}

	public List<KycEnquiry> getKycEnquiry(Long cifNo)
	{
		return accRepo.getKycEnquiry(cifNo);
	}

	public List<NomineeFacility> getnomineeFacility(Long cifNo)
	{
		return accRepo.getnomineeFacility(cifNo);
	}
    
}