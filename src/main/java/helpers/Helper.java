package helpers;

import javax.servlet.http.HttpServletRequest;

public class Helper {
	public static String getAction(HttpServletRequest request) {
		String act[] = request.getRequestURL().toString().split("/");
		System.out.println(act[act.length - 1]);
		return act[act.length - 1];
	}

	public static boolean isPasswordCorrect(String enteredPasswordHash, String databasePasswordHash) {
		if (enteredPasswordHash.equals(databasePasswordHash)) {
			return true;
		}
		return false;
	}
}
