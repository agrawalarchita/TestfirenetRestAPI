package utilities;



public class payload {	
	
	
	public String ROOT_URI = "https://demo.testfire.net/api";	
	
	public String invalidAuthTokenValue = "YW5OdGFYUm86WkdWdGJ6FlNelE9Oj9cNj8/Tj8=";
	
	public String auth = "Authorization";
	
	public String validLogin = "{\r\n"
			+ "  \"username\": \"jsmith\",\r\n"
			+ "  \"password\": \"demo1234\"\r\n"
			+ "}";
	
	public String inValidLogin = "{\r\n"
			+ "  \"username\": \"jsmith123\",\r\n"
			+ "  \"password\": \"demo1234\"\r\n"
			+ "}";;
	
	public String transferFunds = "{\r\n"
			+ "  \"toAccount\": \"800002\",\r\n"
			+ "  \"fromAccount\": \"800003\",\r\n"
			+ "  \"transferAmount\": \"200\"\r\n"
			+ "}";
	
	public String invalidtransferFunds = "{\r\n"
			+ "  \"toAccount\": \"5000\",\r\n"
			+ "  \"fromAccount\": \"800000\",\r\n"
			+ "  \"transferAmount\": \"200\"\r\n"
			+ "}";
	
	

}
