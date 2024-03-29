package com.taskManagement.dev.dao.gestionSuivi;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.taskManagement.dev.dao.Projet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Component
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class EtatAvancement implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEtatAvancement;
	private String nomEtatAvancement;
	private String descriAvanacement;
	
	/***** RELATION AVEC LA TABLE PROJET *****/
	@OneToMany(mappedBy="etatAvancement",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Projet> projets;
	
	/***** RELATION AVEC LA TABLE PHASE *****/
	@OneToMany(mappedBy="etatAvancement",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Phase> phases;
	
	/***** RELATION AVEC LA TABLE ETATPE *****/
	@OneToMany(mappedBy="etatAvancement",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Etape> etapes;
	
	/***** RELATION AVEC LA TABLE SOUS-ETAPE *****/
	@OneToMany(mappedBy="etatAvancement",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<SousEtape> sousEtapes;

}
