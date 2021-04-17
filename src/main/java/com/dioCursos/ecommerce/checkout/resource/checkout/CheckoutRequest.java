package com.dioCursos.ecommerce.checkout.resource.checkout;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable{
	private static final long serialVersionUID = 1272698986694735763L;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String complement;
	private String country;
	private String state;
	private String cep;
	private boolean saveAddress;
	private boolean saveInfo;
	private String paymentMethod;
	private String cardName;
	private String cardNumber;
	private String cardDate;
	private String cardCvv;

}
