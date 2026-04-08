package com.vbanking.vbanking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.vbanking.vbanking.Entity.Customer;

@Repository
public interface VoiceRepo extends JpaRepository<Customer, Long> {

    @Query(value="SELECT * FROM CUSTOMER",nativeQuery=true)
	List<Customer> getCustomers();

    @Query(value="SELECT CIFNO FROM CUSTOMER WHERE USERNAME = :username",nativeQuery=true)
    Long getCifNo(String username);
} 