package com.agileasoft.zebra.examples.javaonly.mapper;

import com.agileasoft.zebra.Mapper;
import com.agileasoft.zebra.examples.javaonly.dto.RoleDto;
import com.agileasoft.zebra.examples.javaonly.entity.Role;

public class RoleDtoEntityMapper extends Mapper<RoleDto, Role> {

	@Override
	public Role mapAToB(final RoleDto dto) {
		final Role entity = new Role();
		entity.setCode(dto.name());
		entity.setLabel(dto.getDescription());
		return entity;
	}

	@Override
	public RoleDto mapBToA(final Role entity) {
		return RoleDto.valueOf(entity.getCode());
	}

}
