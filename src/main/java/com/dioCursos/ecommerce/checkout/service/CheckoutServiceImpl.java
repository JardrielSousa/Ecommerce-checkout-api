package com.dioCursos.ecommerce.checkout.service;

import org.springframework.stereotype.Service;

import com.dioCursos.ecommerce.checkout.entity.CheckoutEntity;
import com.dioCursos.ecommerce.checkout.repository.CheckoutRepository;
import com.dioCursos.ecommerce.checkout.resource.checkout.CheckoutRequest;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService{
	
	private final CheckoutRepository checkoutRepository;

	@Override
	public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
