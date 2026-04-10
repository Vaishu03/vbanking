package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.TransactionRepo;
import com.vbanking.vbanking.Entity.Transactions;
// import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;

@Service
public class TransactionService {

    @Autowired
	private final TransactionRepo transactionRepo;

    public TransactionService(TransactionRepo transactionRepo) 
	{
		this.transactionRepo = transactionRepo;
	}

	public List<Transactions> getlastfivetransactions(Long acno){     
		return transactionRepo.getlastfivetransactions(acno);
	}
}