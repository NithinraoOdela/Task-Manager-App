package com.tasks.taskmanager.Exception;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResourseNotFoundException extends RuntimeException {

	private UUID id;
	private String exception;

}
