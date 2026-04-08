package com.vbanking.vbanking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.vbanking.vbanking.Entity.AccDetails;
import com.vbanking.vbanking.Repository.Projection.AccdetailsProjection;

@Repository
public interface AccRepo extends JpaRepository<AccDetails, Long> {

    @Query(value="SELECT * FROM ACCDETAILS",nativeQuery=true)
	List<AccDetails> getAccdetails();

     @Query(value="SELECT acno,balance FROM accdetails WHERE cifno = :cifNo",nativeQuery=true)
    List<AccdetailsProjection> getBalance(Long cifNo);
} 