package metisimportmodel;
// default package
// Generated 06.09.2018 13:31:39 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dokumentimport generated by hbm2java
 */
@Entity
@Table(name = "dokumentimport", catalog = "metisimport")
public class Dokumentimport implements java.io.Serializable {

	private Integer idDokumentImport;
	private String orginalNr;
	private String doi;
	private String ztitel;
	private String qtitel;
	private String jahr;
	private String band;
	private String heft;
	private Date datumImport;
	private int statusIdstatus;
	private String statusattribute;
	private Integer datenlieferungIdDatenlieferung;
	private Integer verantwortlicherid;
	private Set<Dateilinkimport> dateilinkimports = new HashSet<Dateilinkimport>(0);
	private Set<Dokjsonimport> dokjsonimports = new HashSet<Dokjsonimport>(0);
	private Set<Dokfeldimport> dokfeldimports = new HashSet<Dokfeldimport>(0);

	public Dokumentimport() {
	}

	public Dokumentimport(int statusIdstatus) {
		this.statusIdstatus = statusIdstatus;
	}

	public Dokumentimport(String orginalNr, String doi, String ztitel, String qtitel, String jahr, String band,
			String heft, Date datumImport, int statusIdstatus, String statusattribute,
			Integer datenlieferungIdDatenlieferung, Integer verantwortlicherid, Set<Dateilinkimport> dateilinkimports,
			Set<Dokjsonimport> dokjsonimports, Set<Dokfeldimport> dokfeldimports) {
		this.orginalNr = orginalNr;
		this.doi = doi;
		this.ztitel = ztitel;
		this.qtitel = qtitel;
		this.jahr = jahr;
		this.band = band;
		this.heft = heft;
		this.datumImport = datumImport;
		this.statusIdstatus = statusIdstatus;
		this.statusattribute = statusattribute;
		this.datenlieferungIdDatenlieferung = datenlieferungIdDatenlieferung;
		this.verantwortlicherid = verantwortlicherid;
		this.dateilinkimports = dateilinkimports;
		this.dokjsonimports = dokjsonimports;
		this.dokfeldimports = dokfeldimports;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDokumentImport", unique = true, nullable = false)
	public Integer getIdDokumentImport() {
		return this.idDokumentImport;
	}

	public void setIdDokumentImport(Integer idDokumentImport) {
		this.idDokumentImport = idDokumentImport;
	}

	@Column(name = "OrginalNr", length = 45)
	public String getOrginalNr() {
		return this.orginalNr;
	}

	public void setOrginalNr(String orginalNr) {
		this.orginalNr = orginalNr;
	}

	@Column(name = "DOI")
	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	@Column(name = "ZTitel")
	public String getZtitel() {
		return this.ztitel;
	}

	public void setZtitel(String ztitel) {
		this.ztitel = ztitel;
	}

	@Column(name = "QTitel")
	public String getQtitel() {
		return this.qtitel;
	}

	public void setQtitel(String qtitel) {
		this.qtitel = qtitel;
	}

	@Column(name = "Jahr", length = 10)
	public String getJahr() {
		return this.jahr;
	}

	public void setJahr(String jahr) {
		this.jahr = jahr;
	}

	@Column(name = "Band", length = 10)
	public String getBand() {
		return this.band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Column(name = "Heft", length = 10)
	public String getHeft() {
		return this.heft;
	}

	public void setHeft(String heft) {
		this.heft = heft;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Datum_Import", length = 19)
	public Date getDatumImport() {
		return this.datumImport;
	}

	public void setDatumImport(Date datumImport) {
		this.datumImport = datumImport;
	}

	@Column(name = "status_idstatus", nullable = false)
	public int getStatusIdstatus() {
		return this.statusIdstatus;
	}

	public void setStatusIdstatus(int statusIdstatus) {
		this.statusIdstatus = statusIdstatus;
	}

	@Column(name = "statusattribute", length = 16777215)
	public String getStatusattribute() {
		return this.statusattribute;
	}

	public void setStatusattribute(String statusattribute) {
		this.statusattribute = statusattribute;
	}

	@Column(name = "datenlieferung_idDatenlieferung")
	public Integer getDatenlieferungIdDatenlieferung() {
		return this.datenlieferungIdDatenlieferung;
	}

	public void setDatenlieferungIdDatenlieferung(Integer datenlieferungIdDatenlieferung) {
		this.datenlieferungIdDatenlieferung = datenlieferungIdDatenlieferung;
	}

	@Column(name = "Verantwortlicherid")
	public Integer getVerantwortlicherid() {
		return this.verantwortlicherid;
	}

	public void setVerantwortlicherid(Integer verantwortlicherid) {
		this.verantwortlicherid = verantwortlicherid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dokumentimport")
	public Set<Dateilinkimport> getDateilinkimports() {
		return this.dateilinkimports;
	}

	public void setDateilinkimports(Set<Dateilinkimport> dateilinkimports) {
		this.dateilinkimports = dateilinkimports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dokumentimport")
	public Set<Dokjsonimport> getDokjsonimports() {
		return this.dokjsonimports;
	}

	public void setDokjsonimports(Set<Dokjsonimport> dokjsonimports) {
		this.dokjsonimports = dokjsonimports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dokumentimport")
	public Set<Dokfeldimport> getDokfeldimports() {
		return this.dokfeldimports;
	}

	public void setDokfeldimports(Set<Dokfeldimport> dokfeldimports) {
		this.dokfeldimports = dokfeldimports;
	}

}
