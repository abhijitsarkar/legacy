
package com.github.mkalin.jwsur2.ch5.images.base64.client.generated;

import java.util.List;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SkiImageService", targetNamespace = "http://base64.images.ch5.jwsur2.mkalin.github.com/")
@HandlerChain(file = "SkiImageService_handler.xml")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SkiImageService {


    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImage", targetNamespace = "http://base64.images.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.images.base64.client.generated.GetImage")
    @ResponseWrapper(localName = "getImageResponse", targetNamespace = "http://base64.images.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.images.base64.client.generated.GetImageResponse")
    @Action(input = "http://base64.images.ch5.jwsur2.mkalin.github.com/SkiImageService/getImageRequest", output = "http://base64.images.ch5.jwsur2.mkalin.github.com/SkiImageService/getImageResponse")
    public byte[] getImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<byte[]>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImages", targetNamespace = "http://base64.images.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.images.base64.client.generated.GetImages")
    @ResponseWrapper(localName = "getImagesResponse", targetNamespace = "http://base64.images.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.images.base64.client.generated.GetImagesResponse")
    @Action(input = "http://base64.images.ch5.jwsur2.mkalin.github.com/SkiImageService/getImagesRequest", output = "http://base64.images.ch5.jwsur2.mkalin.github.com/SkiImageService/getImagesResponse")
    public List<byte[]> getImages();

}
