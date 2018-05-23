/**
 * 
 */
package object;

/**
 * @author hexagon
 *	
 * Date 05/21/2018
 * 
 * Version 0.1.1
 */
public class BookType {
	private String strBookTypeID;
	private String strBookTypeName;
	
	public BookType() {
		
	}
	
	public BookType(String strBookTypeID, String strBookTypeName) {
		super();
		this.strBookTypeID = strBookTypeID;
		this.strBookTypeName = strBookTypeName;
	}

	public String getStrBookTypeID() {
		return strBookTypeID;
	}

	public void setStrBookTypeID(String strBookTypeID) {
		this.strBookTypeID = strBookTypeID;
	}

	public String getStrBookTypeName() {
		return strBookTypeName;
	}

	public void setStrBookTypeName(String strBookTypeName) {
		this.strBookTypeName = strBookTypeName;
	}
	
	
	
}
