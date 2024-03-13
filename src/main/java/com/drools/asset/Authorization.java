package com.drools.asset;

import java.math.BigDecimal;
import java.util.Date;

public class Authorization implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	
	private String accountNumber;
	private String accountStatus;
	private String accountStatusPosition1;
	private String accountStatusPosition2;
	private String accountStatusPosition3;
	private String acquirersBin;
	private String acquirersIca;
	private String acquiringInstitutionId;
	private String activationFlag;
	private String agreementStatus;
	private String authorisationNumber;
	private String authorisationProcessCode;
	private String authorisationSource;
	private String authorisationStatus;
	private String authorisationTransactionCode;
	private String authorizationGroup;
	private String blockCode;
	private String cardAcceptorIdCode;
	private String cardAcceptorNameLocation;
	private String cardAcceptorTerminal;
	private String cardActivationDate;
	private String cardHolderBillingAmount;
	private String cardHolderBillingcurrency;
	private String cardLimit;
	private String cardNumber;
	private String cardValidThrough;
	private String cardVerificationResultCode;
	private String chBillingDecimals;
	private String chipCardIndicator;
	private String chipConditionCode;
	private String chipTransactionIndicator;
	private String countryCode;
	private String cryptoCurrencyFlag;
	private BigDecimal currentBalance;
	private String customerEmail;
	private String customerGeographiclocation;
	private String customerIPAddress;
	private String customerMobileDeviceId;
	private String customerNumber;
	private String customerOperatingSystem;
	private String customerShippingAddressCity;
	private String customerShippingAddressCountry;
	private String customerShippingAddressLine1;
	private String customerShippingAddressLine2;
	private String customerShippingAddressPostcode;
	private String customerShippingAddressState;
	private String customerUserId;
	private String currencyCode;
	private String domestic;
	private String eciCode;
	private String fallbackInd;
	private String groupAccountNumber;
	private String groupCreditLimit;
	private String ippModelCode;
	private String ippTenure;
	private BigDecimal issuerCurrencyAmount;
	private String merchantAccountNo;
	private String merchantCategoryCode;
	private String merchantId;
	private String merchantTerminalId;
	private String networkAffiliationId;
	private String pinVerified;
	private String posConditionCode;
	private String posEntryMode;
	private String productId;
	private String referenceNumber;
	private String rejectReasonCode;
	private String responseCode;
	private String responseSourceReasonCode;
	private String retrievalReferenceNumber;
	private String riskCategoryCode;
	private String serviceCode;
	private String sourceCurrency;
	private BigDecimal sourceCurrencyAmount;
	private String subAccountCreditLimit;
	private String superGroupAccountNumber;
	private String superGroupCreditLimit;
	private String systemsTraceAuditNumber;
	private String transactionCodeGroup;
	private Date transactionDate;
	private String transactionId;
	private String trxGroupAccountNumber;
	private String typeOfAuthorisation;
	private String updateDateAndTime;
	private String userId;
	private String virtualActivationFlag;
	
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public String getAccountStatusPosition1() {
		return accountStatusPosition1;
	}
	public String getAccountStatusPosition2() {
		return accountStatusPosition2;
	}
	public String getAccountStatusPosition3() {
		return accountStatusPosition3;
	}
	public String getAcquirersBin() {
		return acquirersBin;
	}
	public String getAcquirersIca() {
		return acquirersIca;
	}
	public String getAcquiringInstitutionId() {
		return acquiringInstitutionId;
	}
	public String getActivationFlag() {
		return activationFlag;
	}
	public String getAgreementStatus() {
		return agreementStatus;
	}
	public String getAuthorisationNumber() {
		return authorisationNumber;
	}
	public String getAuthorisationProcessCode() {
		return authorisationProcessCode;
	}
	public String getAuthorisationSource() {
		return authorisationSource;
	}
	public String getAuthorisationStatus() {
		return authorisationStatus;
	}
	public String getAuthorisationTransactionCode() {
		return authorisationTransactionCode;
	}
	public String getAuthorizationGroup() {
		return authorizationGroup;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public String getCardAcceptorIdCode() {
		return cardAcceptorIdCode;
	}
	public String getCardAcceptorNameLocation() {
		return cardAcceptorNameLocation;
	}
	public String getCardAcceptorTerminal() {
		return cardAcceptorTerminal;
	}
	public String getCardActivationDate() {
		return cardActivationDate;
	}
	public String getCardHolderBillingAmount() {
		return cardHolderBillingAmount;
	}
	public String getCardHolderBillingcurrency() {
		return cardHolderBillingcurrency;
	}
	public String getCardLimit() {
		return cardLimit;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getCardValidThrough() {
		return cardValidThrough;
	}
	public String getCardVerificationResultCode() {
		return cardVerificationResultCode;
	}
	public String getChBillingDecimals() {
		return chBillingDecimals;
	}
	public String getChipCardIndicator() {
		return chipCardIndicator;
	}
	public String getChipConditionCode() {
		return chipConditionCode;
	}
	public String getChipTransactionIndicator() {
		return chipTransactionIndicator;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getCryptoCurrencyFlag() {
		return cryptoCurrencyFlag;
	}
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public String getCustomerGeographiclocation() {
		return customerGeographiclocation;
	}
	public String getCustomerIPAddress() {
		return customerIPAddress;
	}
	public String getCustomerMobileDeviceId() {
		return customerMobileDeviceId;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public String getCustomerOperatingSystem() {
		return customerOperatingSystem;
	}
	public String getCustomerShippingAddressCity() {
		return customerShippingAddressCity;
	}
	public String getCustomerShippingAddressCountry() {
		return customerShippingAddressCountry;
	}
	public String getCustomerShippingAddressLine1() {
		return customerShippingAddressLine1;
	}
	public String getCustomerShippingAddressLine2() {
		return customerShippingAddressLine2;
	}
	public String getCustomerShippingAddressPostcode() {
		return customerShippingAddressPostcode;
	}
	public String getCustomerShippingAddressState() {
		return customerShippingAddressState;
	}
	public String getCustomerUserId() {
		return customerUserId;
	}
	public String getDomestic() {
		return domestic;
	}
	public String getEciCode() {
		return eciCode;
	}
	public String getFallbackInd() {
		return fallbackInd;
	}
	public String getGroupAccountNumber() {
		return groupAccountNumber;
	}
	public String getGroupCreditLimit() {
		return groupCreditLimit;
	}
	public String getIppModelCode() {
		return ippModelCode;
	}
	public String getIppTenure() {
		return ippTenure;
	}

	public BigDecimal getIssuerCurrencyAmount() {
		return issuerCurrencyAmount;
	}

	public String getMerchantAccountNo() {
		return merchantAccountNo;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public String getMerchantTerminalId() {
		return merchantTerminalId;
	}
	public String getNetworkAffiliationId() {
		return networkAffiliationId;
	}
	public String getPinVerified() {
		return pinVerified;
	}
	public String getPosConditionCode() {
		return posConditionCode;
	}
	public String getPosEntryMode() {
		return posEntryMode;
	}
	public String getProductId() {
		return productId;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public String getRejectReasonCode() {
		return rejectReasonCode;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public String getResponseSourceReasonCode() {
		return responseSourceReasonCode;
	}
	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}
	public String getRiskCategoryCode() {
		return riskCategoryCode;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public String getSourceCurrency() {
		return sourceCurrency;
	}
	public BigDecimal getSourceCurrencyAmount() {
		return sourceCurrencyAmount;
	}
	public String getSubAccountCreditLimit() {
		return subAccountCreditLimit;
	}
	public String getSuperGroupAccountNumber() {
		return superGroupAccountNumber;
	}
	public String getSuperGroupCreditLimit() {
		return superGroupCreditLimit;
	}
	public String getSystemsTraceAuditNumber() {
		return systemsTraceAuditNumber;
	}
	public String getTransactionCodeGroup() {
		return transactionCodeGroup;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public String getTrxGroupAccountNumber() {
		return trxGroupAccountNumber;
	}
	public String getTypeOfAuthorisation() {
		return typeOfAuthorisation;
	}
	public String getUpdateDateAndTime() {
		return updateDateAndTime;
	}
	public String getUserId() {
		return userId;
	}
	public String getVirtualActivationFlag() {
		return virtualActivationFlag;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public void setAccountStatusPosition1(String accountStatusPosition1) {
		this.accountStatusPosition1 = accountStatusPosition1;
	}
	public void setAccountStatusPosition2(String accountStatusPosition2) {
		this.accountStatusPosition2 = accountStatusPosition2;
	}
	public void setAccountStatusPosition3(String accountStatusPosition3) {
		this.accountStatusPosition3 = accountStatusPosition3;
	}
	public void setAcquirersBin(String acquirersBin) {
		this.acquirersBin = acquirersBin;
	}
	public void setAcquirersIca(String acquirersIca) {
		this.acquirersIca = acquirersIca;
	}
	public void setAcquiringInstitutionId(String acquiringInstitutionId) {
		this.acquiringInstitutionId = acquiringInstitutionId;
	}
	public void setActivationFlag(String activationFlag) {
		this.activationFlag = activationFlag;
	}
	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public void setAuthorisationNumber(String authorisationNumber) {
		this.authorisationNumber = authorisationNumber;
	}
	public void setAuthorisationProcessCode(String authorisationProcessCode) {
		this.authorisationProcessCode = authorisationProcessCode;
	}
	public void setAuthorisationSource(String authorisationSource) {
		this.authorisationSource = authorisationSource;
	}
	public void setAuthorisationStatus(String authorisationStatus) {
		this.authorisationStatus = authorisationStatus;
	}
	public void setAuthorisationTransactionCode(String authorisationTransactionCode) {
		this.authorisationTransactionCode = authorisationTransactionCode;
	}
	public void setAuthorizationGroup(String authorizationGroup) {
		this.authorizationGroup = authorizationGroup;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public void setCardAcceptorIdCode(String cardAcceptorIdCode) {
		this.cardAcceptorIdCode = cardAcceptorIdCode;
	}
	public void setCardAcceptorNameLocation(String cardAcceptorNameLocation) {
		this.cardAcceptorNameLocation = cardAcceptorNameLocation;
	}
	public void setCardAcceptorTerminal(String cardAcceptorTerminal) {
		this.cardAcceptorTerminal = cardAcceptorTerminal;
	}
	public void setCardActivationDate(String cardActivationDate) {
		this.cardActivationDate = cardActivationDate;
	}
	public void setCardHolderBillingAmount(String cardHolderBillingAmount) {
		this.cardHolderBillingAmount = cardHolderBillingAmount;
	}
	public void setCardHolderBillingcurrency(String cardHolderBillingcurrency) {
		this.cardHolderBillingcurrency = cardHolderBillingcurrency;
	}
	public void setCardLimit(String cardLimit) {
		this.cardLimit = cardLimit;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setCardValidThrough(String cardValidThrough) {
		this.cardValidThrough = cardValidThrough;
	}
	public void setCardVerificationResultCode(String cardVerificationResultCode) {
		this.cardVerificationResultCode = cardVerificationResultCode;
	}
	public void setChBillingDecimals(String chBillingDecimals) {
		this.chBillingDecimals = chBillingDecimals;
	}
	public void setChipCardIndicator(String chipCardIndicator) {
		this.chipCardIndicator = chipCardIndicator;
	}
	public void setChipConditionCode(String chipConditionCode) {
		this.chipConditionCode = chipConditionCode;
	}
	public void setChipTransactionIndicator(String chipTransactionIndicator) {
		this.chipTransactionIndicator = chipTransactionIndicator;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public void setCryptoCurrencyFlag(String cryptoCurrencyFlag) {
		this.cryptoCurrencyFlag = cryptoCurrencyFlag;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public void setCustomerGeographiclocation(String customerGeographiclocation) {
		this.customerGeographiclocation = customerGeographiclocation;
	}
	public void setCustomerIPAddress(String customerIPAddress) {
		this.customerIPAddress = customerIPAddress;
	}
	public void setCustomerMobileDeviceId(String customerMobileDeviceId) {
		this.customerMobileDeviceId = customerMobileDeviceId;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public void setCustomerOperatingSystem(String customerOperatingSystem) {
		this.customerOperatingSystem = customerOperatingSystem;
	}
	public void setCustomerShippingAddressCity(String customerShippingAddressCity) {
		this.customerShippingAddressCity = customerShippingAddressCity;
	}
	public void setCustomerShippingAddressCountry(String customerShippingAddressCountry) {
		this.customerShippingAddressCountry = customerShippingAddressCountry;
	}
	public void setCustomerShippingAddressLine1(String customerShippingAddressLine1) {
		this.customerShippingAddressLine1 = customerShippingAddressLine1;
	}
	public void setCustomerShippingAddressLine2(String customerShippingAddressLine2) {
		this.customerShippingAddressLine2 = customerShippingAddressLine2;
	}
	public void setCustomerShippingAddressPostcode(String customerShippingAddressPostcode) {
		this.customerShippingAddressPostcode = customerShippingAddressPostcode;
	}
	public void setCustomerShippingAddressState(String customerShippingAddressState) {
		this.customerShippingAddressState = customerShippingAddressState;
	}
	public void setCustomerUserId(String customerUserId) {
		this.customerUserId = customerUserId;
	}
	public void setDomestic(String domestic) {
		this.domestic = domestic;
	}
	public void setEciCode(String eciCode) {
		this.eciCode = eciCode;
	}
	public void setFallbackInd(String fallbackInd) {
		this.fallbackInd = fallbackInd;
	}
	public void setGroupAccountNumber(String groupAccountNumber) {
		this.groupAccountNumber = groupAccountNumber;
	}
	public void setGroupCreditLimit(String groupCreditLimit) {
		this.groupCreditLimit = groupCreditLimit;
	}
	public void setIppModelCode(String ippModelCode) {
		this.ippModelCode = ippModelCode;
	}
	public void setIppTenure(String ippTenure) {
		this.ippTenure = ippTenure;
	}
	public void setIssuerCurrencyAmount(BigDecimal issuerCurrencyAmount) {
		this.issuerCurrencyAmount = issuerCurrencyAmount;
	}
	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}
	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public void setMerchantTerminalId(String merchantTerminalId) {
		this.merchantTerminalId = merchantTerminalId;
	}
	public void setNetworkAffiliationId(String networkAffiliationId) {
		this.networkAffiliationId = networkAffiliationId;
	}
	public void setPinVerified(String pinVerified) {
		this.pinVerified = pinVerified;
	}
	public void setPosConditionCode(String posConditionCode) {
		this.posConditionCode = posConditionCode;
	}
	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public void setResponseSourceReasonCode(String responseSourceReasonCode) {
		this.responseSourceReasonCode = responseSourceReasonCode;
	}
	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
		this.retrievalReferenceNumber = retrievalReferenceNumber;
	}
	public void setRiskCategoryCode(String riskCategoryCode) {
		this.riskCategoryCode = riskCategoryCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	public void setSourceCurrencyAmount(BigDecimal sourceCurrencyAmount) {
		this.sourceCurrencyAmount = sourceCurrencyAmount;
	}
	public void setSubAccountCreditLimit(String subAccountCreditLimit) {
		this.subAccountCreditLimit = subAccountCreditLimit;
	}
	public void setSuperGroupAccountNumber(String superGroupAccountNumber) {
		this.superGroupAccountNumber = superGroupAccountNumber;
	}
	public void setSuperGroupCreditLimit(String superGroupCreditLimit) {
		this.superGroupCreditLimit = superGroupCreditLimit;
	}
	public void setSystemsTraceAuditNumber(String systemsTraceAuditNumber) {
		this.systemsTraceAuditNumber = systemsTraceAuditNumber;
	}
	public void setTransactionCodeGroup(String transactionCodeGroup) {
		this.transactionCodeGroup = transactionCodeGroup;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public void setTrxGroupAccountNumber(String trxGroupAccountNumber) {
		this.trxGroupAccountNumber = trxGroupAccountNumber;
	}
	public void setTypeOfAuthorisation(String typeOfAuthorisation) {
		this.typeOfAuthorisation = typeOfAuthorisation;
	}
	public void setUpdateDateAndTime(String updateDateAndTime) {
		this.updateDateAndTime = updateDateAndTime;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setVirtualActivationFlag(String virtualActivationFlag) {
		this.virtualActivationFlag = virtualActivationFlag;
	}
}
