package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Periodikasynonyme generated by hbm2java
 */
@Entity
@Table(name = "periodikasynonyme", catalog = "metis")
public class Periodikasynonyme implements java.io.Serializable {

	private int idPeriodikaSynonyme;
	private Periodika periodika;
	private String periodikaSynonym;

	public Periodikasynonyme() {
	}

	public Periodikasynonyme(int idPeriodikaSynonyme, Periodika periodika) {
		this.idPeriodikaSynonyme = idPeriodikaSynonyme;
		this.periodika = periodika;
	}

	public Periodikasynonyme(int idPeriodikaSynonyme, Periodika periodika, String periodikaSynonym) {
		this.idPeriodikaSynonyme = idPeriodikaSynonyme;
		this.periodika = periodika;
		this.periodikaSynonym = periodikaSynonym;
	}

	@Id

	@Column(name = "idperiodikasynonyme", unique = true, nullable = false)
	public int getIdPeriodikaSynonyme() {
		return this.idPeriodikaSynonyme;
	}

	public void setIdPeriodikaSynonyme(int idPeriodikaSynonyme) {
		this.idPeriodikaSynonyme = idPeriodikaSynonyme;
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

	@Column(name = "Periodikasynonym")
	public String getPeriodikaSynonym() {
		return this.periodikaSynonym;
	}

	public void setPeriodikaSynonym(String periodikaSynonym) {
		this.periodikaSynonym = periodikaSynonym;
	}

	@Override
	public String toString() {
		return "Periodikasynonyme [idPeriodikaSynonyme=" + idPeriodikaSynonyme + ", periodika=" + periodika
				+ ", periodikaSynonym=" + periodikaSynonym + "]";
	}

}