package io.swagger.myphotographer.common.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.swagger.myphotographer.common.domain.UserTO;
import io.swagger.myphotographer.user.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	User userTO2User(UserTO userTO);

	UserTO user2UserTO(User user);

	List<User> userTO2User(List<UserTO> userTO);

	List<UserTO> user2UserTO(List<User> user);
}
