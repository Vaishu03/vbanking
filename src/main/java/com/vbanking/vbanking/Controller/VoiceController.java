package com.vbanking.vbanking;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.vbanking.vbanking.Entity.Customer;
import com.vbanking.vbanking.Entity.AccDetails;
import com.vbanking.vbanking.Entity.Transactions;
import com.vbanking.vbanking.Entity.CreditCarddetails;
import com.vbanking.vbanking.Entity.DebitCardDetails;
import com.vbanking.vbanking.Entity.NomineeDetails;
import com.vbanking.vbanking.Service.VoiceService;
import com.vbanking.vbanking.Service.AccService;
import com.vbanking.vbanking.Service.AuthService;
import com.vbanking.vbanking.Service.TransactionService;
import com.vbanking.vbanking.Service.CreditCardService;
import com.vbanking.vbanking.Service.DebitCardService;
import com.vbanking.vbanking.Service.NomineeService;
import com.vbanking.vbanking.DTO.CustomerDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;
import com.vbanking.vbanking.Repository.Projection.InbFacility;
import com.vbanking.vbanking.Repository.Projection.DebitCardFacility;
import com.vbanking.vbanking.Repository.Projection.AadharLinkage;
import com.vbanking.vbanking.Repository.Projection.KycEnquiry;
import com.vbanking.vbanking.Repository.Projection.NomineeFacility;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class VoiceController {

    private final VoiceService voiceService;
    private final AccService accService;
	private final AuthService authService;
    private final TransactionService transactionService;
    private final CreditCardService creditCardService;
    private final DebitCardService debitCardService;
    private final NomineeService nomineeService;


	public VoiceController(VoiceService voiceService,AccService accService,AuthService authService,TransactionService transactionService,
                            CreditCardService creditCardService,DebitCardService debitCardService,
                            NomineeService nomineeService)
	{
		this.voiceService = voiceService;
        this.accService = accService;
        this.authService = authService;
        this.transactionService = transactionService;
        this.creditCardService = creditCardService;
        this.debitCardService = debitCardService;
        this.nomineeService = nomineeService;
	}

    // ✅ Health check
    @GetMapping("/voice")
    public String voice() {
        return "App is Running";
    }

    @GetMapping("/getcustomers")
    public List<Customer> getCustomers(){
        return voiceService.getCustomers();
    }

    @GetMapping("/getAccdetails")
    public List<AccDetails> getAccdetails(){
        return accService.getAccdetails();
    }

    @GetMapping("/getbalance/{cifNo}")
    public List<AccdetailsProjection> getBalance(@PathVariable Long cifNo){
        // Map<Long,Object> response = new HashMap<>();

        // System.out.print("Cif is", cifNo);
        return accService.getBalance(cifNo);
    }

    @GetMapping("/getlastfivetransactions/{cifNo}")
    public List<Transactions> getTransactions (@PathVariable Long cifNo){
        Long acno = accService.getAcno(cifNo);
        return transactionService.getlastfivetransactions(acno);
    }

    @GetMapping("/getCreditcarddetails/{cifNo}")
    public List<CreditCarddetails> getCreditcarddetails (@PathVariable Long cifNo){
        Long acno = accService.getAcno(cifNo);
        return creditCardService.getCreditcarddetails(acno);
    }


    @PostMapping("/login")
	public ResponseEntity<Map<String,Long>> login(@RequestBody CustomerDTO dto)
	{
		Map<String,Long> response = authService.Login(dto);
		return ResponseEntity.ok(response);
	}

    @GetMapping("/inb_facility/{cifNo}")
    public List<InbFacility> getInbFacility(@PathVariable Long cifNo){

        // Long acno = accService.getAcno(cifNo);
        return accService.getInbFacility(cifNo);
    }

    @GetMapping("/debit_card_facility/{cifNo}")
    public List<DebitCardFacility> getDebitCardFacility(@PathVariable Long cifNo){

        // Long acno = accService.getAcno(cifNo);
        return accService.getDebitCardFacility(cifNo);
    }

     @GetMapping("/aadhar_linkage/{cifNo}")
    public List<AadharLinkage> getAadharLinkage(@PathVariable Long cifNo){

        // Long acno = accService.getAcno(cifNo);
        return accService.getAadharLinkage(cifNo);
    }

     @GetMapping("/debitcarddetails/{cifNo}")
    public List<DebitCardDetails> getDebitCardDetails(@PathVariable Long cifNo){

         Long acno = accService.getAcno(cifNo);
        return debitCardService.getDebitCardDetails(acno);
    }

     @GetMapping("/nomineedetails/{cifNo}")
    public List<NomineeDetails> getNomineeDetails(@PathVariable Long cifNo){

         Long acno = accService.getAcno(cifNo);
        return nomineeService.getNomineeDetails(acno);
    }


    @GetMapping("/kycEnquiry/{cifNo}")
    public List<KycEnquiry> getKycEnquiry(@PathVariable Long cifNo){

        // Long acno = accService.getAcno(cifNo);
        return accService.getKycEnquiry(cifNo);
    }

     @GetMapping("/nomineefacility/{cifNo}")
    public List<NomineeFacility> getnomineeFacility(@PathVariable Long cifNo){

        // Long acno = accService.getAcno(cifNo);
        return accService.getnomineeFacility(cifNo);
    }
}