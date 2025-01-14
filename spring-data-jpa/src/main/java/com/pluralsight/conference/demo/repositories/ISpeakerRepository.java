package com.pluralsight.conference.demo.repositories;

import com.pluralsight.conference.demo.models.Session;
import com.pluralsight.conference.demo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISpeakerRepository extends JpaRepository<Speaker, Long> {
    List<Speaker> findByFirstNameAndLastName(String firstName, String lastName);

    List<Speaker> findByFirstNameOrLastName(String firstName, String lastName);

    List<Speaker> findBySpeakerPhotoIsNull();

    List<Speaker> findByCompanyIn(List<String> companies);

    List<Speaker> findByCompanyIgnoreCase(String company);

    List<Speaker> findByLastNameOrderByFirstNameAsc(String lastName);

    List<Speaker> findByLastNameOrderByFirstNameDesc(String lastName);

    List<Speaker> findByFirstNameOrderByFirstNameAsc(String name);
}
