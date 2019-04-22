package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CptEpar")
public class CompteEpargne extends Compte{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux;

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(String codecompte, Date datecreation, double solde, Client client, double taux) {
		super(codecompte, datecreation, solde, client);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	 
}
