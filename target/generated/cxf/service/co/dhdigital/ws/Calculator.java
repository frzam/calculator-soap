package service.co.dhdigital.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2020-09-15T12:41:35.742+05:30
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://ws.dhdigital.co.service", name = "Calculator")
@XmlSeeAlso({service.co.dhdigital.ws.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Calculator {

    @WebMethod
    @WebResult(name = "CalculatorResponse", targetNamespace = "http://ws.dhdigital.co.service/types", partName = "response")
    public service.co.dhdigital.ws.types.CalculatorResponse calculate(
        @WebParam(partName = "request", name = "CalculatorRequest", targetNamespace = "http://ws.dhdigital.co.service/types")
        service.co.dhdigital.ws.types.CalculatorRequest request
    ) throws ErrorMessage;
}
