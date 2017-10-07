package com.hw.meetup.server.repository.ifaceimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hw.meetup.server.basedao.MeetUpBaseDao;
import com.hw.meetup.server.entity.User;
import com.hw.meetup.server.repository.iface.UserRepository;


@Repository
public class UserRepositoryImpl extends MeetUpBaseDao implements UserRepository{

	
	
	@Override
	public String addUser(User user) {
		
		try
		{
			entityManager.persist(user);
			
			return "sucess";
		}
		catch( Exception e)
		{
			
			e.printStackTrace();
			return "fail";
			
		}//catch
		
	}

}//UserRepositoryImpl
