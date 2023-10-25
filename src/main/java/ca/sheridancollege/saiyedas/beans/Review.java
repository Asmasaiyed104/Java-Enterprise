package ca.sheridancollege.saiyedas.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Review {

	private Long id;
	private String name;
	private String reviews;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate reviewDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalTime reviewTime;
	private final String[] STREAMSERVICES = { "Amazon Prime", "Netflix", "Apple TV" };
	private String service;

}
