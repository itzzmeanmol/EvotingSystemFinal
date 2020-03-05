package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Ess;

@Repository
public interface EssRepository extends JpaRepository<Ess, Long> {
	@javax.transaction.Transactional
	@Modifying(clearAutomatically = true)
	@Query(value= "update essflag e set e.ess=?1 where e.id=1",nativeQuery = true)
	int saveEss(@Param("ess") int ess);
}
