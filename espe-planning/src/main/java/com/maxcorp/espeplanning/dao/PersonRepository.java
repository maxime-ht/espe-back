package com.maxcorp.espeplanning.dao;

import com.maxcorp.espeplanning.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByFirstNameAndLastNameAndBirthday(
            String firstName, String lastName, Date birthday
    );
}
