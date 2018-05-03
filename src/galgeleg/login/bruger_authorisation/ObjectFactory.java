
package galgeleg.login.bruger_authorisation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the galgeleg.login.bruger_authorisation package.
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

    private final static QName _ÆndrAdgangskodeResponse_QNAME = new QName("http://soap.transport.brugerautorisation/", "ændrAdgangskodeResponse");
    private final static QName _HentBrugerResponse_QNAME = new QName("http://soap.transport.brugerautorisation/", "hentBrugerResponse");
    private final static QName _SendEmail_QNAME = new QName("http://soap.transport.brugerautorisation/", "sendEmail");
    private final static QName _SendGlemtAdgangskodeEmail_QNAME = new QName("http://soap.transport.brugerautorisation/", "sendGlemtAdgangskodeEmail");
    private final static QName _ÆndrAdgangskode_QNAME = new QName("http://soap.transport.brugerautorisation/", "ændrAdgangskode");
    private final static QName _GetEkstraFeltResponse_QNAME = new QName("http://soap.transport.brugerautorisation/", "getEkstraFeltResponse");
    private final static QName _HentBruger_QNAME = new QName("http://soap.transport.brugerautorisation/", "hentBruger");
    private final static QName _SendEmailResponse_QNAME = new QName("http://soap.transport.brugerautorisation/", "sendEmailResponse");
    private final static QName _SendGlemtAdgangskodeEmailResponse_QNAME = new QName("http://soap.transport.brugerautorisation/", "sendGlemtAdgangskodeEmailResponse");
    private final static QName _SetEkstraFeltResponse_QNAME = new QName("http://soap.transport.brugerautorisation/", "setEkstraFeltResponse");
    private final static QName _GetEkstraFelt_QNAME = new QName("http://soap.transport.brugerautorisation/", "getEkstraFelt");
    private final static QName _SetEkstraFelt_QNAME = new QName("http://soap.transport.brugerautorisation/", "setEkstraFelt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: galgeleg.login.bruger_authorisation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bruger }
     * 
     */
    public Bruger createBruger() {
        return new Bruger();
    }

    /**
     * Create an instance of {@link Bruger.EkstraFelter }
     * 
     */
    public Bruger.EkstraFelter createBrugerEkstraFelter() {
        return new Bruger.EkstraFelter();
    }

    /**
     * Create an instance of {@link SendGlemtAdgangskodeEmail }
     * 
     */
    public SendGlemtAdgangskodeEmail createSendGlemtAdgangskodeEmail() {
        return new SendGlemtAdgangskodeEmail();
    }

    /**
     * Create an instance of {@link �ndrAdgangskode }
     * 
     */
    public ÆndrAdgangskode createÆndrAdgangskode() {
        return new ÆndrAdgangskode();
    }

    /**
     * Create an instance of {@link HentBrugerResponse }
     * 
     */
    public HentBrugerResponse createHentBrugerResponse() {
        return new HentBrugerResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link �ndrAdgangskodeResponse }
     * 
     */
    public ÆndrAdgangskodeResponse createÆndrAdgangskodeResponse() {
        return new ÆndrAdgangskodeResponse();
    }

    /**
     * Create an instance of {@link HentBruger }
     * 
     */
    public HentBruger createHentBruger() {
        return new HentBruger();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link GetEkstraFeltResponse }
     * 
     */
    public GetEkstraFeltResponse createGetEkstraFeltResponse() {
        return new GetEkstraFeltResponse();
    }

    /**
     * Create an instance of {@link SendGlemtAdgangskodeEmailResponse }
     * 
     */
    public SendGlemtAdgangskodeEmailResponse createSendGlemtAdgangskodeEmailResponse() {
        return new SendGlemtAdgangskodeEmailResponse();
    }

    /**
     * Create an instance of {@link GetEkstraFelt }
     * 
     */
    public GetEkstraFelt createGetEkstraFelt() {
        return new GetEkstraFelt();
    }

    /**
     * Create an instance of {@link SetEkstraFelt }
     * 
     */
    public SetEkstraFelt createSetEkstraFelt() {
        return new SetEkstraFelt();
    }

    /**
     * Create an instance of {@link SetEkstraFeltResponse }
     * 
     */
    public SetEkstraFeltResponse createSetEkstraFeltResponse() {
        return new SetEkstraFeltResponse();
    }

    /**
     * Create an instance of {@link Bruger.EkstraFelter.Entry }
     * 
     */
    public Bruger.EkstraFelter.Entry createBrugerEkstraFelterEntry() {
        return new Bruger.EkstraFelter.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �ndrAdgangskodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "ændrAdgangskodeResponse")
    public JAXBElement<ÆndrAdgangskodeResponse> createÆndrAdgangskodeResponse(ÆndrAdgangskodeResponse value) {
        return new JAXBElement<ÆndrAdgangskodeResponse>(_ÆndrAdgangskodeResponse_QNAME, ÆndrAdgangskodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HentBrugerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "hentBrugerResponse")
    public JAXBElement<HentBrugerResponse> createHentBrugerResponse(HentBrugerResponse value) {
        return new JAXBElement<HentBrugerResponse>(_HentBrugerResponse_QNAME, HentBrugerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendGlemtAdgangskodeEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "sendGlemtAdgangskodeEmail")
    public JAXBElement<SendGlemtAdgangskodeEmail> createSendGlemtAdgangskodeEmail(SendGlemtAdgangskodeEmail value) {
        return new JAXBElement<SendGlemtAdgangskodeEmail>(_SendGlemtAdgangskodeEmail_QNAME, SendGlemtAdgangskodeEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link �ndrAdgangskode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "ÆndrAdgangskode")
    public JAXBElement<ÆndrAdgangskode> createÆndrAdgangskode(ÆndrAdgangskode value) {
        return new JAXBElement<ÆndrAdgangskode>(_ÆndrAdgangskode_QNAME, ÆndrAdgangskode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEkstraFeltResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "getEkstraFeltResponse")
    public JAXBElement<GetEkstraFeltResponse> createGetEkstraFeltResponse(GetEkstraFeltResponse value) {
        return new JAXBElement<GetEkstraFeltResponse>(_GetEkstraFeltResponse_QNAME, GetEkstraFeltResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HentBruger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "hentBruger")
    public JAXBElement<HentBruger> createHentBruger(HentBruger value) {
        return new JAXBElement<HentBruger>(_HentBruger_QNAME, HentBruger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendGlemtAdgangskodeEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "sendGlemtAdgangskodeEmailResponse")
    public JAXBElement<SendGlemtAdgangskodeEmailResponse> createSendGlemtAdgangskodeEmailResponse(SendGlemtAdgangskodeEmailResponse value) {
        return new JAXBElement<SendGlemtAdgangskodeEmailResponse>(_SendGlemtAdgangskodeEmailResponse_QNAME, SendGlemtAdgangskodeEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEkstraFeltResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "setEkstraFeltResponse")
    public JAXBElement<SetEkstraFeltResponse> createSetEkstraFeltResponse(SetEkstraFeltResponse value) {
        return new JAXBElement<SetEkstraFeltResponse>(_SetEkstraFeltResponse_QNAME, SetEkstraFeltResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEkstraFelt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "getEkstraFelt")
    public JAXBElement<GetEkstraFelt> createGetEkstraFelt(GetEkstraFelt value) {
        return new JAXBElement<GetEkstraFelt>(_GetEkstraFelt_QNAME, GetEkstraFelt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEkstraFelt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.transport.brugerautorisation/", name = "setEkstraFelt")
    public JAXBElement<SetEkstraFelt> createSetEkstraFelt(SetEkstraFelt value) {
        return new JAXBElement<SetEkstraFelt>(_SetEkstraFelt_QNAME, SetEkstraFelt.class, null, value);
    }

}
