package collection.demo.list;

public class Student {

	int id;
	String name;
	String email;
	String aadhaar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	@Override
	public int hashCode()
	{
		return (int) (Math.ceil(this.id*28.67) + 
				this.name.getBytes().length*847239 +
				this.email.trim().length() + 
				Character.getNumericValue(this.aadhaar.charAt(4)) - 
				Math.pow(this.email.length(),3));
	}
}
