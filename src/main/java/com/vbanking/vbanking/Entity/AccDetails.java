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
    @Column(name = "ACNO")
    private Long acno;

    @Column(name = "BALANCE")
	private Long balance;

	@Column(name = "CIFNO")
	private Long cifno;
}