package com.indusnet.Restaurant_booking.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@ToString
@Builder
	public class LoggingResponseModel {
		private final HttpStatus statusCode;
		private final String traceId;
		private final String message;
		private final MessageTypeConst messageTypeId;
		private final String companyId;
		private final String tenantId;
		private final Long dateCreated;
		private final String userId;
	}

