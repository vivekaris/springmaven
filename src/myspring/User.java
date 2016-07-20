package myspring;



import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("unused")
public class User {
	private String user;
	private String lastname;
	private String password;
	private String detail;

	
	private String gender;
	private String country;
	private String nonSmoking;
public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNonSmoking() {
		return nonSmoking;
	}
	public void setNonSmoking(String nonSmoking) {
		this.nonSmoking = nonSmoking;
	}

}
