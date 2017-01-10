package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Dorama;
import mx.utng.practice.repository.DoramaRepository;



@Named
@ViewScoped
public class DoramaController {

	@Autowired
	private DoramaRepository doramaRepository;
	private Dorama dorama=new Dorama();
	private List<Dorama>doramas;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setDoramas(doramaRepository.findAll());
	}

	public void save(){
		doramaRepository.save(dorama);
		if(!editMode){
			getDoramas().add(dorama);
		}
		dorama=new Dorama();
		setEditMode(false);
	}
	
	public void delete(Dorama dorama){
		doramaRepository.delete(dorama);
		doramas.remove(dorama);
	}
	public void update(Dorama dorama){
		setDorama(dorama);
		setEditMode(true);
	}
	public void cancel(){
		dorama =new Dorama();
		setEditMode(false);
	}
	
	public Dorama getDorama() {
		return dorama;
	}

	public void setDorama(Dorama dorama) {
		this.dorama = dorama;
	}

	public List<Dorama> getDoramas() {
		return doramas;
	}

	public void setDoramas(List<Dorama> doramas) {
		this.doramas = doramas;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
