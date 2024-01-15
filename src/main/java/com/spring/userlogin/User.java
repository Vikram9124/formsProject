package com.spring.userlogin;

import jakarta.persistence.Entity;
import jakarta.persistence.*; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private Long id;

	private String companyNameExisting;
	private String countryOfIncorporation;
	private String streetDetails;
	private String contactPersonName;
	private String countryCode;
	private String country;
	private String city;
	private String customerRequest;

	private String companyNameNew;
	private String address;
	private String companyWebsite;
	private String emailAddress;
	private String contactNumber;
	private String state;
	private String pincode;
	private String proofOfIdentity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyNameExisting() {
		return companyNameExisting;
	}

	public void setCompanyNameExisting(String companyNameExisting) {
		this.companyNameExisting = companyNameExisting;
	}

	public String getCountryOfIncorporation() {
		return countryOfIncorporation;
	}

	public void setCountryOfIncorporation(String countryOfIncorporation) {
		this.countryOfIncorporation = countryOfIncorporation;
	}

	public String getStreetDetails() {
		return streetDetails;
	}

	public void setStreetDetails(String streetDetails) {
		this.streetDetails = streetDetails;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustomerRequest() {
		return customerRequest;
	}

	public void setCustomerRequest(String customerRequest) {
		this.customerRequest = customerRequest;
	}

	public String getCompanyNameNew() {
		return companyNameNew;
	}

	public void setCompanyNameNew(String companyNameNew) {
		this.companyNameNew = companyNameNew;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getProofOfIdentity() {
		return proofOfIdentity;
	}

	public void setProofOfIdentity(String proofOfIdentity) {
		this.proofOfIdentity = proofOfIdentity;
	}

	public User(Long id, String companyNameExisting, String countryOfIncorporation, String streetDetails,
			String contactPersonName, String countryCode, String country, String city, String customerRequest,
			String companyNameNew, String address, String companyWebsite, String emailAddress, String contactNumber,
			String state, String pincode, String proofOfIdentity) {
		super();
		this.id = id;
		this.companyNameExisting = companyNameExisting;
		this.countryOfIncorporation = countryOfIncorporation;
		this.streetDetails = streetDetails;
		this.contactPersonName = contactPersonName;
		this.countryCode = countryCode;
		this.country = country;
		this.city = city;
		this.customerRequest = customerRequest;
		this.companyNameNew = companyNameNew;
		this.address = address;
		this.companyWebsite = companyWebsite;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.state = state;
		this.pincode = pincode;
		this.proofOfIdentity = proofOfIdentity;
	}

	public User() {
		super();
	}

	// Getters and setters
}
