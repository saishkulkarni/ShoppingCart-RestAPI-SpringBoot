package com.jspiders.shoppingcart.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private long phone;
	private String gender;
	private String token;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<ShoppingOrder> getShoppingOrders() {
		return shoppingOrders;
	}
	public void setShoppingOrders(List<ShoppingOrder> shoppingOrders) {
		this.shoppingOrders = shoppingOrders;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<WishList> getWishLists() {
		return wishLists;
	}
	public void setWishLists(List<WishList> wishLists) {
		this.wishLists = wishLists;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "customer")
	private List<ShoppingOrder> shoppingOrders;
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<Address> addresses;
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "customer")
	private List<WishList> wishLists;
	@OneToOne(cascade = CascadeType.REMOVE)
	private Cart cart;
}
