package org.rj.lombok.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rj.lombok.model.UserPojo;
import org.rj.lombok.service.UserCommand;

@Mapper
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserCommand userToUserCommand(UserPojo user);
	
	UserPojo userCommandToUser(UserCommand userCommand);
}
