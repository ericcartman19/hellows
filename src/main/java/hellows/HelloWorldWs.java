package hellows;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWs {

	@WebMethod
	public String sayHello() {
		return "Browson in da house babe!";
	}

}
