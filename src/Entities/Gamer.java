package Entities;

import java.util.Date;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private Date DateOfBirth;
	private String NationalityID;

	
	public Gamer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityID) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityID = nationalityID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityID() {
		return NationalityID;
	}

	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}
	
	
}
