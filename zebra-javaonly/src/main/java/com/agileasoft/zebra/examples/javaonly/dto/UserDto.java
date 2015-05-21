package com.agileasoft.zebra.examples.javaonly.dto;

import java.util.List;

public class UserDto {

	private String firstName;

	private String lastName;

	private String username;

	private String password;

	private String birthdate;

	private List<RoleDto> roles;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(final String birthdate) {
		this.birthdate = birthdate;
	}

	public List<RoleDto> getRoles() {
		return this.roles;
	}

	public void setRoles(final List<RoleDto> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.birthdate == null ? 0 : this.birthdate.hashCode());
		result = prime * result + (this.firstName == null ? 0 : this.firstName.hashCode());
		result = prime * result + (this.lastName == null ? 0 : this.lastName.hashCode());
		result = prime * result + (this.password == null ? 0 : this.password.hashCode());
		result = prime * result + (this.roles == null ? 0 : this.roles.hashCode());
		result = prime * result + (this.username == null ? 0 : this.username.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final UserDto other = (UserDto) obj;
		if (this.birthdate == null) {
			if (other.birthdate != null) {
				return false;
			}
		} else if (!this.birthdate.equals(other.birthdate)) {
			return false;
		}
		if (this.firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!this.firstName.equals(other.firstName)) {
			return false;
		}
		if (this.lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!this.lastName.equals(other.lastName)) {
			return false;
		}
		if (this.password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!this.password.equals(other.password)) {
			return false;
		}
		if (this.roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!this.roles.equals(other.roles)) {
			return false;
		}
		if (this.username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!this.username.equals(other.username)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "UserDto [firstName=" + this.firstName + ", lastName=" + this.lastName + ", username=" + this.username + ", password=" + this.password + ", birthdate=" + this.birthdate + ", roles=" + this.roles + "]";
	}

}
