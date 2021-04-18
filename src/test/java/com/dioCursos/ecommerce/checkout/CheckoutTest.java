package com.dioCursos.ecommerce.checkout;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;
import java.util.UUID;

import org.apache.catalina.filters.CorsFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.dioCursos.ecommerce.checkout.entity.CheckoutEntity;
import com.dioCursos.ecommerce.checkout.resource.checkout.CheckoutRequest;
import com.dioCursos.ecommerce.checkout.resource.checkout.CheckoutResource;
import com.dioCursos.ecommerce.checkout.service.CheckoutService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckoutTest {

	private static final String V1_CHECKOUT = "http://localhost:8080/v1/checkout/";

	private MockMvc mockMvc;

	@Mock
	private CheckoutService userService;

	@InjectMocks
	private CheckoutResource userController;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(userController).addFilters(new CorsFilter()).build();
	}

	@Test
	public void test_create_checkout_success() throws Exception {
		CheckoutRequest user = setCheckoutRequest();
		final CheckoutEntity checkoutEntity = setCodeToCheckout();
		when(userService.create(user)).thenReturn(Optional.of(checkoutEntity));
		mockMvc.perform(post(V1_CHECKOUT).contentType(MediaType.APPLICATION_JSON).content(asJsonString(user)))
				.andExpect(status().isCreated());
		verify(userService, times(1)).create(user);
		verifyNoMoreInteractions(userService);
	}

	private CheckoutEntity setCodeToCheckout() {
		new CheckoutEntity();
		final CheckoutEntity checkoutEntity = CheckoutEntity.builder().code(UUID.randomUUID().toString()).build();
		return checkoutEntity;
	}

	private CheckoutRequest setCheckoutRequest() {
		CheckoutRequest user = new CheckoutRequest();
		user.setFirstName("jardriel");
		return user;
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
