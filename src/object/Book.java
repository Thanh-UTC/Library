package object;

/*
 * Date 05/21/2018
 * @author Hexagon
 * 
 * Version 0.1.1
 * 
 * 
 */


public class Book {
	private String strBookID;
	private String strBookName;
	private String strBookTypeID;
	private String strBookLanguageID;
	private String strBookPublisherID;
	private String strBookAuthor;
	private String strBookPublishYear;
	private String strBookRepublishTimes;
	private String strBookDescription;
	private String strBookPages;
	private String strBookPart;
	private String strBookTotalPart;
	private float fBookPrice;
	private String strBookImage;
	
	public Book() {
		
		
	}
	public Book(String strBookID, String strBookName, String strBookTypeID, String strBookLanguageID,
			String strBookPublisherID, String strBookAuthor, String strBookPublishYear, String strBookRepublishTimes,
			String strBookDescription, String strBookPages, String strBookPart, String strBookTotalPart,
			float fBookPrice, String strBookImage) {
		super();
		this.strBookID = strBookID;
		this.strBookName = strBookName;
		this.strBookTypeID = strBookTypeID;
		this.strBookLanguageID = strBookLanguageID;
		this.strBookPublisherID = strBookPublisherID;
		this.strBookAuthor = strBookAuthor;
		this.strBookPublishYear = strBookPublishYear;
		this.strBookRepublishTimes = strBookRepublishTimes;
		this.strBookDescription = strBookDescription;
		this.strBookPages = strBookPages;
		this.strBookPart = strBookPart;
		this.strBookTotalPart = strBookTotalPart;
		this.fBookPrice = fBookPrice;
		this.strBookImage = strBookImage;
	}
	public String getStrBookID() {
		return strBookID;
	}
	public void setStrBookID(String strBookID) {
		this.strBookID = strBookID;
	}
	public String getStrBookName() {
		return strBookName;
	}
	public void setStrBookName(String strBookName) {
		this.strBookName = strBookName;
	}
	public String getStrBookTypeID() {
		return strBookTypeID;
	}
	public void setStrBookTypeID(String strBookTypeID) {
		this.strBookTypeID = strBookTypeID;
	}
	public String getStrBookLanguageID() {
		return strBookLanguageID;
	}
	public void setStrBookLanguageID(String strBookLanguageID) {
		this.strBookLanguageID = strBookLanguageID;
	}
	public String getStrBookPublisherID() {
		return strBookPublisherID;
	}
	public void setStrBookPublisherID(String strBookPublisherID) {
		this.strBookPublisherID = strBookPublisherID;
	}
	public String getStrBookAuthor() {
		return strBookAuthor;
	}
	public void setStrBookAuthor(String strBookAuthor) {
		this.strBookAuthor = strBookAuthor;
	}
	public String getStrBookPublishYear() {
		return strBookPublishYear;
	}
	public void setStrBookPublishYear(String strBookPublishYear) {
		this.strBookPublishYear = strBookPublishYear;
	}
	public String getStrBookRepublishTimes() {
		return strBookRepublishTimes;
	}
	public void setStrBookRepublishTimes(String strBookRepublishTimes) {
		this.strBookRepublishTimes = strBookRepublishTimes;
	}
	public String getStrBookDescription() {
		return strBookDescription;
	}
	public void setStrBookDescription(String strBookDescription) {
		this.strBookDescription = strBookDescription;
	}
	public String getStrBookPages() {
		return strBookPages;
	}
	public void setStrBookPages(String strBookPages) {
		this.strBookPages = strBookPages;
	}
	public String getStrBookPart() {
		return strBookPart;
	}
	public void setStrBookPart(String strBookPart) {
		this.strBookPart = strBookPart;
	}
	public String getStrBookTotalPart() {
		return strBookTotalPart;
	}
	public void setStrBookTotalPart(String strBookTotalPart) {
		this.strBookTotalPart = strBookTotalPart;
	}
	public float getfBookPrice() {
		return fBookPrice;
	}
	public void setfBookPrice(float fBookPrice) {
		this.fBookPrice = fBookPrice;
	}
	public String getStrBookImage() {
		return strBookImage;
	}
	public void setStrBookImage(String strBookImage) {
		this.strBookImage = strBookImage;
	}
	
	
	
}
