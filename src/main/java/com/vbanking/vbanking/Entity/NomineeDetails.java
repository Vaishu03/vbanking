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
@Table(name = "NomineeDetails")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class NomineeDetails {

    @Id
    @Column(name = "acno")
    private long acno;

	@Column(name = "nomineename")
	private String nomineename;

    @Column(name = "nomineerelation")
	private String nomineerelation;

    @Column(name = "nomineemobilenumber")
	private Long nomineemobilenumber;

    @Column(name = "nomineeshare")
	private Long nomineeshare;

}