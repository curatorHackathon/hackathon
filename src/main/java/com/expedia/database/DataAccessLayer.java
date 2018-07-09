package com.expedia.database;

import java.util.List;

/**
 * Populate this interface as needed.
 */
public interface DataAccessLayer {
	void signUp(String username, String password);

	// TODO Replace 'Object' with Airline/Hotel/Account, etc
	void populateMetaData(List<Object> airlines);
}
