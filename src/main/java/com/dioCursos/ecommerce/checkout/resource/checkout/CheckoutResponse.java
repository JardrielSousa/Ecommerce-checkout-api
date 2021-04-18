package com.dioCursos.ecommerce.checkout.resource.checkout;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private String code;
}
