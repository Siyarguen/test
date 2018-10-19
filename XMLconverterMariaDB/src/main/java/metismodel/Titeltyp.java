package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Titeltyp generated by hbm2java
 */
@Entity
@Table(name = "titeltyp", catalog = "metis")
public class Titeltyp implements java.io.Serializable {

	private int idTitelTyp;
	private String titelTyp;
	private String bemerkung;
	private String etitelTyp;
	private String ebemerkung;
	private List<Doktitel> doktitels = new ArrayList<Doktitel>();

	public Titeltyp() {
	}

	public Titeltyp(int idTitelTyp) {
		this.idTitelTyp = idTitelTyp;
	}

	public Titeltyp(int idTitelTyp, String titelTyp, String bemerkung, String etitelTyp, String ebemerkung,
			List<Doktitel> doktitels) {
		this.idTitelTyp = idTitelTyp;
		this.titelTyp = titelTyp;
		this.bemerkung = bemerkung;
		this.etitelTyp = etitelTyp;
		this.ebemerkung = ebemerkung;
		this.doktitels = doktitels;
	}

	@Id

	@Column(name = "idtiteltyp", unique = true, nullable = false)
	public int getIdTitelTyp() {
		return this.idTitelTyp;
	}

	public void setIdTitelTyp(int idTitelTyp) {
		this.idTitelTyp = idTitelTyp;
	}

	@Column(name = "titeltyp", length = 25)
	public String getTitelTyp() {
		return this.titelTyp;
	}

	public void setTitelTyp(String titelTyp) {
		this.titelTyp = titelTyp;
	}

	@Column(name = "Bemerkung")
	public String getBemerkung() {
		return this.bemerkung;
	}

	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}

	@Column(name = "etiteltyp", length = 25)
	public String getEtitelTyp() {
		return this.etitelTyp;
	}

	public void setEtitelTyp(String etitelTyp) {
		this.etitelTyp = etitelTyp;
	}

	@Column(name = "ebemerkung")
	public String getEbemerkung() {
		return this.ebemerkung;
	}

	public void setEbemerkung(String ebemerkung) {
		this.ebemerkung = ebemerkung;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "titeltyp")
	public List<Doktitel> getDoktitels() {
		return this.doktitels;
	}

	public void setDoktitels(List<Doktitel> doktitels) {
		this.doktitels = doktitels;
	}

	@Override
	public String toString() {
		return "Titeltyp [idTitelTyp=" + idTitelTyp + ", titelTyp=" + titelTyp + ", bemerkung=" + bemerkung
				+ ", etitelTyp=" + etitelTyp + ", ebemerkung=" + ebemerkung + ", doktitels=" + doktitels + "]";
	}

}
