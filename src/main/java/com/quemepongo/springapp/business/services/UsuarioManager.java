package com.quemepongo.springapp.business.services;

import java.util.ArrayList;

import com.quemepongo.springapp.business.entities.Usuario;

public interface UsuarioManager {
	ArrayList<Usuario> getAllusers();
	
	void setUsers(ArrayList<Usuario> users);
	
	void setEmail(String username, String email);
}
