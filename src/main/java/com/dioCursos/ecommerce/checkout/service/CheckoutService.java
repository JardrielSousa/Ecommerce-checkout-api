package com.dioCursos.ecommerce.checkout.service;

import com.dioCursos.ecommerce.checkout.entity.CheckoutEntity;
import com.dioCursos.ecommerce.checkout.resource.checkout.CheckoutRequest;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public interface CheckoutService {
	
	Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

}
