package com.sunsin.hogwarts1.repository;

import com.sunsin.hogwarts1.model.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

    Optional<Avatar> findByStudentId(long studentId);
}
