package com.techie.datamaxbackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techie.datamaxbackend.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
	public Optional<Users> findByEmailAndPassword(String email, String password);
	public List<Users> findByEmail(String email);

}
