package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Konferenzwiedervorlage generated by hbm2java
 */
@Entity
@Table(name = "konferenzwiedervorlage", catalog = "metis")
public class Konferenzwiedervorlage implements java.io.Serializable {

	private KonferenzwiedervorlageId id;
	private Bearbeiter bearbeiter;
	private Konferenzreihe konferenzreihe;
	private Date datum;
	private String hinweis;

	public Konferenzwiedervorlage() {
	}

	public Konferenzwiedervorlage(KonferenzwiedervorlageId id, Bearbeiter bearbeiter, Konferenzreihe konferenzreihe) {
		this.id = id;
		this.bearbeiter = bearbeiter;
		this.konferenzreihe = konferenzreihe;
	}

	public Konferenzwiedervorlage(KonferenzwiedervorlageId id, Bearbeiter bearbeiter, Konferenzreihe konferenzreihe,
			Date datum, String hinweis) {
		this.id = id;
		this.bearbeiter = bearbeiter;
		this.konferenzreihe = konferenzreihe;
		this.datum = datum;
		this.hinweis = hinweis;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idkonferenzwiedervorlage", column = @Column(name = "idkonferenzwiedervorlage", nullable = false)),
			@AttributeOverride(name = "konferenzreiheIdKonferenz", column = @Column(name = "konferenzreihe_idkonferenz", nullable = false)),
			@AttributeOverride(name = "konferenzreiheVersion", column = @Column(name = "konferenzreihe_Version", nullable = false)),
			@AttributeOverride(name = "bearbeiterIdBearbeiter", column = @Column(name = "bearbeiter_idbearbeiter", nullable = false)) })
	public KonferenzwiedervorlageId getId() {
		return this.id;
	}

	public void setId(KonferenzwiedervorlageId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bearbeiter_idbearbeiter", nullable = false, insertable = false, updatable = false)
	public Bearbeiter getBearbeiter() {
		return this.bearbeiter;
	}

	public void setBearbeiter(Bearbeiter bearbeiter) {
		this.bearbeiter = bearbeiter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "konferenzreihe_idkonferenz", referencedColumnName = "idKonferenz", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "konferenzreihe_Version", referencedColumnName = "Version", nullable = false, insertable = false, updatable = false) })
	public Konferenzreihe getKonferenzreihe() {
		return this.konferenzreihe;
	}

	public void setKonferenzreihe(Konferenzreihe konferenzreihe) {
		this.konferenzreihe = konferenzreihe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Datum", length = 10)
	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Column(name = "Hinweis")
	public String getHinweis() {
		return this.hinweis;
	}

	public void setHinweis(String hinweis) {
		this.hinweis = hinweis;
	}

	@Override
	public String toString() {
		return "Konferenzwiedervorlage [id=" + id + ", bearbeiter=" + bearbeiter + ", konferenzreihe=" + konferenzreihe
				+ ", datum=" + datum + ", hinweis=" + hinweis + "]";
	}

}