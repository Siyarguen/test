package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Lieferstatus generated by hbm2java
 */
@Entity
@Table(name = "lieferstatus", catalog = "metis")
public class Lieferstatus implements java.io.Serializable {

	private int idLieferStatus;
	private String beschreibung;

	public Lieferstatus() {
	}

	public Lieferstatus(int idLieferStatus) {
		this.idLieferStatus = idLieferStatus;
	}

	public Lieferstatus(int idLieferStatus, String beschreibung) {
		this.idLieferStatus = idLieferStatus;
		this.beschreibung = beschreibung;
	}

	@Id

	@Column(name = "idlieferStatus", unique = true, nullable = false)
	public int getIdLieferStatus() {
		return this.idLieferStatus;
	}

	public void setIdLieferStatus(int idLieferStatus) {
		this.idLieferStatus = idLieferStatus;
	}

	@Column(name = "Beschreibung")
	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	@Override
	public String toString() {
		return "Lieferstatus [idLieferStatus=" + idLieferStatus + ", beschreibung=" + beschreibung + "]";
	}

}