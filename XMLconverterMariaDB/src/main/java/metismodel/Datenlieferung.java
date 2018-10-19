package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Datenlieferung generated by hbm2java
 */
@Entity
@Table(name = "datenlieferung", catalog = "metis")
public class Datenlieferung implements java.io.Serializable {

	private int idDatenlieferung;
	private Lieferant lieferant;
	private Produktionsweg produktionsweg;
	private Date lieferdatum;
	private Date importiertZeitstempel;
	private int geliefert;
	private int importiertErfolgreich;
	private int importiertVerdachtKeinDokument;
	private int importiertVerdachtKonferenz;
	private int importiertPeriodikumUnbekannt;
	private int abgelehntZuAlt;
	private int abgelehntDoiSchonVorhanden;
	private int abgelehntOhneDoi;
	private int abgelehntKeinDokument;
	private List<Dokument> dokuments = new ArrayList<Dokument>();

	public Datenlieferung() {
	}

	public Datenlieferung(Lieferant lieferant, Produktionsweg produktionsweg) {
		this.lieferant = lieferant;
		this.produktionsweg = produktionsweg;
	}

	public Datenlieferung(Lieferant lieferant, Produktionsweg produktionsweg, Date lieferdatum,
			Date importiertZeitstempel, int geliefert, int importiertErfolgreich,
			int importiertVerdachtKeinDokument, int importiertVerdachtKonferenz,
			int importiertPeriodikumUnbekannt, int abgelehntZuAlt, int abgelehntDoiSchonVorhanden,
			int abgelehntOhneDoi, int abgelehntKeinDokument, List<Dokument> dokuments) {
		this.lieferant = lieferant;
		this.produktionsweg = produktionsweg;
		this.lieferdatum = lieferdatum;
		this.importiertZeitstempel = importiertZeitstempel;
		this.geliefert = geliefert;
		this.importiertErfolgreich = importiertErfolgreich;
		this.importiertVerdachtKeinDokument = importiertVerdachtKeinDokument;
		this.importiertVerdachtKonferenz = importiertVerdachtKonferenz;
		this.importiertPeriodikumUnbekannt = importiertPeriodikumUnbekannt;
		this.abgelehntZuAlt = abgelehntZuAlt;
		this.abgelehntDoiSchonVorhanden = abgelehntDoiSchonVorhanden;
		this.abgelehntOhneDoi = abgelehntOhneDoi;
		this.abgelehntKeinDokument = abgelehntKeinDokument;
		this.dokuments = dokuments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "iddatenlieferung", unique = true, nullable = false)
	public int getIdDatenlieferung() {
		return this.idDatenlieferung;
	}

	public void setIdDatenlieferung(int idDatenlieferung) {
		this.idDatenlieferung = idDatenlieferung;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lieferant_idlieferant", nullable = false)
	public Lieferant getLieferant() {
		return this.lieferant;
	}

	public void setLieferant(Lieferant lieferant) {
		this.lieferant = lieferant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "produktionsweg_idproduktionsweg", nullable = false)
	public Produktionsweg getProduktionsweg() {
		return this.produktionsweg;
	}

	public void setProduktionsweg(Produktionsweg produktionsweg) {
		this.produktionsweg = produktionsweg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lieferdatum", length = 19)
	public Date getLieferdatum() {
		return this.lieferdatum;
	}

	public void setLieferdatum(Date lieferdatum) {
		this.lieferdatum = lieferdatum;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "importiert_zeitstempel", length = 19)
	public Date getImportiertZeitstempel() {
		return this.importiertZeitstempel;
	}

	public void setImportiertZeitstempel(Date importiertZeitstempel) {
		this.importiertZeitstempel = importiertZeitstempel;
	}

	@Column(name = "geliefert")
	public int getGeliefert() {
		return this.geliefert;
	}

	public void setGeliefert(int geliefert) {
		this.geliefert = geliefert;
	}

	@Column(name = "importiert_erfolgreich")
	public int getImportiertErfolgreich() {
		return this.importiertErfolgreich;
	}

	public void setImportiertErfolgreich(int importiertErfolgreich) {
		this.importiertErfolgreich = importiertErfolgreich;
	}

	@Column(name = "importiert_verdacht_kein_dokument")
	public int getImportiertVerdachtKeinDokument() {
		return this.importiertVerdachtKeinDokument;
	}

	public void setImportiertVerdachtKeinDokument(int importiertVerdachtKeinDokument) {
		this.importiertVerdachtKeinDokument = importiertVerdachtKeinDokument;
	}

	@Column(name = "importiert_verdacht_konferenz")
	public int getImportiertVerdachtKonferenz() {
		return this.importiertVerdachtKonferenz;
	}

	public void setImportiertVerdachtKonferenz(int importiertVerdachtKonferenz) {
		this.importiertVerdachtKonferenz = importiertVerdachtKonferenz;
	}

	@Column(name = "importiert_periodikum_unbekannt")
	public int getImportiertPeriodikumUnbekannt() {
		return this.importiertPeriodikumUnbekannt;
	}

	public void setImportiertPeriodikumUnbekannt(int importiertPeriodikumUnbekannt) {
		this.importiertPeriodikumUnbekannt = importiertPeriodikumUnbekannt;
	}

	@Column(name = "abgelehnt_zu_alt")
	public int getAbgelehntZuAlt() {
		return this.abgelehntZuAlt;
	}

	public void setAbgelehntZuAlt(int abgelehntZuAlt) {
		this.abgelehntZuAlt = abgelehntZuAlt;
	}

	@Column(name = "abgelehnt_doi_schon_vorhanden")
	public int getAbgelehntDoiSchonVorhanden() {
		return this.abgelehntDoiSchonVorhanden;
	}

	public void setAbgelehntDoiSchonVorhanden(int abgelehntDoiSchonVorhanden) {
		this.abgelehntDoiSchonVorhanden = abgelehntDoiSchonVorhanden;
	}

	@Column(name = "abgelehnt_ohne_doi")
	public int getAbgelehntOhneDoi() {
		return this.abgelehntOhneDoi;
	}

	public void setAbgelehntOhneDoi(int abgelehntOhneDoi) {
		this.abgelehntOhneDoi = abgelehntOhneDoi;
	}

	@Column(name = "abgelehnt_kein_dokument")
	public int getAbgelehntKeinDokument() {
		return this.abgelehntKeinDokument;
	}

	public void setAbgelehntKeinDokument(int abgelehntKeinDokument) {
		this.abgelehntKeinDokument = abgelehntKeinDokument;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datenlieferung")
	public List<Dokument> getDokuments() {
		return this.dokuments;
	}

	public void setDokuments(List<Dokument> dokuments) {
		this.dokuments = dokuments;
	}

	@Override
	public String toString() {
		return "Datenlieferung [idDatenlieferung=" + idDatenlieferung + ", lieferant=" + lieferant + ", produktionsweg="
				+ produktionsweg + ", lieferdatum=" + lieferdatum + ", importiertZeitstempel=" + importiertZeitstempel
				+ ", geliefert=" + geliefert + ", importiertErfolgreich=" + importiertErfolgreich
				+ ", importiertVerdachtKeinDokument=" + importiertVerdachtKeinDokument
				+ ", importiertVerdachtKonferenz=" + importiertVerdachtKonferenz + ", importiertPeriodikumUnbekannt="
				+ importiertPeriodikumUnbekannt + ", abgelehntZuAlt=" + abgelehntZuAlt + ", abgelehntDoiSchonVorhanden="
				+ abgelehntDoiSchonVorhanden + ", abgelehntOhneDoi=" + abgelehntOhneDoi + ", abgelehntKeinDokument="
				+ abgelehntKeinDokument + ", dokuments=" + dokuments + "]";
	}
	
	
	

}