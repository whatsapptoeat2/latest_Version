package com.example.whatsuptoeat;

public class Rezept {
	private long id;
	private String name;
	private String zutat1;
	private String zutat2;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZutat1() {
		return this.zutat1;
	}

	public void setZutat1(String zutat1) {
		this.zutat1 = zutat1;
	}

	public String getZutat2() {
		return this.zutat2;
	}

	public void setZutat2(String zutat2) {
		this.zutat2 = zutat2;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return name;
	}
}