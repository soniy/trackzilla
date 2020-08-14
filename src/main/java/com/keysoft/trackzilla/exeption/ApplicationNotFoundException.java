package com.keysoft.trackzilla.exeption;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class ApplicationNotFoundException extends RuntimeException implements GraphQLError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Map<String, Object> extensions = new HashMap<>();

	public ApplicationNotFoundException(String message, Long invalidApplicationId) {
		super(message);
		extensions.put("invalidApplicationId", invalidApplicationId);
	}

	@Override
	public List<SourceLocation> getLocations() {
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		return null;
	}

}
