package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.Collection;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Col",discriminatorType = DiscriminatorType.STRING,length = 10)
public abstract class Compte  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String codecompte;
	private Date datecreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name="CODE_CLi")
	private Client client;
	@OneToMany(mappedBy = "compte")
	private Collection<Operation> operations;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCodecompte() {
		return codecompte;
	}
	public void setCodecompte(String codecompte) {
		this.codecompte = codecompte;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public Compte(String codecompte, Date datecreation, double solde, Client client) {
		super();
		this.codecompte = codecompte;
		this.datecreation = datecreation;
		this.solde = solde;
		this.client = client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
}
