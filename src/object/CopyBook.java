package object;

/**
 * @author hexagon
 *	Date 05/23/2018
 *	version 0.1.1
 *	class nay mo ta doi tuong la cac ban copy cua mot cuon sach nao do.
 */
public class CopyBook {
	private String strCopyID;
	private String strBookID;
	private Boolean isTrue;
	private String strBookStatus;
	private String strBookPosition;
	
	/**
	 * Constructor
	 */
	public CopyBook() {
		
	}
	
	/**
	 * @param strCopyID
	 * @param strBookID
	 * @param isTrue
	 * @param strBookStatus
	 * @param strBookPosition
	 */
	public CopyBook(String strCopyID, String strBookID, Boolean isTrue, String strBookStatus, String strBookPosition) {
		super();
		this.strCopyID = strCopyID;
		this.strBookID = strBookID;
		this.isTrue = isTrue;
		this.strBookStatus = strBookStatus;
		this.strBookPosition = strBookPosition;
	}
	
	/**
	 * @return the strCopyID
	 */
	public String getStrCopyID() {
		return strCopyID;
	}
	
	/**
	 * @param strCopyID the strCopyID to set
	 */
	public void setStrCopyID(String strCopyID) {
		this.strCopyID = strCopyID;
	}
	
	/**
	 * @return the strBookID
	 */
	public String getStrBookID() {
		return strBookID;
	}
	
	/**
	 * @param strBookID the strBookID to set
	 */
	public void setStrBookID(String strBookID) {
		this.strBookID = strBookID;
	}
	
	/**
	 * @return the isTrue
	 */
	public Boolean getIsTrue() {
		return isTrue;
	}
	
	/**
	 * @param isTrue the isTrue to set
	 */
	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}
	
	/**
	 * @return the strBookStatus
	 */
	public String getStrBookStatus() {
		return strBookStatus;
	}
	
	/**
	 * @param strBookStatus the strBookStatus to set
	 */
	public void setStrBookStatus(String strBookStatus) {
		this.strBookStatus = strBookStatus;
	}
	
	/**
	 * @return the strBookPosition
	 */
	public String getStrBookPosition() {
		return strBookPosition;
	}
	
	/**
	 * @param strBookPosition the strBookPosition to set
	 */
	public void setStrBookPosition(String strBookPosition) {
		this.strBookPosition = strBookPosition;
	}
	
	
}
