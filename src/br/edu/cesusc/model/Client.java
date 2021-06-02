package br.edu.cesusc.model;

public class Client {
	protected int id;
	protected int registration;
	protected String modality;
	protected String description;
	protected String name;
	protected String district;
	protected String city;
	protected String cep;
	protected String state;
	protected String publicPlace;
	protected String cellphone;
		
	public Client() {
		super();
	}

	public Client(int id, int registration, String modality, String description, String name, String district, String city, String cep,
			String state, String publicPlace, String cellphone) {
		super();
		this.id = id;
		this.registration = registration;
		this.modality = modality;
		this.description = description;
		this.name = name;
		this.district = district;
		this.city = city;
		this.cep = cep;
		this.state = state;
		this.publicPlace = publicPlace;
		this.cellphone = cellphone;
	}

	public Client(int registration, String modality, String description, String name, String district, String city, String cep,
			String state, String publicPlace, String cellphone) {
		super();
		this.registration = registration;
		this.modality = modality;
		this.description = description;
		this.name = name;
		this.district = district;
		this.city = city;
		this.cep = cep;
		this.state = state;
		this.publicPlace = publicPlace;
		this.cellphone = cellphone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	
	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}	
}
