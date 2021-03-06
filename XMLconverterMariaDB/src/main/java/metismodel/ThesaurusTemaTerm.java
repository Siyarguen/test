package metismodel;
// default package
// Generated 05.09.2018 08:32:48 by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ThesaurusTemaTerm generated by hbm2java
 */
@Entity
@Table(name = "thesaurus_tema_term", catalog = "metis")
public class ThesaurusTemaTerm implements java.io.Serializable {

	private int termnr;
	private Character sta;
	private String term;
	private String lowerterm;
	private List<DokumentHatDeskriptor> dokumentHatDeskriptors = new ArrayList<DokumentHatDeskriptor>();

	public ThesaurusTemaTerm() {
	}

	public ThesaurusTemaTerm(int termnr) {
		this.termnr = termnr;
	}

	public ThesaurusTemaTerm(int termnr, Character sta, String term, String lowerterm,
			List<DokumentHatDeskriptor> dokumentHatDeskriptors) {
		this.termnr = termnr;
		this.sta = sta;
		this.term = term;
		this.lowerterm = lowerterm;
		this.dokumentHatDeskriptors = dokumentHatDeskriptors;
	}

	@Id

	@Column(name = "termnr", unique = true, nullable = false)
	public int getTermnr() {
		return this.termnr;
	}

	public void setTermnr(int termnr) {
		this.termnr = termnr;
	}

	@Column(name = "sta", length = 1)
	public Character getSta() {
		return this.sta;
	}

	public void setSta(Character sta) {
		this.sta = sta;
	}

	@Column(name = "term", length = 60)
	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@Column(name = "lowerterm", length = 61)
	public String getLowerterm() {
		return this.lowerterm;
	}

	public void setLowerterm(String lowerterm) {
		this.lowerterm = lowerterm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thesaurusTemaTerm")
	public List<DokumentHatDeskriptor> getDokumentHatDeskriptors() {
		return this.dokumentHatDeskriptors;
	}

	public void setDokumentHatDeskriptors(List<DokumentHatDeskriptor> dokumentHatDeskriptors) {
		this.dokumentHatDeskriptors = dokumentHatDeskriptors;
	}

	@Override
	public String toString() {
		return "ThesaurusTemaTerm [termnr=" + termnr + ", sta=" + sta + ", term=" + term + ", lowerterm=" + lowerterm
				+ ", dokumentHatDeskriptors=" + dokumentHatDeskriptors + "]";
	}

}
