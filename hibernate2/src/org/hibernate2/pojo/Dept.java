package org.hibernate2.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Dept {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer did;
	
	private String dname;
	@OneToMany(mappedBy="dept",cascade=CascadeType.ALL)
	private Set<Emp> se;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set<Emp> getSe() {
		return se;
	}
	public void setSe(Set<Emp> se) {
		this.se = se;
	}
	public Dept(Integer did, String dname, Set<Emp> se) {
		super();
		this.did = did;
		this.dname = dname;
		this.se = se;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
