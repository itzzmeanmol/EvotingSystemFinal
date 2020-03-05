package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Tck;

@Repository
public interface TckRepository extends JpaRepository<Tck, Long> {
	@javax.transaction.Transactional
	@Modifying(clearAutomatically = true)
	@Query(value= "update tck t set t.tck=?1 where t.id=1",nativeQuery = true)
	int saveTck(@Param("tck") String tck);
}
