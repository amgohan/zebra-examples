package com.agileasoft.zebra.examples.javaonly.entity;

import java.util.Date;
import java.util.List;

public class User {

	private String fullName;

	private String email;

	private String password;

	private Date birthDate;

	private List<Role> roles;

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(final Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(final List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.birthDate == null ? 0 : this.birthDate.hashCode());
		result = prime * result + (this.email == null ? 0 : this.email.hashCode());
		result = prime * result + (this.fullName == null ? 0 : this.fullName.hashCode());
		result = prime * result + (this.password == null ? 0 : this.password.hashCode());
		result = prime * result + (this.roles == null ? 0 : this.roles.hashCode());
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
		final User other = (User) obj;
		if (this.birthDate == null) {
			if (other.birthDate != null) {
				return false;
			}
		} else if (!(this.birthDate.getTime() == other.birthDate.getTime())) {
			return false;
		}
		if (this.email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!this.email.equals(other.email)) {
			return false;
		}
		if (this.fullName == null) {
			if (other.fullName != null) {
				return false;
			}
		} else if (!this.fullName.equals(other.fullName)) {
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
		return true;
	}

	@Override
	public String toString() {
		return "User [fullName=" + this.fullName + ", email=" + this.email + ", password=" + this.password + ", birthDate=" + this.birthDate.getTime() + ", roles=" + this.roles + "]";
	}

}
