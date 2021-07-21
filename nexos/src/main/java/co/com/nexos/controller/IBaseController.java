package co.com.nexos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface IBaseController {
	
	public default ResponseEntity<?> basicResponse(Object data) {
		return new ResponseEntity<>(data,
				HttpStatus.OK);
	}
	
}
