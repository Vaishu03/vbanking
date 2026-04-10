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
import com.vbanking.vbanking.Repository.Projection.InbFacility;
import com.vbanking.vbanking.Repository.Projection.DebitCardFacility;
import com.vbanking.vbanking.Repository.Projection.AadharLinkage;
import com.vbanking.vbanking.Repository.Projection.KycEnquiry;
import com.vbanking.vbanking.Repository.Projection.NomineeFacility;


@Repository
public interface AccRepo extends JpaRepository<AccDetails, Long> {

    @Query(value="SELECT * FROM accdetails",nativeQuery=true)
	List<AccDetails> getAccdetails();

     @Query(value="SELECT acno,balance FROM accdetails WHERE cifno = :cifNo",nativeQuery=true)
    List<AccdetailsProjection> getBalance(Long cifNo);

    @Query(value="SELECT acno FROM accdetails where cifno = :cifNo  order by acno LIMIT 1",nativeQuery=true)
    Long getAcno(Long cifNo);

    @Query(value="SELECT acno,inb_facility from accdetails where cifno =:cifNo",nativeQuery=true)
    List<InbFacility> getInbFacility(Long cifNo);

     @Query(value="SELECT acno,debit_card from accdetails where cifno =:cifNo",nativeQuery=true)
    List<DebitCardFacility> getDebitCardFacility(Long cifNo);

     @Query(value="SELECT acno,aadhar_linkage from accdetails where cifno =:cifNo",nativeQuery=true)
    List<AadharLinkage> getAadharLinkage(Long cifNo);

    @Query(value="SELECT acno,kyc_enquiry from accdetails where cifno =:cifNo",nativeQuery=true)
    List<KycEnquiry> getKycEnquiry(Long cifNo);

     @Query(value="SELECT acno,nominee_facility from accdetails where cifno =:cifNo",nativeQuery=true)
    List<NomineeFacility> getnomineeFacility(Long cifNo);

} 