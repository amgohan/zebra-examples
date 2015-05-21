package com.agileasoft.zebra.examples.javaonly.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.agileasoft.zebra.Mapper;
import com.agileasoft.zebra.examples.javaonly.dto.RoleDto;
import com.agileasoft.zebra.examples.javaonly.dto.UserDto;
import com.agileasoft.zebra.examples.javaonly.entity.Role;
import com.agileasoft.zebra.examples.javaonly.entity.User;

public class UserDtoEntityMapper extends Mapper<UserDto, User> {

	private final static String DATE_FORMAT_PATTERN = "yyyy-MM-dd";

	@Override
	public User mapAToB(final UserDto dto) {
		final User entity = new User();

		entity.setFullName(dto.getFirstName() + ", " + dto.getLastName());

		entity.setEmail(dto.getUsername());

		entity.setBirthDate(this.parseDate(dto.getBirthdate()));

		entity.setPassword(dto.getPassword());

		// deep mapping : here we call the mapper to map RoleDto to Role using the injected mapper RoleDtoEntityMapper
		entity.setRoles(this.mapper.map(dto.getRoles(), Role.class));

		return entity;
	}

	@Override
	public UserDto mapBToA(final User entity) {
		final UserDto dto = new UserDto();

		dto.setBirthdate(this.formatDate(entity.getBirthDate()));

		final String[] fullNameSplit = entity.getFullName().split(", ");

		dto.setFirstName(fullNameSplit[0]);

		dto.setLastName(fullNameSplit[1]);

		dto.setUsername(entity.getEmail());

		dto.setPassword(entity.getPassword());

		// deep mapping : here we call the mapper to map Role to RoleDto using the injected mapper RoleDtoEntityMapper
		dto.setRoles(this.mapper.map(entity.getRoles(), RoleDto.class));

		return dto;
	}

	private Date parseDate(final String date) {
		final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_PATTERN);
		try {
			return sdf.parse(date);
		} catch (final ParseException exception) {
			return null;
		}
	}

	private String formatDate(final Date date) {
		final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_PATTERN);
		return sdf.format(date);
	}

}
