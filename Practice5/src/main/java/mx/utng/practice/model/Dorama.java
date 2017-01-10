package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="doramas")
public class Dorama {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(length=70)
	private String category;
	@Column(length=70)
	private String director;
	public Dorama(String name, String category, String director) {
		super();
		this.name = name;
		this.category = category;
		this.director = director;
	}
	public Dorama() {
		this("","","");
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Dorama [id=" + id + ", name=" + name + ", category=" + category + ", director=" + director + "]";
	}
	
}