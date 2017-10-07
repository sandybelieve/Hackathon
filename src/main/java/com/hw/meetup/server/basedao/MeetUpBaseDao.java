package com.hw.meetup.server.basedao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MeetUpBaseDao {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	
	public void persist(Object obj)
	{
		
		entityManager.persist(obj);
		
	}//add()
	

}//MeetUpBaseDao
