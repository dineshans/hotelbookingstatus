package com.service;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.entity.User;
import com.response.ResponseEntity;

public interface HotelService {

	public Response getHotelRoom(User userEntity);

}
