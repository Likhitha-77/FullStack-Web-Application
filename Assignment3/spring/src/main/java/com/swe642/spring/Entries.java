// Entries of the students class
package com.swe642.spring;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Entries {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="userName", nullable=false)
	private String userName;
		
	@Column(name="street_address", nullable=false)
	private String streetAddress;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="zip", nullable=false)
	private String zip;
	
	@Column(name="phone", nullable=false)
	private String phone;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="url", nullable=false)
	private String url;
	
	@Column(name="dateSurvey", nullable=false)
	private Date dateSurvey;
	
	@Column(name="likes", nullable=false)
	private String likes;
	
	@Column(name="interest", nullable=false)
	private String interests;
	
	@Column(name="recommendation", nullable=false)
	private String recommend;
	
	@Column(name="comments", nullable=false)
	private String comments;
	
	@Column(name="numbers", nullable=false)
	private String numbers;
		
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDateSurvey() {
		return dateSurvey;
	}
	public void setDateSurvey(Date dateSurvey) {
		this.dateSurvey = dateSurvey;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, comments, dateSurvey, email, interests, likes, numbers, phone, recommend, state,
				streetAddress, url, userName, zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entries other = (Entries) obj;
		return Objects.equals(city, other.city) && Objects.equals(comments, other.comments)
				&& Objects.equals(dateSurvey, other.dateSurvey) && Objects.equals(email, other.email)
				&& Objects.equals(interests, other.interests) && Objects.equals(likes, other.likes)
				&& Objects.equals(numbers, other.numbers) && Objects.equals(phone, other.phone)
				&& Objects.equals(recommend, other.recommend) && Objects.equals(state, other.state)
				&& Objects.equals(streetAddress, other.streetAddress) && Objects.equals(url, other.url)
				&& Objects.equals(userName, other.userName) && Objects.equals(zip, other.zip);
	}
	@Override
	public String toString() {
		return "Entries [userName=" + userName + ", streetAddress=" + streetAddress + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + ", url=" + url + ", dateSurvey="
				+ dateSurvey + ", likes=" + likes + ", interests=" + interests + ", recommend=" + recommend
				+ ", comments=" + comments + ", numbers=" + numbers + "]";
	}
	
	

}
