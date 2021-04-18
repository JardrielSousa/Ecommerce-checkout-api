package com.dioCursos.ecommerce.checkout.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dioCursos.ecommerce.checkout.entity.CheckoutEntity;
import com.dioCursos.ecommerce.checkout.enums.StatusCheckoutEnum;
import com.dioCursos.ecommerce.checkout.repository.CheckoutRepository;
import com.dioCursos.ecommerce.checkout.resource.checkout.CheckoutRequest;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService{
	
	private final CheckoutRepository checkoutRepository;
	
	@Override
	public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
		final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
				.code(UUID.randomUUID().toString())
				.status(StatusCheckoutEnum.CREATED)
				.build();
		return Optional.of(checkoutRepository.save(checkoutEntity));
	}


}
