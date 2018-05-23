package object;

/**
 * @author hexagon
 * Date 05/23/2018
 * Version 0.1.1
 * Class nay mo ta danh muc doi tuong de phan loai danh sach nguoi doc
 */
public class ReaderType {
	private String strReaderTypeID;
	private String strReaderTypeName;
	
	/**
	 * Constructor
	 */
	
	public ReaderType() {
		
	}
	/**
	 * @param strReaderTypeID
	 * @param strReaderTypeName
	 */
	public ReaderType(String strReaderTypeID, String strReaderTypeName) {
		super();
		this.strReaderTypeID = strReaderTypeID;
		this.strReaderTypeName = strReaderTypeName;
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
	 * @return the strReaderTypeName
	 */
	public String getStrReaderTypeName() {
		return strReaderTypeName;
	}
	/**
	 * @param strReaderTypeName the strReaderTypeName to set
	 */
	public void setStrReaderTypeName(String strReaderTypeName) {
		this.strReaderTypeName = strReaderTypeName;
	}
	
	
}
