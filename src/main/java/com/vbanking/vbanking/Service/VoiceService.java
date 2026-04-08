package com.vbanking.vbanking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.vbanking.vbanking.Repository.VoiceRepo;
import com.vbanking.vbanking.Entity.Customer;



@Service
public class VoiceService {

    @Autowired
	private final VoiceRepo voiceRepo;

    public VoiceService(VoiceRepo voiceRepo) 
	{
		this.voiceRepo = voiceRepo;
	}

    public List<Customer> getCustomers()
	{
		return voiceRepo.getCustomers();
	}


}