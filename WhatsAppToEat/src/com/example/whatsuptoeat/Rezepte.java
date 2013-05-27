package com.example.whatsuptoeat;

public class Rezepte {
	
	long _id;
	String _name;
	String _zutat1;
	String _zutat2;
	
	public Rezepte(){
	}
	
	public Rezepte(long id, String name, String zutat1, String zutat2) {
		this._id = id;
		this._name = name;
		this._zutat1 = zutat1;
		this._zutat2 = zutat2;
	}
	
	public long getId() {
		return this._id;
	}
	
	public void setId(long id) {
		this._id = id;
	}
	
	public String getName() {
		return this._name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	public String getZutat1() {
		return this._zutat1;
	}
	
	public void setZutat1(String zutat1) {
		this._zutat1 = zutat1;
	}
	
	public String getZutat2() {
		return this._zutat2;
	}
	
	public void setZutat2(String zutat2) {
		this._zutat2 = zutat2;
	}

}
