package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Animal;
import mx.utng.practice.repository.AnimalRepository;




@Named
@ViewScoped
public class AnimalController {

	@Autowired
	private AnimalRepository animalRepository;
	private Animal animal=new Animal();
	private List<Animal>animals;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setAnimals(animalRepository.findAll());
	}

	public void save(){
		animalRepository.save(animal);
		if(!editMode){
			getAnimals().add(animal);
		}
		animal=new Animal();
		setEditMode(false);
	}
	
	public void delete(Animal animal){
		animalRepository.delete(animal);
		animals.remove(animal);
	}
	public void update(Animal animal){
		setAnimal(animal);
		setEditMode(true);
	}
	public void cancel(){
		animal =new Animal();
		setEditMode(false);
	}
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
