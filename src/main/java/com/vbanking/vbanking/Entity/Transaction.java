package com.vbanking.vbanking.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.*;



@Entity
@Table(name = "Transaction")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name = "ACNO")
    private Long acno;

    @Column(name = "DATE")
	private Date date;

	@Column(name = "FROM")
	private String from;

    @Column(name = "TO")
	private String to;

    @Column(name = "AMOUNT")
	private String amount;



}