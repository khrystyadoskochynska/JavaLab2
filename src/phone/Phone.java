package phone;

//id, Прізвище, Ім'я, По батькові, Номер рахунку, Час міських розмов, Час міжміських розмов.

public class Phone {
	
	private int id;
	private String Surname;
	private String Name;
	private String MiddleName;
	private int AccountNumber;
	private int WithinCityTime;
	private int OutCityTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getWithinCityTime() {
		return WithinCityTime;
	}
	public void setWithinCityTime(int withinCityTime) {
		WithinCityTime = withinCityTime;
	}
	public int getOutCityTime() {
		return OutCityTime;
	}
	public void setOutCityTime(int outCityTime) {
		OutCityTime = outCityTime;
	}

	
	
}
