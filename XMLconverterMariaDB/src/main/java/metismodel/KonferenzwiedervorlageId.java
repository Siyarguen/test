package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * KonferenzwiedervorlageId generated by hbm2java
 */
@Embeddable
public class KonferenzwiedervorlageId implements java.io.Serializable {

	private int idkonferenzwiedervorlage;
	private int konferenzreiheIdKonferenz;
	private int konferenzreiheVersion;
	private int bearbeiterIdBearbeiter;

	public KonferenzwiedervorlageId() {
	}

	public KonferenzwiedervorlageId(int idkonferenzwiedervorlage, int konferenzreiheIdKonferenz,
			int konferenzreiheVersion, int bearbeiterIdBearbeiter) {
		this.idkonferenzwiedervorlage = idkonferenzwiedervorlage;
		this.konferenzreiheIdKonferenz = konferenzreiheIdKonferenz;
		this.konferenzreiheVersion = konferenzreiheVersion;
		this.bearbeiterIdBearbeiter = bearbeiterIdBearbeiter;
	}

	@Column(name = "idkonferenzwiedervorlage", nullable = false)
	public int getIdkonferenzwiedervorlage() {
		return this.idkonferenzwiedervorlage;
	}

	public void setIdkonferenzwiedervorlage(int idkonferenzwiedervorlage) {
		this.idkonferenzwiedervorlage = idkonferenzwiedervorlage;
	}

	@Column(name = "konferenzreihe_idkonferenz", nullable = false)
	public int getKonferenzreiheIdKonferenz() {
		return this.konferenzreiheIdKonferenz;
	}

	public void setKonferenzreiheIdKonferenz(int konferenzreiheIdKonferenz) {
		this.konferenzreiheIdKonferenz = konferenzreiheIdKonferenz;
	}

	@Column(name = "konferenzreihe_Version", nullable = false)
	public int getKonferenzreiheVersion() {
		return this.konferenzreiheVersion;
	}

	public void setKonferenzreiheVersion(int konferenzreiheVersion) {
		this.konferenzreiheVersion = konferenzreiheVersion;
	}

	@Column(name = "bearbeiter_idbearbeiter", nullable = false)
	public int getBearbeiterIdBearbeiter() {
		return this.bearbeiterIdBearbeiter;
	}

	public void setBearbeiterIdBearbeiter(int bearbeiterIdBearbeiter) {
		this.bearbeiterIdBearbeiter = bearbeiterIdBearbeiter;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KonferenzwiedervorlageId))
			return false;
		KonferenzwiedervorlageId castOther = (KonferenzwiedervorlageId) other;

		return (this.getIdkonferenzwiedervorlage() == castOther.getIdkonferenzwiedervorlage())
				&& (this.getKonferenzreiheIdKonferenz() == castOther.getKonferenzreiheIdKonferenz())
				&& (this.getKonferenzreiheVersion() == castOther.getKonferenzreiheVersion())
				&& (this.getBearbeiterIdBearbeiter() == castOther.getBearbeiterIdBearbeiter());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdkonferenzwiedervorlage();
		result = 37 * result + this.getKonferenzreiheIdKonferenz();
		result = 37 * result + this.getKonferenzreiheVersion();
		result = 37 * result + this.getBearbeiterIdBearbeiter();
		return result;
	}

}
