package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="stores")
public class Store {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50, name="store_key")
	private String storeKey;
	@Column(length=70, name="region_key")
	private String regionKey;
	@Column(length=70, name="store_name")
	private String storeName;
	@Column(length=50, name="store_code")
	private String storeCode;
	@Column(length=70, name="store_type")
	private String storeType;
	@Column(length=70, name="street_address")
	private String streetAddress;
	@Column(length=50)
	private String city;
	@Column(length=70, name="state_province")
	private String stateProvince;
	@Column(length=70, name="postal_code")
	private String postalCode;
	@Column(length=50, name="store_manager")
	private String storeManager;
	@Column(length=70)
	private String phone;
	@Column(length=70)
	private String fax;
	
	
	public Store(String storeKey, String regionKey, String storeName, String storeCode, String storeType,
			String streetAddress, String city, String stateProvince, String postalCode, String storeManager,
			String phone, String fax) {
		super();
		this.storeKey = storeKey;
		this.regionKey = regionKey;
		this.storeName = storeName;
		this.storeCode = storeCode;
		this.storeType = storeType;
		this.streetAddress = streetAddress;
		this.city = city;
		this.stateProvince = stateProvince;
		this.postalCode = postalCode;
		this.storeManager = storeManager;
		this.phone = phone;
		this.fax = fax;
	}
	
	public Store() {
		this("","","","", "", "", "","","", "", "", "");
	}
	public Long getId() {
		return id;
	}

	public String getStoreKey() {
		return storeKey;
	}

	public void setStoreKey(String storeKey) {
		this.storeKey = storeKey;
	}

	public String getRegionKey() {
		return regionKey;
	}

	public void setRegionKey(String regionKey) {
		this.regionKey = regionKey;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStoreManager() {
		return storeManager;
	}

	public void setStoreManager(String storeManager) {
		this.storeManager = storeManager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeKey=" + storeKey + ", regionKey=" + regionKey + ", storeName=" + storeName
				+ ", storeCode=" + storeCode + ", storeType=" + storeType + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", stateProvince=" + stateProvince + ", postalCode=" + postalCode
				+ ", storeManager=" + storeManager + ", phone=" + phone + ", fax=" + fax + "]";
	}
	
	
	
	
}