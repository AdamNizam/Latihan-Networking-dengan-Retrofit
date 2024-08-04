package com.example.restaurantreview.data.response;

public class Response{
	private Restaurant restaurant;
	private boolean error;
	private String message;

	public Restaurant getRestaurant(){
		return restaurant;
	}

	public boolean isError(){
		return error;
	}

	public String getMessage(){
		return message;
	}
}
