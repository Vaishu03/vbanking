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
@Table(name = "CreditCarddetails")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CreditCarddetails {

   
    @Column(name = "acno")
    private long acno;

    @Id
    @Column(name = "cardnumber")
	private long cardnumber;

	@Column(name = "cardlimit")
	private long card_limit;

    @Column(name = "outstanding")
	private long outstanding_limit;

    @Column(name = "duedate")
	private Date duedate;
}