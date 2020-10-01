package com.enums;

public enum RoomStatus {

	BOOKED("BOOKED"), PENDING_APPROVAL("PENDING APPROVAL");

	private String status;

	private RoomStatus(String status) {

		this.status = status;

	}

	public String getStatus() {
		return status;
	}

}
