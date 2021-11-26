package com.careerdevs.openshit.repositories;

import com.careerdevs.openshit.models.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
