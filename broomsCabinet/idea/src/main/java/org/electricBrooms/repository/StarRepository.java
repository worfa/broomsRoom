package org.electricBrooms.repository;

import org.electricBrooms.entity.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource(collectionResourceRel = "stars", path = "stars")
public interface StarRepository extends JpaRepository<Star, Long> {
}