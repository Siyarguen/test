package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MetisTrigger generated by hbm2java
 */
@Entity
@Table(name = "metis_trigger", catalog = "metis")
public class MetisTrigger implements java.io.Serializable {

	private String parameterName;
	private String parameterValue;
	private String kommentar;

	public MetisTrigger() {
	}

	public MetisTrigger(String parameterName) {
		this.parameterName = parameterName;
	}

	public MetisTrigger(String parameterName, String parameterValue, String kommentar) {
		this.parameterName = parameterName;
		this.parameterValue = parameterValue;
		this.kommentar = kommentar;
	}

	@Id

	@Column(name = "parameter_name", unique = true, nullable = false, length = 50)
	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	@Column(name = "parameter_value", length = 1024)
	public String getParameterValue() {
		return this.parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}

	@Column(name = "kommentar")
	public String getKommentar() {
		return this.kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	@Override
	public String toString() {
		return "MetisTrigger [parameterName=" + parameterName + ", parameterValue=" + parameterValue + ", kommentar="
				+ kommentar + "]";
	}

}
