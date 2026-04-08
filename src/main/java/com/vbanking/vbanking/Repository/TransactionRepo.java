package com.vbanking.vbanking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.vbanking.vbanking.Entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {

    @Query(value="SELECT * FROM TRANSACTION WHERE ACNO =:acno ",nativeQuery=true)
	List<Transaction> getTransactionDetails(Long acno);

} 