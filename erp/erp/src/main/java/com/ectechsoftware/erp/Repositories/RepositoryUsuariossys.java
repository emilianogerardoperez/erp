package com.ectechsoftware.erp.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import com.ectechsoftware.erp.Models.Usuariossys;

public interface RepositoryUsuariossys extends JpaRepository<Usuariossys, Integer> {
	
	Usuariossys findbyusersys(String username);

	
}

