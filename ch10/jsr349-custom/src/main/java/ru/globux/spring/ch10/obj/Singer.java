package ru.globux.spring.ch10.obj;

import ru.globux.spring.ch10.CheckCountrySinger;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@CheckCountrySinger
public class Singer {

	@NotNull
	@Size(min = 2, max = 60)
	private String firstName;
	private String lastName;
	@NotNull
	private Genre genre;
	private Gender gender;

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

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isCountrySinger() {
		return genre == Genre.COUNTRY;
	}
}
