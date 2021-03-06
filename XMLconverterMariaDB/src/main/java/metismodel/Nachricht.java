package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Nachricht generated by hbm2java
 */
@Entity
@Table(name = "nachricht", catalog = "metis")
public class Nachricht implements java.io.Serializable {

	private int idnachricht;
	private String nachricht;
	private Date zeitstempel;

	public Nachricht() {
	}

	public Nachricht(Date zeitstempel) {
		this.zeitstempel = zeitstempel;
	}

	public Nachricht(String nachricht, Date zeitstempel) {
		this.nachricht = nachricht;
		this.zeitstempel = zeitstempel;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idnachricht", unique = true, nullable = false)
	public int getIdnachricht() {
		return this.idnachricht;
	}

	public void setIdnachricht(int idnachricht) {
		this.idnachricht = idnachricht;
	}

	@Column(name = "Nachricht")
	public String getNachricht() {
		return this.nachricht;
	}

	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Zeitstempel", nullable = false, length = 19)
	public Date getZeitstempel() {
		return this.zeitstempel;
	}

	public void setZeitstempel(Date zeitstempel) {
		this.zeitstempel = zeitstempel;
	}

	@Override
	public String toString() {
		return "Nachricht [idnachricht=" + idnachricht + ", nachricht=" + nachricht + ", zeitstempel=" + zeitstempel
				+ "]";
	}

}
