package fr.imie.service;

import java.util.List;

import javax.ejb.Local;

import fr.imie.DTO.Manager;
import fr.imie.DTO.User;

@Local
public interface IUserService {

	public abstract List<User> findAll();

	public abstract List<User> findByNomPrenom(String nom, String prenom);

	public abstract void createManager(Manager manager);

	public abstract void deleteManagerById(int idUser);

	public abstract User findById(Integer idUser);

	public abstract Manager findManagerById(Integer idUser);

	public abstract void updateManager(Manager manager);

	void initData();

}