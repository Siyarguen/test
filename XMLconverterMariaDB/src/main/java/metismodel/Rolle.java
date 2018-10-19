package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Rolle generated by hbm2java
 */
@Entity
@Table(name = "rolle", catalog = "metis")
public class Rolle implements java.io.Serializable {

	private int idRolle;
	private String rolle;
	private List<Berechtigung> berechtigungs = new ArrayList<Berechtigung>();
	private List<Seiten> seitens = new ArrayList<Seiten>();
	private List<Bearbeiter> bearbeiters = new ArrayList<Bearbeiter>();
	private List<Abfragen> abfragens = new ArrayList<Abfragen>();

	public Rolle() {
	}

	public Rolle(String rolle, List<Berechtigung> berechtigungs, List<Seiten> seitens, List<Bearbeiter> bearbeiters,
			List<Abfragen> abfragens) {
		this.rolle = rolle;
		this.berechtigungs = berechtigungs;
		this.seitens = seitens;
		this.bearbeiters = bearbeiters;
		this.abfragens = abfragens;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idrolle", unique = true, nullable = false)
	public int getIdRolle() {
		return this.idRolle;
	}

	public void setIdRolle(int idRolle) {
		this.idRolle = idRolle;
	}

	@Column(name = "Rolle", length = 45)
	public String getRolle() {
		return this.rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "rolle_hat_berechtigung", catalog = "metis", joinColumns = {
			@JoinColumn(name = "Rolle_idrolle", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Berechtigung_idberechtigung", nullable = false, updatable = false) })
	public List<Berechtigung> getBerechtigungs() {
		return this.berechtigungs;
	}

	public void setBerechtigungs(List<Berechtigung> berechtigungs) {
		this.berechtigungs = berechtigungs;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "rolle_sieht_seiten", catalog = "metis", joinColumns = {
			@JoinColumn(name = "Rolle_idrolle", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Seiten_idseiten", nullable = false, updatable = false) })
	public List<Seiten> getSeitens() {
		return this.seitens;
	}

	public void setSeitens(List<Seiten> seitens) {
		this.seitens = seitens;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "bearbeiter_hat_rolle", catalog = "metis", joinColumns = {
			@JoinColumn(name = "Rolle_idrolle", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Bearbeiter_idbearbeiter", nullable = false, updatable = false) })
	public List<Bearbeiter> getBearbeiters() {
		return this.bearbeiters;
	}

	public void setBearbeiters(List<Bearbeiter> bearbeiters) {
		this.bearbeiters = bearbeiters;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "rolle_hat_abfragen", catalog = "metis", joinColumns = {
			@JoinColumn(name = "Rolle_idrolle", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Abfragen_idabfragen", nullable = false, updatable = false) })
	public List<Abfragen> getAbfragens() {
		return this.abfragens;
	}

	public void setAbfragens(List<Abfragen> abfragens) {
		this.abfragens = abfragens;
	}

}