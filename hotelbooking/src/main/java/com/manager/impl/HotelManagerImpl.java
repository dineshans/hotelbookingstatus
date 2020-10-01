package com.manager.impl;

import org.springframework.stereotype.Component;
import com.entity.User;
import com.enums.*;
import com.manager.HotelManager;

@Component
public class HotelManagerImpl implements HotelManager {

	public String RoomStatus(User userEntity) {

		User user = null;

		int price = Amount.PRICE.getValue();

		int bonus = Amount.Bonus_POINTS.getValue();

		if (userEntity != null) {

			user = new User();

			user.setUserId(userEntity.getUserId());
			user.setName(userEntity.getName());
			user.setPrice(userEntity.getPrice());
			user.setBonusPoints(userEntity.getBonusPoints());

		}

		if (price == user.getPrice() && bonus == user.getBonusPoints()) {

			return RoomStatus.BOOKED.getStatus();

		} else if (price > user.getPrice() && bonus == user.getBonusPoints()) {

			return RoomStatus.PENDING_APPROVAL.getStatus();

		}
		return "Please use the more bonus points and amount";

	}

}
