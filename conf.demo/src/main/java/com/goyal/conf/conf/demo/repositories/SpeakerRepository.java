package com.goyal.conf.conf.demo.repositories;


import com.goyal.conf.conf.demo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
