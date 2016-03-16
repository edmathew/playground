package pt.ejpm.services.helloWorld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(
        name = "HelloWorld",
        targetNamespace = "pt.ejpm.services.helloWorld")

@SOAPBinding(
        style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface HelloWorldService {

    @WebMethod(operationName = "sayHello")
    public String sayHello();

}
