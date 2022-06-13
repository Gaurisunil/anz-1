package com.prog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User_Details")
public class UserDetails {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID")
private int id;

private String firstname;
private String lastname;
private String email;
private String gender;
private String dob;
private String password;
private String cpassword;


public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}


public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
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
public String getDob() {
return dob;
}
public void setDob(String dob) {
this.dob = dob;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public String getCpassword() {
return cpassword;
}
public void setCpassword(String cpassword) {
this.cpassword = cpassword;
}


@Override
public String toString() {
return "UserDetails [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
+ ", gender=" + gender + ", dob=" + dob + ", password=" + password + ", cpassword=" + cpassword + "]";
}




}