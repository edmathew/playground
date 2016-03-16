package pt.ejpm.services.helloWorld;

import javax.jws.WebService;

@WebService(endpointInterface = "pt.ejpm.services.helloWorld.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHello() {
        return "Hello World";
    }

}
