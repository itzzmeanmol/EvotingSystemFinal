package com.evotingapi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
	@Query(value= "select c from Candidate c where c.vin=?1 and c.password=?2",nativeQuery = true)
	Candidate findCandidateByLogin(@Param("vin") int vin, @Param("password") String password);
	
	@Transactional
	@Modifying
	@Query(value = "update Candidates c set c.votecount = c.votecount+1 where c.vin=?1", nativeQuery = true)
	int addVote(@Param("vin") int vin);
	
	@Query(value= "select c.name, c.city, max(c.votecount) from Candidates c group by c.city",nativeQuery = true)
	List<Object[]> showResults();
	

	@javax.transaction.Transactional
	@Modifying(clearAutomatically = true)
	@Query(value= "update Candidates v set v.flag=1 where v.vin=?1",nativeQuery = true)
	int updateFlag(@Param("vin") int vin);
}
