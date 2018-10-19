package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DokumentHatKlassifikation generated by hbm2java
 */
@Entity
@Table(name = "dokument_hat_klassifikation", catalog = "metis")
public class DokumentHatKlassifikation implements java.io.Serializable {

	private DokumentHatKlassifikationId id;
	private Dokument dokument;
	private Klassifikation klassifikation;
	private Boolean autindex;

	public DokumentHatKlassifikation() {
	}

	public DokumentHatKlassifikation(DokumentHatKlassifikationId id, Dokument dokument, Klassifikation klassifikation) {
		this.id = id;
		this.dokument = dokument;
		this.klassifikation = klassifikation;
	}

	public DokumentHatKlassifikation(DokumentHatKlassifikationId id, Dokument dokument, Klassifikation klassifikation,
			Boolean autindex) {
		this.id = id;
		this.dokument = dokument;
		this.klassifikation = klassifikation;
		this.autindex = autindex;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dokumentIdDokument", column = @Column(name = "dokument_iddokument", nullable = false)),
			@AttributeOverride(name = "klassifikationIdklassifikation", column = @Column(name = "klassifikation_idklassifikation", nullable = false)) })
	public DokumentHatKlassifikationId getId() {
		return this.id;
	}

	public void setId(DokumentHatKlassifikationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dokument_iddokument", nullable = false, insertable = false, updatable = false)
	public Dokument getDokument() {
		return this.dokument;
	}

	public void setDokument(Dokument dokument) {
		this.dokument = dokument;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "klassifikation_idklassifikation", nullable = false, insertable = false, updatable = false)
	public Klassifikation getKlassifikation() {
		return this.klassifikation;
	}

	public void setKlassifikation(Klassifikation klassifikation) {
		this.klassifikation = klassifikation;
	}

	@Column(name = "Autindex")
	public Boolean getAutindex() {
		return this.autindex;
	}

	public void setAutindex(Boolean autindex) {
		this.autindex = autindex;
	}

	@Override
	public String toString() {
		return "DokumentHatKlassifikation [id=" + id + ", dokument=" + dokument + ", klassifikation=" + klassifikation
				+ ", autindex=" + autindex + "]";
	}

}
