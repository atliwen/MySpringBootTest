package com.exampl.myproject.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exampl.myproject.bean.Usertest;

public interface UserRepository extends JpaRepository<Usertest, Long>
{

	Usertest findByName(String name);

	Usertest findByNameAndAge(String name, Integer age);

	@Query("from Usertest u where u.name=:name")
	Usertest findUser(@Param("name") String name);

}