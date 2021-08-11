package com.bean;



public class UserBean {
	private int userId;
	private String name;
	private String email;
	private String gender;
	private String mobile;
	private String password;
	private String profilePic;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", name=" + name + ", email=" + email + ", gender=" + gender + ", mobile="
				+ mobile + ", password=" + password + ", profilePic=" + profilePic + "]";
	}
	
	
	
}