package com.agileasoft.zebra.examples.javaonly;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.agileasoft.zebra.MapperProcessor;
import com.agileasoft.zebra.examples.javaonly.dto.UserDto;
import com.agileasoft.zebra.examples.javaonly.entity.Role;
import com.agileasoft.zebra.examples.javaonly.entity.User;

public class MapperTest {

	private MapperProcessor mapper;

	@Before
	public void before() {
		this.mapper = MapperFactorySingleton.getInstance().getMapper();
	}

	@Test
	public void mappingUserToUserDtoTest() {
		final User expectedUser = this.getUser();
		final UserDto userDto = this.mapper.map(expectedUser, UserDto.class);
		final User actualUser = this.mapper.map(userDto, User.class);
		System.out.println(expectedUser);
		System.out.println(actualUser);
		Assert.assertEquals(expectedUser.toString(), actualUser.toString());
		Assert.assertEquals(expectedUser, actualUser);
	}

	private User getUser() {
		final User user = new User();
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			user.setBirthDate(sdf.parse("2000-12-03"));
		} catch (final ParseException exception) {
			//
		}
		user.setEmail("test@test.com");
		user.setFullName("Jhon, Smith");
		user.setPassword("12345");
		user.setRoles(this.getRoles());
		return user;
	}

	private List<Role> getRoles() {

		return Arrays.asList(new Role[] { new Role("ADMIN", "Administrator"), new Role("MANAGER", "Team manager") });
	}
}
