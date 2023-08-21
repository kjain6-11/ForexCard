package com.forexcard.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@NotBlank(message = "You must enter a name")
	private String name;
	
	@Email
	private String email;
	
	private String phoneNumber;
	
	private LocalDateTime dateOfBirth;
	
	private Long adhaarNumber;
	
	private Long panCardNumber;

	private String occupation;
	
	private Long annualIncome;
	
	private String paymentMode;
	
	private Address permanentAddress;
	
	private Address currentAddress;

	private BankDetails bankDetails;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@NotBlank(message = "You must enter a name") String name, @Email String email,
			String phoneNumber, LocalDateTime dateOfBirth, Long adhaarNumber, Long panCardNumber, String occupation,
			Long annualIncome, String paymentMode, Address permanentAddress, Address currentAddress, BankDetails bankDetails
			) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.adhaarNumber = adhaarNumber;
		this.panCardNumber = panCardNumber;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.paymentMode = paymentMode;
		this.permanentAddress = permanentAddress;
		this.currentAddress = currentAddress;
		this.bankDetails = bankDetails;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(Long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public Long getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(Long panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Long getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Long annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
}
