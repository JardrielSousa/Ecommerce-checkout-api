package com.dioCursos.ecommerce.checkout.resource.checkout;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {
	
	public ResponseEntity<Void> create(CheckoutRequest checkoutRequest){
		return ResponseEntity.ok().build();
	}

}
