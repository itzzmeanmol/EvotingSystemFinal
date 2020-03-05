package com.evotingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.evotingapi.model.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Long> {

//	@Query(value= "select v from Voter v where v.vin=?1 and v.password=?2",nativeQuery = true)
//	Voter findVoterByLogin(@Param("vin") int vin, @Param("password") String password);
//	
	@javax.transaction.Transactional
	@Modifying(clearAutomatically = true)
	@Query(value= "update Voters v set v.flag=1 where v.vin=?1",nativeQuery = true)
	int updateFlag(@Param("vin") int vin);

	@javax.transaction.Transactional
	@Modifying(clearAutomatically = true)
	@Query(value= "update Voters v set v.castvote=1 where v.vin=?1",nativeQuery = true)
	int castVote(@Param("vin") int vin);
	

}
