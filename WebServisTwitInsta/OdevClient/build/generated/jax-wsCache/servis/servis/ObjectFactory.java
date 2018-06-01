
package servis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInstaPic_QNAME = new QName("http://servis/", "getInstaPic");
    private final static QName _GetInstaPicResponse_QNAME = new QName("http://servis/", "getInstaPicResponse");
    private final static QName _GetTwitPic_QNAME = new QName("http://servis/", "getTwitPic");
    private final static QName _GetTwitPicResponse_QNAME = new QName("http://servis/", "getTwitPicResponse");
    private final static QName _Hello_QNAME = new QName("http://servis/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://servis/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInstaPic }
     * 
     */
    public GetInstaPic createGetInstaPic() {
        return new GetInstaPic();
    }

    /**
     * Create an instance of {@link GetInstaPicResponse }
     * 
     */
    public GetInstaPicResponse createGetInstaPicResponse() {
        return new GetInstaPicResponse();
    }

    /**
     * Create an instance of {@link GetTwitPic }
     * 
     */
    public GetTwitPic createGetTwitPic() {
        return new GetTwitPic();
    }

    /**
     * Create an instance of {@link GetTwitPicResponse }
     * 
     */
    public GetTwitPicResponse createGetTwitPicResponse() {
        return new GetTwitPicResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstaPic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInstaPic }{@code >}
     */
    @XmlElementDecl(namespace = "http://servis/", name = "getInstaPic")
    public JAXBElement<GetInstaPic> createGetInstaPic(GetInstaPic value) {
        return new JAXBElement<GetInstaPic>(_GetInstaPic_QNAME, GetInstaPic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstaPicResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInstaPicResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servis/", name = "getInstaPicResponse")
    public JAXBElement<GetInstaPicResponse> createGetInstaPicResponse(GetInstaPicResponse value) {
        return new JAXBElement<GetInstaPicResponse>(_GetInstaPicResponse_QNAME, GetInstaPicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwitPic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTwitPic }{@code >}
     */
    @XmlElementDecl(namespace = "http://servis/", name = "getTwitPic")
    public JAXBElement<GetTwitPic> createGetTwitPic(GetTwitPic value) {
        return new JAXBElement<GetTwitPic>(_GetTwitPic_QNAME, GetTwitPic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwitPicResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTwitPicResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servis/", name = "getTwitPicResponse")
    public JAXBElement<GetTwitPicResponse> createGetTwitPicResponse(GetTwitPicResponse value) {
        return new JAXBElement<GetTwitPicResponse>(_GetTwitPicResponse_QNAME, GetTwitPicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://servis/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servis/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
