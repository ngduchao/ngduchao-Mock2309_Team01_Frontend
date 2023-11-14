package com.vti.dto;

import java.util.Date;
import java.util.List;

import com.vti.entity.Ticket;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class FilmScheduleDTO {
	
	private Integer scheduleId;
	
	private Integer seatNumber;
	
	private Date timeSlot;
	
	private FilmDTO film;
	
	private List<Ticket> tickets;
	
	@Data
	@NoArgsConstructor
	public static class FilmDTO{
		private Integer filmId;
		
		private String name;
	}
}
