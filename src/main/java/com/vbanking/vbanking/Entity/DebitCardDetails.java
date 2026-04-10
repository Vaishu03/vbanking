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
@Table(name = "DebitCardDetails")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class DebitCardDetails {

   
    @Column(name = "acno")
    private long acno;

    @Id
    @Column(name = "cardnumber")
	private long cardnumber;

	@Column(name = "cardholdername")
	private String cardholdername;

    @Column(name = "validfrom")
	private Date validfrom;

    @Column(name = "validtill")
	private Date validtill;

    @Column(name = "cvv")
	private int cvv;
}
