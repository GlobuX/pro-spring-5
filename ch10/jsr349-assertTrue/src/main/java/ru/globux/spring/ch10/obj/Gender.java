package ru.globux.spring.ch10.obj;

public enum Gender {
	MALE("M"), FEMALE("F");
	private String code;

	Gender(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return this.code;
	}
}
