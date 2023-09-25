package com.example.lab10.model;
//BVIDHYASAGAR..AF0320724
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="area_id")
    private int id;
	
	@Column(name="area_name")
    private String name;
	
	@OneToMany(mappedBy="area",cascade=CascadeType.ALL)
	private List<Persons> person=new ArrayList<Persons>();

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Address(int id, String name, List<Persons> person) {
		super();
		this.id = id;
		this.name = name;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Persons> getPersons() {
		return person;
	}

	public void setPersons(List<Persons> persons) {
		this.person = persons;
	}
	
	
	


}
