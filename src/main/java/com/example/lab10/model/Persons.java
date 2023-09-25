package com.example.lab10.model;
//BVIDHYASAGAR..AF0320724
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Persons 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
    private int id;
	
	@Column(name="person_name")
    private String name;
	
	@ManyToOne
	@JoinColumn(name="area_id")
	private Address area;

	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persons(int id, String name, Address area) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
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

	public Address getArea() {
		return area;
	}

	public void setArea(Address area) {
		this.area = area;
	}

}
