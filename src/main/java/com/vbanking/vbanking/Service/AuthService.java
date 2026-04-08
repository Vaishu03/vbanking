package com.vbanking.vbanking.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.vbanking.vbanking.DTO.CustomerDTO;
import com.vbanking.vbanking.Repository.VoiceRepo;




@Service
public class AuthService {

    @Autowired
	private VoiceRepo voiceRepo;

    public Map<String,Long> Login(@RequestBody CustomerDTO dto)
	{
        Map<String,Long> response = new HashMap<>();
		 Long cifNo  = voiceRepo.getCifNo(dto.getUsername());
         response.put("CIFNO",cifNo);
         return response;

    }
}
