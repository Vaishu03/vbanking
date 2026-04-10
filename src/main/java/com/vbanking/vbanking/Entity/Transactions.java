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
@Table(name = "Transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Transactions {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name = "acno")
    private Long acno;

    @Column(name = "date")
	private Date date;

	@Column(name = "from_acc")
	private String from_acc;

    @Column(name = "to_acc")
	private String to_acc;

    @Column(name = "amount")
	private String amount;
}