package com.ritz.restapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="USERS")
public class User implements Serializable {
	
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String company;
	private int userTypeId;
	private String phone;
	private String password;
	private String salt;
	private Boolean activeFlg;
	private Boolean showInfo;
	private Boolean approved;
	private String jobTitle;
	private String notes;
	private int crteById;
	private Date crteTs;
	private int updtById;
	private Date updtTs;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Boolean getActiveFlg() {
		return activeFlg;
	}
	public void setActiveFlg(Boolean activeFlg) {
		this.activeFlg = activeFlg;
	}
	public Boolean getShowInfo() {
		return showInfo;
	}
	public void setShowInfo(Boolean showInfo) {
		this.showInfo = showInfo;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getCrteById() {
		return crteById;
	}
	public void setCrteById(int crteById) {
		this.crteById = crteById;
	}
	public Date getCrteTs() {
		return crteTs;
	}
	public void setCrteTs(Date crteTs) {
		this.crteTs = crteTs;
	}
	public int getUpdtById() {
		return updtById;
	}
	public void setUpdtById(int updtById) {
		this.updtById = updtById;
	}
	public Date getUpdtTs() {
		return updtTs;
	}
	public void setUpdtTs(Date updtTs) {
		this.updtTs = updtTs;
	}
}
