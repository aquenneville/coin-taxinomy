package com.example.demo.model;

public class AssetProperty {
	
	private long id;
	private Asset asset_id;
	private String summary;
	private String notes;
	private String capitalizationType;
	private boolean isCaas;
	private boolean isStoreOfVal;
	private boolean isIco;
	private boolean isIcoPlatform;
	private boolean isPayment;
	private boolean hasProtocolImprovement;
	private boolean isUtilityToken;
	private boolean isSmartContracts;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Asset getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(Asset asset_id) {
		this.asset_id = asset_id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getCapitalizationType() {
		return capitalizationType;
	}
	public void setCapitalizationType(String capitalizationType) {
		this.capitalizationType = capitalizationType;
	}
	public boolean isCaas() {
		return isCaas;
	}
	public void setCaas(boolean isCaas) {
		this.isCaas = isCaas;
	}
	public boolean isStoreOfVal() {
		return isStoreOfVal;
	}
	public void setStoreOfVal(boolean isStoreOfVal) {
		this.isStoreOfVal = isStoreOfVal;
	}
	public boolean isIco() {
		return isIco;
	}
	public void setIco(boolean isIco) {
		this.isIco = isIco;
	}
	public boolean isIcoPlatform() {
		return isIcoPlatform;
	}
	public void setIcoPlatform(boolean isIcoPlatform) {
		this.isIcoPlatform = isIcoPlatform;
	}
	public boolean isPayment() {
		return isPayment;
	}
	public void setPayment(boolean isPayment) {
		this.isPayment = isPayment;
	}
	public boolean isHasProtocolImprovement() {
		return hasProtocolImprovement;
	}
	public void setHasProtocolImprovement(boolean hasProtocolImprovement) {
		this.hasProtocolImprovement = hasProtocolImprovement;
	}
	public boolean isUtilityToken() {
		return isUtilityToken;
	}
	public void setUtilityToken(boolean isUtilityToken) {
		this.isUtilityToken = isUtilityToken;
	}
	public boolean isSmartContracts() {
		return isSmartContracts;
	}
	public void setSmartContracts(boolean isSmartContracts) {
		this.isSmartContracts = isSmartContracts;
	}
		
}
