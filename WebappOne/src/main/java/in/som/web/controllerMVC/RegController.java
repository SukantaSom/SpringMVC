package in.som.web.controllerMVC;

import java.io.PrintWriter;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegController {

	@RequestMapping(value ="/register", method = RequestMethod.GET)
	//@ResponseBody
	public String say()
	{
		
		return "register";
	}
}
