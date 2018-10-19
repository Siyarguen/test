package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DokumentHatKlassifikationId generated by hbm2java
 */
@Embeddable
public class DokumentHatKlassifikationId implements java.io.Serializable {

	private int dokumentIdDokument;
	private int klassifikationIdklassifikation;

	public DokumentHatKlassifikationId() {
	}

	public DokumentHatKlassifikationId(int dokumentIdDokument, int klassifikationIdklassifikation) {
		this.dokumentIdDokument = dokumentIdDokument;
		this.klassifikationIdklassifikation = klassifikationIdklassifikation;
	}

	@Column(name = "dokument_iddokument", nullable = false)
	public int getDokumentIdDokument() {
		return this.dokumentIdDokument;
	}

	public void setDokumentIdDokument(int dokumentIdDokument) {
		this.dokumentIdDokument = dokumentIdDokument;
	}

	@Column(name = "klassifikation_idklassifikation", nullable = false)
	public int getKlassifikationIdklassifikation() {
		return this.klassifikationIdklassifikation;
	}

	public void setKlassifikationIdklassifikation(int klassifikationIdklassifikation) {
		this.klassifikationIdklassifikation = klassifikationIdklassifikation;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DokumentHatKlassifikationId))
			return false;
		DokumentHatKlassifikationId castOther = (DokumentHatKlassifikationId) other;

		return (this.getDokumentIdDokument() == castOther.getDokumentIdDokument())
				&& (this.getKlassifikationIdklassifikation() == castOther.getKlassifikationIdklassifikation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDokumentIdDokument();
		result = 37 * result + this.getKlassifikationIdklassifikation();
		return result;
	}

}
