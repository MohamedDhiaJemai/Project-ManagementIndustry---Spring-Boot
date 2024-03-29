package com.taskManagement.dev.repository.administratif;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.taskManagement.dev.dao.administratif.RapportCommission;

@RepositoryRestResource
public interface RapportCommissionRepository extends JpaRepository<RapportCommission, Long> {

}
