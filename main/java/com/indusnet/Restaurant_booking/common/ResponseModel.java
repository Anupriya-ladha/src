package com.indusnet.Restaurant_booking.common;




import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class ResponseModel extends CoreModel{
	
	private final HttpStatus statusCode;
	private final String traceId;
	private final String messageEn;
	private final String messageFr;
	private final int messageTypeId;

}
