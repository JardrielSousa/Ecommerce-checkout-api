package com.dioCursos.ecommerce.checkout.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.dioCursos.ecommerce.checkout.enums.StatusCheckoutEnum;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class CheckoutEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String code;
	
	@Column
	@Enumerated(EnumType.STRING)
	private StatusCheckoutEnum status;

}
