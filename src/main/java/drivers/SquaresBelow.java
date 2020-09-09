package drivers;

import apps.Database;
import types.Response;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class SquaresBelow implements Driver
{
	static final Pattern pattern = Pattern.compile(
			"SQUARES BELOW\s+(\\d\s+AS\s+[a-z],\s+[a-z]|\\d\s+AS\s+[a-z]|\\d)", //Does the string abide by SQUARES BELOW #, SQUARES BELOW # AS char, or SQUARES BELOW # AS char, char
			Pattern.CASE_INSENSITIVE
	);
	
	@Override
	public Response execute (String query, Database db)
	{
		// TODO: For Module 0, implement the driver.
		Matcher matcher = pattern.matcher(query.strip());
		if (!matcher.matches()) return null;
		
		System.out.println(matcher.group(1));
		
		
		return null;
	}
}
