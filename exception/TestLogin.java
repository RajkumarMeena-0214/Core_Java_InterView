package com.exception;

public class TestLogin {
	public void login(String userName, String pass) throws LoginExceptionn {
		String currectUN = "lokesh";
		String currectP = "1122";

		if (!currectUN.equals(userName)) {
			throw new LoginExceptionn("invalid User");
		}
		if (!currectP.equals(pass)) {
			throw new LoginExceptionn("invalid Pass");
		}
	}

	public static void main(String[] args) {
		TestLogin l = new TestLogin();
		try {
			l.login("abc", "1122");
		} catch (LoginExceptionn e) {
			System.out.println(e.getMessage());
		}
	}
}
