package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CptCour")
public class CompteCourant extends Compte{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(String codecompte, Date datecreation, double solde, Client client,double decouvert) {
		super(codecompte, datecreation, solde, client);
		this.decouvert=decouvert;
		// TODO Auto-generated constructor stub
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	

	
	
}
