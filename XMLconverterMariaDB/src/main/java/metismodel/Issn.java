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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Issn generated by hbm2java
 */
@Entity
@Table(name = "issn", catalog = "metis")
public class Issn implements java.io.Serializable {

	private int idissn;
	private Periodika periodika;
	private String issn;
	private Character typ;

	public Issn() {
	}

	public Issn(Periodika periodika) {
		this.periodika = periodika;
	}

	public Issn(Periodika periodika, String issn, Character typ) {
		this.periodika = periodika;
		this.issn = issn;
		this.typ = typ;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idissn", unique = true, nullable = false)
	public int getIdissn() {
		return this.idissn;
	}

	public void setIdissn(int idissn) {
		this.idissn = idissn;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "periodika_ZCode", referencedColumnName = "ZCode", nullable = false),
			@JoinColumn(name = "periodika_Version", referencedColumnName = "Version", nullable = false) })
	public Periodika getPeriodika() {
		return this.periodika;
	}

	public void setPeriodika(Periodika periodika) {
		this.periodika = periodika;
	}

	@Column(name = "ISSN", length = 10)
	public String getIssn() {
		return this.issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	@Column(name = "Typ", length = 1)
	public Character getTyp() {
		return this.typ;
	}

	public void setTyp(Character typ) {
		this.typ = typ;
	}

	@Override
	public String toString() {
		return "Issn [idissn=" + idissn + ", periodika=" + periodika + ", issn=" + issn + ", typ=" + typ + "]";
	}

}
