package com.aantivero.eeff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EntidadRepository extends JpaRepository<Entidad, Long> {
}
