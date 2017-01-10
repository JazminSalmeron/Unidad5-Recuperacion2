package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Dorama;
import mx.utng.practice.model.Store;
import mx.utng.practice.repository.DoramaRepository;
import mx.utng.practice.repository.StoreRepository;



@Named
@ViewScoped
public class StoreController {

	@Autowired
	private StoreRepository storeRepository;
	private Store store=new Store();
	private List<Store>stores;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setStores(storeRepository.findAll());
	}

	public void save(){
		storeRepository.save(store);
		if(!editMode){
			getStores().add(store);
		}
		store=new Store();
		setEditMode(false);
	}
	
	public void delete(Store store){
		storeRepository.delete(store);
		stores.remove(store);
	}
	public void update(Store store){
		setStore(store);
		setEditMode(true);
	}
	public void cancel(){
		store =new Store();
		setEditMode(false);
	}
	
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
