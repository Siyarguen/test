package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Doktitel generated by hbm2java
 */
@Entity
@Table(name = "doktitel", catalog = "metis")
public class Doktitel implements java.io.Serializable {

	private int idDokTitel;
	private Dokument dokument;
	private Sprache sprache;
	private Titeltyp titeltyp;
	private String titel;

	public Doktitel() {
	}

	public Doktitel(Dokument dokument, Sprache sprache, Titeltyp titeltyp) {
		this.dokument = dokument;
		this.sprache = sprache;
		this.titeltyp = titeltyp;
	}

	public Doktitel(Dokument dokument, Sprache sprache, Titeltyp titeltyp, String titel) {
		this.dokument = dokument;
		this.sprache = sprache;
		this.titeltyp = titeltyp;
		this.titel = titel;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "iddoktitel", unique = true, nullable = false)
	public int getIdDokTitel() {
		return this.idDokTitel;
	}

	public void setIdDokTitel(int idDokTitel) {
		this.idDokTitel = idDokTitel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dokument_iddokument", nullable = false)
	public Dokument getDokument() {
		return this.dokument;
	}

	public void setDokument(Dokument dokument) {
		this.dokument = dokument;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sprache_sprachcode", nullable = false)
	public Sprache getSprache() {
		return this.sprache;
	}

	public void setSprache(Sprache sprache) {
		this.sprache = sprache;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "titeltyp_idtiteltyp", nullable = false)
	public Titeltyp getTiteltyp() {
		return this.titeltyp;
	}

	public void setTiteltyp(Titeltyp titeltyp) {
		this.titeltyp = titeltyp;
	}

	@Column(name = "Titel")
	public String getTitel() {
		return this.titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@Override
	public String toString() {
		return "Doktitel [idDokTitel=" + idDokTitel + ", dokument=" + dokument + ", sprache=" + sprache + ", titeltyp="
				+ titeltyp + ", titel=" + titel + "]";
	}

	
	
	
}