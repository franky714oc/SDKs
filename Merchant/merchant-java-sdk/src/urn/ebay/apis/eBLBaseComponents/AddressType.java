
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * Person's name associated with this address. 
Character length and limitations: 32 single-byte alphanumeric characters
 */
public class AddressType {

	/**
	 * Person's name associated with this address. 
Character length and limitations: 32 single-byte alphanumeric characters
	 */
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String value) {
		this.Name = value;
	}

	/**
	 * First street address. 
Character length and limitations: 300 single-byte alphanumeric characters
	 */
	private String Street1;
	public String getStreet1() {
		return Street1;
	}
	public void setStreet1(String value) {
		this.Street1 = value;
	}

	/**
	 * Second street address. 
Character length and limitations: 300 single-byte alphanumeric characters
	 */
	private String Street2;
	public String getStreet2() {
		return Street2;
	}
	public void setStreet2(String value) {
		this.Street2 = value;
	}

	/**
	 * Name of city. 
Character length and limitations: 120 single-byte alphanumeric characters	 */
	private String CityName;
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String value) {
		this.CityName = value;
	}

	/**
	 * State or province. 
Character length and limitations: 120 single-byte alphanumeric characters
	 * For Canada and the USA, StateOrProvince must be the standard 2-character abbreviation of a state or province.
	 * Canadian Provinces
	 * Alberta
	 * AB 
	 * British_Columbia
	 * BC
	 * Manitoba
	 * MB
	 * New_Brunswick
	 * NB
	 * Newfoundland
	 * NF
	 * Northwest_Territories
	 * NT
	 * Nova_Scotia
	 * NS 
	 * Nunavut
	 * NU
	 * Ontario
	 * ON
	 * Prince_Edward_Island
	 * PE
	 * Quebec
	 * QC
	 * Saskatchewan
	 * SK
	 * Yukon
	 * YK
	 * United States
	 * Alabama
	 * AL 
	 * Alaska
	 * AK
	 * American_Samoa
	 * AS
	 * Arizona
	 * AZ
	 * Arkansas
	 * AR
	 * California
	 * CA
	 * Colorado
	 * CO
	 * Connecticut
	 * CT
	 * Delaware
	 * DE
	 * District_Of_Columbia
	 * DC
	 * Federated_States_Of_Micronesia
	 * FM
	 * Florida
	 * FL
	 * Georgia
	 * GA
	 * Guam
	 * GU
	 * Hawaii
	 * HI
	 * Idaho
	 * ID 
	 * Illinois
	 * IL
	 * Indiana
	 * IN
	 * Iowa
	 * IA
	 * Kansas
	 * KS
	 * Kentucky
	 * KY
	 * Louisiana
	 * LA
	 * Maine
	 * ME
	 * Marshall_Islands
	 * MH
	 * Maryland
	 * MD
	 * Massachusetts
	 * MA
	 * Michigan
	 * MI
	 * Minnesota
	 * MN
	 * Mississippi
	 * MS
	 * Missouri
	 * MO
	 * Montana
	 * MT
	 * Nebraska
	 * NE
	 * Nevada
	 * NV
	 * New_Hampshire
	 * NH
	 * New_Jersey
	 * NJ
	 * New_Mexico
	 * NM
	 * New_York
	 * NY
	 * North_Carolina
	 * NC
	 * North_Dakota
	 * ND
	 * Northern_Mariana_Islands
	 * MP
	 * Ohio
	 * OH 
	 * Oklahoma
	 * OK
	 * Oregon
	 * OR
	 * Palau
	 * PW
	 * Pennsylvania
	 * PA
	 * Puerto_Rico
	 * PR
	 * Rhode_Island
	 * RI
	 * South_Carolina
	 * SC
	 * South_Dakota
	 * SD
	 * Tennessee
	 * TN 
	 * Texas
	 * TX
	 * Utah
	 * UT
	 * Vermont
	 * VT
	 * Virgin_Islands
	 * VI
	 * Virginia
	 * VA
	 * Washington
	 * WA
	 * West_Virginia
	 * WV
	 * Wisconsin
	 * WI
	 * Wyoming
	 * WY
	 * Armed_Forces_Americas
	 * AA
	 * Armed_Forces
	 * AE
	 * Armed_Forces_Pacific
	 * AP
	 */
	private String StateOrProvince;
	public String getStateOrProvince() {
		return StateOrProvince;
	}
	public void setStateOrProvince(String value) {
		this.StateOrProvince = value;
	}

	/**
	 * ISO 3166 standard country code
	 * Character limit: Two single-byte characters. 	 */
	private CountryCodeType Country;
	public CountryCodeType getCountry() {
		return Country;
	}
	public void setCountry(CountryCodeType value) {
		this.Country = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 * This element should only be used in response elements and typically
	 * should not be used in creating request messages which specify the 
	 * name of a country using the Country element (which refers to a
	 * 2-letter country code).      
	 */
	private String CountryName;
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String value) {
		this.CountryName = value;
	}

	/**
	 * Telephone number associated with this address	 */
	private String Phone;
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String value) {
		this.Phone = value;
	}

	/**
	 */
	private String PostalCode;
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String value) {
		this.PostalCode = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile, or UpdateRecurringPaymentsProfile.
	 */
	private String AddressID;
	public String getAddressID() {
		return AddressID;
	}
	public void setAddressID(String value) {
		this.AddressID = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 */
	private AddressOwnerCodeType AddressOwner;
	public AddressOwnerCodeType getAddressOwner() {
		return AddressOwner;
	}
	public void setAddressOwner(AddressOwnerCodeType value) {
		this.AddressOwner = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 */
	private String ExternalAddressID;
	public String getExternalAddressID() {
		return ExternalAddressID;
	}
	public void setExternalAddressID(String value) {
		this.ExternalAddressID = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 * Only applicable to SellerPaymentAddress today. Seller's international name that is associated with the payment address. 
	 */
	private String InternationalName;
	public String getInternationalName() {
		return InternationalName;
	}
	public void setInternationalName(String value) {
		this.InternationalName = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 * Only applicable to SellerPaymentAddress today. International state and city for the seller's payment address. 
	 */
	private String InternationalStateAndCity;
	public String getInternationalStateAndCity() {
		return InternationalStateAndCity;
	}
	public void setInternationalStateAndCity(String value) {
		this.InternationalStateAndCity = value;
	}

	/**
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 * Only applicable to SellerPaymentAddress today. Seller's international street address that is associated with the payment address.
	 */
	private String InternationalStreet;
	public String getInternationalStreet() {
		return InternationalStreet;
	}
	public void setInternationalStreet(String value) {
		this.InternationalStreet = value;
	}

	/**
	 * Status of the address on file with PayPal.
	 * IMPORTANT: Do not set this element for SetExpressCheckout, DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile or UpdateRecurringPaymentsProfile.
	 */
	private AddressStatusCodeType AddressStatus;
	public AddressStatusCodeType getAddressStatus() {
		return AddressStatus;
	}
	public void setAddressStatus(AddressStatusCodeType value) {
		this.AddressStatus = value;
	}


	public AddressType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( Name != null ) {
			sb.append("<ebl:Name>").append(Name);
			sb.append("</ebl:Name>");
		}
		if( Street1 != null ) {
			sb.append("<ebl:Street1>").append(Street1);
			sb.append("</ebl:Street1>");
		}
		if( Street2 != null ) {
			sb.append("<ebl:Street2>").append(Street2);
			sb.append("</ebl:Street2>");
		}
		if( CityName != null ) {
			sb.append("<ebl:CityName>").append(CityName);
			sb.append("</ebl:CityName>");
		}
		if( StateOrProvince != null ) {
			sb.append("<ebl:StateOrProvince>").append(StateOrProvince);
			sb.append("</ebl:StateOrProvince>");
		}
		if( Country != null ) {
			sb.append("<ebl:Country>").append( Country.getValue());
			sb.append("</ebl:Country>");
		}
		if( CountryName != null ) {
			sb.append("<ebl:CountryName>").append(CountryName);
			sb.append("</ebl:CountryName>");
		}
		if( Phone != null ) {
			sb.append("<ebl:Phone>").append(Phone);
			sb.append("</ebl:Phone>");
		}
		if( PostalCode != null ) {
			sb.append("<ebl:PostalCode>").append(PostalCode);
			sb.append("</ebl:PostalCode>");
		}
		if( AddressID != null ) {
			sb.append("<ebl:AddressID>").append(AddressID);
			sb.append("</ebl:AddressID>");
		}
		if( AddressOwner != null ) {
			sb.append("<ebl:AddressOwner>").append( AddressOwner.getValue());
			sb.append("</ebl:AddressOwner>");
		}
		if( ExternalAddressID != null ) {
			sb.append("<ebl:ExternalAddressID>").append(ExternalAddressID);
			sb.append("</ebl:ExternalAddressID>");
		}
		if( InternationalName != null ) {
			sb.append("<ebl:InternationalName>").append(InternationalName);
			sb.append("</ebl:InternationalName>");
		}
		if( InternationalStateAndCity != null ) {
			sb.append("<ebl:InternationalStateAndCity>").append(InternationalStateAndCity);
			sb.append("</ebl:InternationalStateAndCity>");
		}
		if( InternationalStreet != null ) {
			sb.append("<ebl:InternationalStreet>").append(InternationalStreet);
			sb.append("</ebl:InternationalStreet>");
		}
		if( AddressStatus != null ) {
			sb.append("<ebl:AddressStatus>").append( AddressStatus.getValue());
			sb.append("</ebl:AddressStatus>");
		}
		return sb.toString();
	}

	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
		 } else {
				return false;
		 } 
	 } 
	 private String convertToXML(Node n){ 
		 String name = n.getNodeName();
		 short type = n.getNodeType();
		 if (Node.CDATA_SECTION_NODE == type) {
			  return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		 } 
		 if (name.startsWith("#")) {
			  return "";
		} 
		 StringBuffer sb = new StringBuffer();
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
		  boolean hasValidChildren = false;
		  for (int i = 0; i < children.getLength(); i++) { 
		    String childToString = convertToXML(children.item(i));
		    if (!"".equals(childToString)) {
		      sb.append(childToString); 
		      hasValidChildren = true; 
		    } 
		  } 
		  if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) { 
		    sb.append(textContent); 
		 }
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public AddressType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Name").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Name").item(0))){ 
		 this.Name =(String)document.getElementsByTagName("Name").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Street1").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Street1").item(0))){ 
		 this.Street1 =(String)document.getElementsByTagName("Street1").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Street2").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Street2").item(0))){ 
		 this.Street2 =(String)document.getElementsByTagName("Street2").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("CityName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CityName").item(0))){ 
		 this.CityName =(String)document.getElementsByTagName("CityName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("StateOrProvince").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("StateOrProvince").item(0))){ 
		 this.StateOrProvince =(String)document.getElementsByTagName("StateOrProvince").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Country").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Country").item(0))){ 
		 this.Country = CountryCodeType.fromValue(document.getElementsByTagName("Country").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("CountryName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("CountryName").item(0))){ 
		 this.CountryName =(String)document.getElementsByTagName("CountryName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Phone").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Phone").item(0))){ 
		 this.Phone =(String)document.getElementsByTagName("Phone").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PostalCode").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PostalCode").item(0))){ 
		 this.PostalCode =(String)document.getElementsByTagName("PostalCode").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AddressID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AddressID").item(0))){ 
		 this.AddressID =(String)document.getElementsByTagName("AddressID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AddressOwner").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AddressOwner").item(0))){ 
		 this.AddressOwner = AddressOwnerCodeType.fromValue(document.getElementsByTagName("AddressOwner").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("ExternalAddressID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExternalAddressID").item(0))){ 
		 this.ExternalAddressID =(String)document.getElementsByTagName("ExternalAddressID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InternationalName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InternationalName").item(0))){ 
		 this.InternationalName =(String)document.getElementsByTagName("InternationalName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InternationalStateAndCity").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InternationalStateAndCity").item(0))){ 
		 this.InternationalStateAndCity =(String)document.getElementsByTagName("InternationalStateAndCity").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InternationalStreet").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InternationalStreet").item(0))){ 
		 this.InternationalStreet =(String)document.getElementsByTagName("InternationalStreet").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AddressStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AddressStatus").item(0))){ 
		 this.AddressStatus = AddressStatusCodeType.fromValue(document.getElementsByTagName("AddressStatus").item(0).getTextContent());

}
	}
	}
}
