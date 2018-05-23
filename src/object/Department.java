package object;

/**
 * @author hexagon
 * Date 05/23/2018
 * Version 0.1.1
 * class mo ta doi tuong chua danh sach don vi trong truong hoc
 */
public class Department {
	private String strDepartmentID;
	private String strDepartmentName;
	
	/**
	 * Constructor
	 */
	
	public Department() {
		
	}
	/**
	 * @param strDepartmentID
	 * @param strDepartmentName
	 */
	public Department(String strDepartmentID, String strDepartmentName) {
		super();
		this.strDepartmentID = strDepartmentID;
		this.strDepartmentName = strDepartmentName;
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
	 * @return the strDepartmentName
	 */
	public String getStrDepartmentName() {
		return strDepartmentName;
	}
	/**
	 * @param strDepartmentName the strDepartmentName to set
	 */
	public void setStrDepartmentName(String strDepartmentName) {
		this.strDepartmentName = strDepartmentName;
	}
	
	
}
