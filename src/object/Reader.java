package object;


/**
 * @author hexagon
 *	
 * Date 05/23/2018
 * Version 0.1.1
 */
public class Reader {
	private String strReaderID;
	private String strReaderLastName;
	private String strReaderFirstName;
	private String strReaderIDCardNumber;
	private String strDepartmentID;
	private String strBirthday;
	private String strReaderTypeID;
	private String strReaderAddress;
	private String strReaderImage;
	
	
	/**
	 * Constructor
	 */
	public Reader() {
		
	}
	/**
	 * @param strReaderID
	 * @param strReaderLastName
	 * @param strReaderFirstName
	 * @param strReaderIDCardNumber
	 * @param strDepartmentID
	 * @param strBirthday
	 * @param strReaderTypeID
	 * @param strReaderAddress
	 * @param strReaderImage
	 */
	public Reader(String strReaderID, String strReaderLastName, String strReaderFirstName, String strReaderIDCardNumber,
			String strDepartmentID, String strBirthday, String strReaderTypeID, String strReaderAddress,
			String strReaderImage) {
		super();
		this.strReaderID = strReaderID;
		this.strReaderLastName = strReaderLastName;
		this.strReaderFirstName = strReaderFirstName;
		this.strReaderIDCardNumber = strReaderIDCardNumber;
		this.strDepartmentID = strDepartmentID;
		this.strBirthday = strBirthday;
		this.strReaderTypeID = strReaderTypeID;
		this.strReaderAddress = strReaderAddress;
		this.strReaderImage = strReaderImage;
	}
	/**
	 * @return the strReaderID
	 */
	public String getStrReaderID() {
		return strReaderID;
	}
	/**
	 * @param strReaderID the strReaderID to set
	 */
	public void setStrReaderID(String strReaderID) {
		this.strReaderID = strReaderID;
	}
	/**
	 * @return the strReaderLastName
	 */
	public String getStrReaderLastName() {
		return strReaderLastName;
	}
	/**
	 * @param strReaderLastName the strReaderLastName to set
	 */
	public void setStrReaderLastName(String strReaderLastName) {
		this.strReaderLastName = strReaderLastName;
	}
	/**
	 * @return the strReaderFirstName
	 */
	public String getStrReaderFirstName() {
		return strReaderFirstName;
	}
	/**
	 * @param strReaderFirstName the strReaderFirstName to set
	 */
	public void setStrReaderFirstName(String strReaderFirstName) {
		this.strReaderFirstName = strReaderFirstName;
	}
	/**
	 * @return the strReaderIDCardNumber
	 */
	public String getStrReaderIDCardNumber() {
		return strReaderIDCardNumber;
	}
	/**
	 * @param strReaderIDCardNumber the strReaderIDCardNumber to set
	 */
	public void setStrReaderIDCardNumber(String strReaderIDCardNumber) {
		this.strReaderIDCardNumber = strReaderIDCardNumber;
	}
	/**
	 * @return the strDepartmentID
	 */
	public String getStrDepartmentID() {
		return strDepartmentID;
	}
	/**
	 * @param strDepartmentID the strDepartmentID to set
	 */
	public void setStrDepartmentID(String strDepartmentID) {
		this.strDepartmentID = strDepartmentID;
	}
	/**
	 * @return the strBirthday
	 */
	public String getStrBirthday() {
		return strBirthday;
	}
	/**
	 * @param strBirthday the strBirthday to set
	 */
	public void setStrBirthday(String strBirthday) {
		this.strBirthday = strBirthday;
	}
	/**
	 * @return the strReaderTypeID
	 */
	public String getStrReaderTypeID() {
		return strReaderTypeID;
	}
	/**
	 * @param strReaderTypeID the strReaderTypeID to set
	 */
	public void setStrReaderTypeID(String strReaderTypeID) {
		this.strReaderTypeID = strReaderTypeID;
	}
	/**
	 * @return the strReaderAddress
	 */
	public String getStrReaderAddress() {
		return strReaderAddress;
	}
	/**
	 * @param strReaderAddress the strReaderAddress to set
	 */
	public void setStrReaderAddress(String strReaderAddress) {
		this.strReaderAddress = strReaderAddress;
	}
	/**
	 * @return the strReaderImage
	 */
	public String getStrReaderImage() {
		return strReaderImage;
	}
	/**
	 * @param strReaderImage the strReaderImage to set
	 */
	public void setStrReaderImage(String strReaderImage) {
		this.strReaderImage = strReaderImage;
	}
	
	
}
