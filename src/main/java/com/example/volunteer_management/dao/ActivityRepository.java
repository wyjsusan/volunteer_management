package com.example.volunteer_management.dao;

import com.example.volunteer_management.model.Activity;
import com.example.volunteer_management.model.RecordState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    List<Activity> findAllByIsDeleted(RecordState recordState);

    Optional<Activity> findByName(String name);
}
