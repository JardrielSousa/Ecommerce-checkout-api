package com.dioCursos.ecommerce.checkout.service;

import java.util.Optional;

import com.dioCursos.ecommerce.checkout.entity.CheckoutEntity;
import com.dioCursos.ecommerce.checkout.resource.checkout.CheckoutRequest;


public interface CheckoutService {
	
	Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

}
