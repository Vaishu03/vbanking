package com.vbanking.vbanking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.vbanking.vbanking.Entity.NomineeDetails;

@Repository
public interface NomineeRepo extends JpaRepository<NomineeDetails, Long> {

    @Query(value="SELECT * FROM nominee_details WHERE acno =:acno ",nativeQuery=true)
	List<NomineeDetails> getNomineeDetails(Long acno);

} 