package com.loncoto.backendIntervention.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Materiel {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String numeroSerie;
	@ManyToOne
	private Article article;
}
