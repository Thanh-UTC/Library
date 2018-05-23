/**
 * 
 */
package object;

/**
 * @author Hexagon
 * Date 05/21/2018
 * 
 * Version0.1.1
 */

public class Language {
	private String strLanguageID;
	private String strLanguageName;
	
	public Language() {
		
	}
	
	public Language(String strLanguageID, String strLanguageName) {
		super();
		this.strLanguageID = strLanguageID;
		this.strLanguageName = strLanguageName;
	}
	public String getStrLanguageID() {
		return strLanguageID;
	}
	public void setStrLanguageID(String strLanguageID) {
		this.strLanguageID = strLanguageID;
	}
	public String getStrLanguageName() {
		return strLanguageName;
	}
	public void setStrLanguageName(String strLanguageName) {
		this.strLanguageName = strLanguageName;
	}
	
	
}
