package in.som.web.webapp1;

public class UserValidation {

	public boolean validate(String user, String pass)
	{
		if(user.equals("Spidy") && pass.equals("1234"))
			return true;
		return false;
	}
}
