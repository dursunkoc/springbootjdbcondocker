package com.turkcell.softlab.db.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.softlab.db.model.Person;

@Repository
@Transactional
public interface PersonJpaRepository extends JpaRepository<Person, Long> {
}
