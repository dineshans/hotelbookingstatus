package com.service.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.manager.HotelManager;
import com.manager.impl.HotelManagerImpl;
import com.response.ResponseEntity;
import com.service.HotelService;

@RestController
@RequestMapping(path = "/service")
public class HotelServiceImpl {

	@Autowired
	HotelManagerImpl manager;

	ResponseEntity response;

	@PostMapping(path = "/bookingstatus")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getHotelRoom(@RequestBody User userEntity) {
		String message = manager.RoomStatus(userEntity);

		if (message != null || !message.isEmpty()) {

			if (userEntity != null) {

				response = new ResponseEntity();

				response.setId(userEntity.getUserId());
				response.setName(userEntity.getName());
				response.setRoomStatus(message);

			}

		}

		return Response.status(Response.Status.OK).entity(response).build();
	}

	public void setManager(HotelManagerImpl manager) {
		this.manager = manager;
	}

}
