package com.eda.icerikyonetimi.service;

import com.eda.icerikyonetimi.entity.User;
import com.eda.icerikyonetimi.repository.UserRepository;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;
import com.eda.icerikyonetimi.utility.MyFactoryService;

import java.util.Optional;

public class UserService extends MyFactoryService<MyFactoryRepository, User, Long> {
	private final static UserRepository repository = new UserRepository();
	public UserService() {

		super(repository);

	}
	public Optional<User> enCokIcerikUreten() {
		try {
			return repository.enCokIcerikUreten();
		} catch (Exception e) {
			return Optional.ofNullable(null);
		}

	}
}




