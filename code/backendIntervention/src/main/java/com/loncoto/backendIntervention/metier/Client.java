package com.loncoto.backendIntervention.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter@Setter@NoArgsConstructor@ToString
public class Client {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Id										private int id;
@Column(length=100)						private String raisonSocial;
@Column(length=200)						private String adresse;
@Column(length=150)						private String email;
										private int telephone;

}
