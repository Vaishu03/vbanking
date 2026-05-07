package com.vbanking.vbanking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.vbanking.vbanking.Entity.CreditCarddetails;

@Repository
public interface CreditCardRepo extends JpaRepository<CreditCarddetails, Long> {

    @Query(value="SELECT * FROM credit_carddetails WHERE acno =:acno ",nativeQuery=true)
	List<CreditCarddetails> getCreditcarddetails(Long acno);

} 