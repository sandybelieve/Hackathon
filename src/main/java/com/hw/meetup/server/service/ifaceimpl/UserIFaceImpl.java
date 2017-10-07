package com.hw.meetup.server.service.ifaceimpl;

import org.hornetq.utils.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw.meetup.server.entity.User;
import com.hw.meetup.server.repository.iface.UserRepository;
import com.hw.meetup.server.service.iface.UserIFace;

@Service
public class UserIFaceImpl implements UserIFace {

	@Autowired
	UserRepository userRepository;

	@Override
	public String addUser(String userJson) {

		try {
			JSONObject jsObject = new JSONObject(userJson);

			String userName = jsObject.getString("USERNAME");
			String phone = jsObject.getString("PHONE");
			String email = jsObject.getString("EMAIL");

			User user = new User();

			user.setEmail(email);
			user.setName(userName);
			user.setPhone(phone);

			return userRepository.addUser(user);

		} // try

		catch (Exception e) {
			e.printStackTrace();

			return "fail";
		} // Catch

	}// addUser()

}// UserIFaceImpl
