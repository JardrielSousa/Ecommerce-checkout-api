package com.dioCursos.ecommerce.checkout.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class CheckoutEntity {
	@Id
	private Long id;
	
	@Column
	private String code;

}
