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


@Entity
@Table(name = "AccDetails")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AccDetails {

    @Id
    @Column(name = "acno")
    private Long acno;

    @Column(name = "balance")
	private Long balance;

	@Column(name = "cifno")
	private Long cifno;

    @Column(name = "inb_facility")
	private char inb_facility;

    @Column(name = "debit_card")
	private char debit_card;

    @Column(name = "aadhar_linkage")
	private char aadhar_linkage;

    @Column(name = "kyc_enquiry")
	private char kyc_enquiry;

    @Column(name = "nominee_details")
	private Character nominee_details;

    @Column(name = "mobilenumber")
	private Long mobilenumber;
}