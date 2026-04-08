package com.vbanking.vbanking;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.vbanking.vbanking.Entity.Customer;
import com.vbanking.vbanking.Entity.AccDetails;
import com.vbanking.vbanking.Service.VoiceService;
import com.vbanking.vbanking.Service.AccService;
import com.vbanking.vbanking.Service.AuthService;
import com.vbanking.vbanking.DTO.CustomerDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class VoiceController {

    private final VoiceService voiceService;
    private final AccService accService;
	private final AuthService authService;

	public VoiceController(VoiceService voiceService,AccService accService,AuthService authService)
	{
		this.voiceService = voiceService;
        this.accService = accService;
        this.authService = authService;
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

    // ✅ Balance API
    @GetMapping("/getbalance")
    public Map<String, Object> getBalance() {

        Map<String, Object> response = new HashMap<>();
        response.put("balance", 3800000);
        response.put("currency", "INR");

        return response;
    }

    @GetMapping("/getbalance/{cifNo}")
    public List<AccdetailsProjection> getBalance(@PathVariable Long cifNo){
        // Map<Long,Object> response = new HashMap<>();

        // System.out.print("Cif is", cifNo);
        return accService.getBalance(cifNo);
    }

    @GetMapping("/getlastfivetransactions")
    public List<transaction> getTransactions (){
        return
    }



    @PostMapping("/login")
	public ResponseEntity<Map<String,Long>> login(@RequestBody CustomerDTO dto)
	{
		Map<String,Long> response = authService.Login(dto);
		return ResponseEntity.ok(response);
	}





    // ✅ Mini Statement API
    @GetMapping("/statement")
    public List<Map<String, Object>> getStatement() {

        List<Map<String, Object>> transactions = new ArrayList<>();

        transactions.add(createTxn("Amazon", -1500, "05-Apr-2026"));
        transactions.add(createTxn("Salary Credit", +30000, "01-Apr-2026"));
        transactions.add(createTxn("Swiggy", -450, "30-Mar-2026"));
        transactions.add(createTxn("Electricity Bill", -1200, "28-Mar-2026"));

        return transactions;
    }

    // ✅ Transfer Money API
    @GetMapping("/creditcarddetails")
    public Map<String, Object> loanOutstandingAmount() {


          Map<String, Object> response = new HashMap<>();
        response.put("curroutstandingamount", 57486);
        response.put("totallimit", "75000");
        response.put("Duedate", "3rd of Every month");

        return response;


    //     String toAccount = request.get("toAccount").toString();
    //     int amount = Integer.parseInt(request.get("amount").toString());

    //     Map<String, Object> response = new HashMap<>();

    //     response.put("status", "SUCCESS");
    //     response.put("message", "₹" + amount + " transferred successfully to account " + toAccount);
    //     response.put("txnId", UUID.randomUUID().toString());

    //     System.out.println("Transferred " + amount + " to " + toAccount);

        // return response;
    }

    






    // 🔧 Helper method
    private Map<String, Object> createTxn(String desc, int amount, String date) {
        Map<String, Object> txn = new HashMap<>();
        txn.put("description", desc);
        txn.put("amount", amount);
        txn.put("date", date);
        return txn;
    }
}