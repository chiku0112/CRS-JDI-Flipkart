/**
 * 
 */
package com.flipkart.bean;

/**
 * @author Ananya Varma
 *
 */
public class User {
	
	private String userID;
	private String name;
	private Role role;
	private String password;
	private String address;
	
	/**
	 * @param userID
	 * @param name
	 * @param role
	 * @param password
	 * @param address
	 */
	public User(String userID, String name, Role role, String password, String address) {
		super();
		this.userID = userID;
		this.name = name;
		this.role = role;
		this.password = password;
		this.address = address;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
