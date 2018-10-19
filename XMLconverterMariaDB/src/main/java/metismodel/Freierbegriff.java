package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Freierbegriff generated by hbm2java
 */
@Entity
@Table(name = "freierbegriff", catalog = "metis")
public class Freierbegriff implements java.io.Serializable {

	private int idfreierBegriff;
	private String freierBegriff;
	private List<DokumentHatFreierbegriff> dokumentHatFreierbegriffs = new ArrayList<DokumentHatFreierbegriff>();

	public Freierbegriff() {
	}

	public Freierbegriff(String freierBegriff, List<DokumentHatFreierbegriff> dokumentHatFreierbegriffs) {
		this.freierBegriff = freierBegriff;
		this.dokumentHatFreierbegriffs = dokumentHatFreierbegriffs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idfreierbegriff", unique = true, nullable = false)
	public int getIdfreierBegriff() {
		return this.idfreierBegriff;
	}

	public void setIdfreierBegriff(int idfreierBegriff) {
		this.idfreierBegriff = idfreierBegriff;
	}

	@Column(name = "freierbegriff", length = 100)
	public String getFreierBegriff() {
		return this.freierBegriff;
	}

	public void setFreierBegriff(String freierBegriff) {
		this.freierBegriff = freierBegriff;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "freierbegriff")
	public List<DokumentHatFreierbegriff> getDokumentHatFreierbegriffs() {
		return this.dokumentHatFreierbegriffs;
	}

	public void setDokumentHatFreierbegriffs(List<DokumentHatFreierbegriff> dokumentHatFreierbegriffs) {
		this.dokumentHatFreierbegriffs = dokumentHatFreierbegriffs;
	}

	@Override
	public String toString() {
		return "Freierbegriff [idfreierBegriff=" + idfreierBegriff + ", freierBegriff=" + freierBegriff
				+ ", dokumentHatFreierbegriffs=" + dokumentHatFreierbegriffs + "]";
	}

}