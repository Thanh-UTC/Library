package object;

/**
 * @author hexagon
 *	Date 05/23/2018
 *	version 0.1.1
 * class nay luu tru thong tin the doc sach thu vien
 */
public class ReaderCard {
	private String strReaderCardID;
	private String strReaderID;
	private String strStartDate;
	private String strEndDate;
	
	/** 
	 * Constructor
	 */
	
	public ReaderCard() {
		
	}
	/**
	 * @param strReaderCardID
	 * @param strReaderID
	 * @param strStartDate
	 * @param strEndDate
	 */
	public ReaderCard(String strReaderCardID, String strReaderID, String strStartDate, String strEndDate) {
		super();
		this.strReaderCardID = strReaderCardID;
		this.strReaderID = strReaderID;
		this.strStartDate = strStartDate;
		this.strEndDate = strEndDate;
	}
	/**
	 * @return the strReaderCardID
	 */
	public String getStrReaderCardID() {
		return strReaderCardID;
	}
	/**
	 * @param strReaderCardID the strReaderCardID to set
	 */
	public void setStrReaderCardID(String strReaderCardID) {
		this.strReaderCardID = strReaderCardID;
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
	 * @return the strStartDate
	 */
	public String getStrStartDate() {
		return strStartDate;
	}
	/**
	 * @param strStartDate the strStartDate to set
	 */
	public void setStrStartDate(String strStartDate) {
		this.strStartDate = strStartDate;
	}
	/**
	 * @return the strEndDate
	 */
	public String getStrEndDate() {
		return strEndDate;
	}
	/**
	 * @param strEndDate the strEndDate to set
	 */
	public void setStrEndDate(String strEndDate) {
		this.strEndDate = strEndDate;
	}
	
}
