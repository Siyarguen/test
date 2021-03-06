package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AusfallzeitId generated by hbm2java
 */
@Embeddable
public class AusfallzeitId implements java.io.Serializable {

	private int idAusfallzeit;
	private int bearbeiterIdBearbeiter;

	public AusfallzeitId() {
	}

	public AusfallzeitId(int idAusfallzeit, int bearbeiterIdBearbeiter) {
		this.idAusfallzeit = idAusfallzeit;
		this.bearbeiterIdBearbeiter = bearbeiterIdBearbeiter;
	}

	@Column(name = "idAusfallzeit", nullable = false)
	public int getIdAusfallzeit() {
		return this.idAusfallzeit;
	}

	public void setIdAusfallzeit(int idAusfallzeit) {
		this.idAusfallzeit = idAusfallzeit;
	}

	@Column(name = "Bearbeiter_idBearbeiter", nullable = false)
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
		if (!(other instanceof AusfallzeitId))
			return false;
		AusfallzeitId castOther = (AusfallzeitId) other;

		return (this.getIdAusfallzeit() == castOther.getIdAusfallzeit())
				&& (this.getBearbeiterIdBearbeiter() == castOther.getBearbeiterIdBearbeiter());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAusfallzeit();
		result = 37 * result + this.getBearbeiterIdBearbeiter();
		return result;
	}

}
