package com.wisely.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisely.person.domain.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends JpaRepository<Person, Long>{

}
