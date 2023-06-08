package com.goyal.conf.conf.demo.repositories;

import com.goyal.conf.conf.demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository <Session, Long>{
}
