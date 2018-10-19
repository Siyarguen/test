package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PeriodikaId generated by hbm2java
 */
@Embeddable
public class PeriodikaId implements java.io.Serializable {

	private int zcode;
	private int version;

	public PeriodikaId() {
	}

	public PeriodikaId(int zcode, int version) {
		this.zcode = zcode;
		this.version = version;
	}

	@Column(name = "ZCode", nullable = false)
	public int getZcode() {
		return this.zcode;
	}

	public void setZcode(int zcode) {
		this.zcode = zcode;
	}

	@Column(name = "Version", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PeriodikaId))
			return false;
		PeriodikaId castOther = (PeriodikaId) other;

		return (this.getZcode() == castOther.getZcode()) && (this.getVersion() == castOther.getVersion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getZcode();
		result = 37 * result + this.getVersion();
		return result;
	}

}
