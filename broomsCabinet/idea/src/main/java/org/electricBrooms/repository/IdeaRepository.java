package org.electricBrooms.repository;

import org.electricBrooms.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource(collectionResourceRel = "ideas", path = "ideas")
public interface IdeaRepository extends JpaRepository<Idea, Long> {
}