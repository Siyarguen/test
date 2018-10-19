package metisimportmodel;
// default package
// Generated 06.09.2018 13:31:39 by Hibernate Tools 4.3.5.Final

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
 * Dateilinkimport generated by hbm2java
 */
@Entity
@Table(name = "dateilinkimport", catalog = "metisimport")
public class Dateilinkimport implements java.io.Serializable {

	private Integer idDatei;
	private Dokumentimport dokumentimport;
	private String dateityp;
	private String relativerPfad;

	public Dateilinkimport() {
	}

	public Dateilinkimport(Dokumentimport dokumentimport) {
		this.dokumentimport = dokumentimport;
	}

	public Dateilinkimport(Dokumentimport dokumentimport, String dateityp, String relativerPfad) {
		this.dokumentimport = dokumentimport;
		this.dateityp = dateityp;
		this.relativerPfad = relativerPfad;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDatei", unique = true, nullable = false)
	public Integer getIdDatei() {
		return this.idDatei;
	}

	public void setIdDatei(Integer idDatei) {
		this.idDatei = idDatei;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dokumentimport_idDokumentImport", nullable = false)
	public Dokumentimport getDokumentimport() {
		return this.dokumentimport;
	}

	public void setDokumentimport(Dokumentimport dokumentimport) {
		this.dokumentimport = dokumentimport;
	}

	@Column(name = "Dateityp", length = 10)
	public String getDateityp() {
		return this.dateityp;
	}

	public void setDateityp(String dateityp) {
		this.dateityp = dateityp;
	}

	@Column(name = "relativerPfad")
	public String getRelativerPfad() {
		return this.relativerPfad;
	}

	public void setRelativerPfad(String relativerPfad) {
		this.relativerPfad = relativerPfad;
	}

}
