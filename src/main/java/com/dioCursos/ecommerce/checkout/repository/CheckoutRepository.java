package com.dioCursos.ecommerce.checkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dioCursos.ecommerce.checkout.entity.CheckoutEntity;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long>{

}
