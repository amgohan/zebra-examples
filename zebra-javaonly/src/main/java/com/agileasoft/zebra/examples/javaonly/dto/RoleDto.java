package com.agileasoft.zebra.examples.javaonly.dto;

public enum RoleDto {

	ADMIN("Administrator"),
	USER("Simple User"),
	SUPER_ADMIN("Super User"),
	MANAGER("Team manager");

	private String description;

	RoleDto(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

}
