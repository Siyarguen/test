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
 * Allelaender generated by hbm2java
 */
@Entity
@Table(name = "allelaender", catalog = "metis")
public class Allelaender implements java.io.Serializable {

	private String iso3166Alpha2;
	private String name;
	private String ename;
	private String iso3166Alpha3;
	private String iso3166Num;
	private String tld;
	private String ioc;
	private String iso31662;
	private String un;
	private List<Institution> institutions = new ArrayList<Institution>();
	private List<Konferenzereignis> konferenzereignises = new ArrayList<Konferenzereignis>();
	private List<Lieferant> lieferants = new ArrayList<Lieferant>();
	private List<Verlag> verlags = new ArrayList<Verlag>();
	private List<Bearbeiter> bearbeiters = new ArrayList<Bearbeiter>();

	public Allelaender() {
	}

	public Allelaender(String iso3166Alpha2) {
		this.iso3166Alpha2 = iso3166Alpha2;
	}

	public Allelaender(String iso3166Alpha2, String name, String ename, String iso3166Alpha3, String iso3166Num,
			String tld, String ioc, String iso31662, String un, List<Institution> institutions,
			List<Konferenzereignis> konferenzereignises, List<Lieferant> lieferants, List<Verlag> verlags,
			List<Bearbeiter> bearbeiters) {
		this.iso3166Alpha2 = iso3166Alpha2;
		this.name = name;
		this.ename = ename;
		this.iso3166Alpha3 = iso3166Alpha3;
		this.iso3166Num = iso3166Num;
		this.tld = tld;
		this.ioc = ioc;
		this.iso31662 = iso31662;
		this.un = un;
		this.institutions = institutions;
		this.konferenzereignises = konferenzereignises;
		this.lieferants = lieferants;
		this.verlags = verlags;
		this.bearbeiters = bearbeiters;
	}

	@Id

	@Column(name = "ISO3166_ALPHA2", unique = true, nullable = false, length = 2)
	public String getIso3166Alpha2() {
		return this.iso3166Alpha2;
	}

	public void setIso3166Alpha2(String iso3166Alpha2) {
		this.iso3166Alpha2 = iso3166Alpha2;
	}

	@Column(name = "Name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ename")
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Column(name = "ISO3166_ALPHA3", length = 3)
	public String getIso3166Alpha3() {
		return this.iso3166Alpha3;
	}

	public void setIso3166Alpha3(String iso3166Alpha3) {
		this.iso3166Alpha3 = iso3166Alpha3;
	}

	@Column(name = "ISO3166_num", length = 3)
	public String getIso3166Num() {
		return this.iso3166Num;
	}

	public void setIso3166Num(String iso3166Num) {
		this.iso3166Num = iso3166Num;
	}

	@Column(name = "TLD", length = 10)
	public String getTld() {
		return this.tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}

	@Column(name = "IOC", length = 3)
	public String getIoc() {
		return this.ioc;
	}

	public void setIoc(String ioc) {
		this.ioc = ioc;
	}

	@Column(name = "ISO3166_2", length = 2)
	public String getIso31662() {
		return this.iso31662;
	}

	public void setIso31662(String iso31662) {
		this.iso31662 = iso31662;
	}

	@Column(name = "UN", length = 2)
	public String getUn() {
		return this.un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "allelaender")
	public List<Institution> getInstitutions() {
		return this.institutions;
	}

	public void setInstitutions(List<Institution> institutions) {
		this.institutions = institutions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "allelaender")
	public List<Konferenzereignis> getKonferenzereignises() {
		return this.konferenzereignises;
	}

	public void setKonferenzereignises(List<Konferenzereignis> konferenzereignises) {
		this.konferenzereignises = konferenzereignises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "allelaender")
	public List<Lieferant> getLieferants() {
		return this.lieferants;
	}

	public void setLieferants(List<Lieferant> lieferants) {
		this.lieferants = lieferants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "allelaender")
	public List<Verlag> getVerlags() {
		return this.verlags;
	}

	public void setVerlags(List<Verlag> verlags) {
		this.verlags = verlags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "allelaender")
	public List<Bearbeiter> getBearbeiters() {
		return this.bearbeiters;
	}

	public void setBearbeiters(List<Bearbeiter> bearbeiters) {
		this.bearbeiters = bearbeiters;
	}

	@Override
	public String toString() {
		return "Allelaender [iso3166Alpha2=" + iso3166Alpha2 + ", name=" + name + ", ename=" + ename
				+ ", iso3166Alpha3=" + iso3166Alpha3 + ", iso3166Num=" + iso3166Num + ", tld=" + tld + ", ioc=" + ioc
				+ ", iso31662=" + iso31662 + ", un=" + un + ", institutions=" + institutions + ", konferenzereignises="
				+ konferenzereignises + ", lieferants=" + lieferants + ", verlags=" + verlags + ", bearbeiters="
				+ bearbeiters + "]";
	}

	
	
	
}
