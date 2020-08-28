package drivers;

import apps.Database;
import types.Response;

/*
 * For Module 0, implement this driver.
 * 
 * Examples:
 * 	SQUARES BELOW 20
 * 	SQUARES BELOW 30 AS a
 * 	SQUARES BELOW 15 AS a, b
 * 
 * Response 1:
 *  success flag
 *  message "There were 5 results."
 * 	result table
 * 		primary integer column "x", integer column "x_squared"
 *		rows [0, 0]; [1, 1]; [2, 4]; [3, 9]; [4, 16]
 *
 * Response 2:
 *  success flag
 *  message "There were 6 results."
 * 	result table
 * 		primary integer column "a", integer column "a_squared"
 *		rows [0, 0]; [1, 1]; [2, 4]; [3, 9]; [4, 16]; [5, 25]
 *
 * Response 3:
 *  success flag
 *  message "There were 4 results."
 * 	result table
 * 		primary integer column "a", integer column "b"
 *		rows [0, 0]; [1, 1]; [2, 4]; [3, 9]
 */
@Deprecated
public class SquaresBelow implements Driver {
	@Override
	public Response execute(String query, Database db) {
		// TODO: For Module 0, implement the driver.
		return null;
	}
}
