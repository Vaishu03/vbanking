package com.vbanking.vbanking.DTO;

import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter	
@Setter
public class CustomerDTO {
	
	@NotBlank
	private Long cifno;
	
	@NotBlank
	private String username;
	
	@NotBlank
	private String password;

	   public Long getCifno() {
        return cifno;
    }

    public void setCifno(Long cifno) {
        this.cifno = cifno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
