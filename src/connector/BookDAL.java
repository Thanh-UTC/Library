package connector;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import object.Book;



/**
 * @author hexagon
 *	Date 05/23/2018
 * 	Version 0.1.1
 * 
 * class nay dung de xu ly du lieu cho doi tuong Book
 * thuoc tinh la mot arraylist co kieu Book
 */
public class BookDAL {
	
	private static BookDAL instance;
	private BookDAL() {}
	
	public static BookDAL getInstance() {
		if(instance == null) {
			instance = new BookDAL();
		}
		return instance;
	}
	/*
	 * Query
	 */
	
	private static String GET_ALL_BOOK = "Select * from tSach";
	/**
	 * Attributes
	 */
	private ArrayList<Book> listBook;
	private Connection connector;
	/**
	 * @return the listBook
	 */
	public ArrayList<Book> getListBook() {
		return listBook;
	}
		
	/**
	 * Methods
	 */
	
	/*
	 * Getter and setter
	 */
	public void setListBook(ArrayList<Book> listBook) {
		this.listBook = listBook;
	}
	
	/*
	 * Get all data about book in database
	 */
	public ArrayList<Book> getAllData(){
		
		try {
			connector = SQLDBConnector.getConnection();
			PreparedStatement getAllBook = connector.prepareStatement(GET_ALL_BOOK);
			ResultSet rs = getAllBook.executeQuery();
			if(rs!= null) {
				while(rs.next()) {
					Book item = new Book();
					item.setStrBookID(rs.getString("MaSach"));
					item.setStrBookName(rs.getString("TenSach"));
					item.setStrBookTypeID(rs.getString("MaLoai"));
					item.setStrBookLanguageID(rs.getString("MaNgonNgu"));
					item.setStrBookPublisherID(rs.getString("MaNXB"));
					item.setStrBookAuthor(rs.getString("TacGia"));
					item.setStrBookPublishYear(rs.getString("NamXB"));
					item.setStrBookRepublishTimes(rs.getString("LanXB"));
					item.setStrBookDescription(rs.getString("GIoiThieu"));
					item.setStrBookPages(rs.getString("TongSoTrang"));
					item.setStrBookPart(rs.getString("Tap"));
					item.setStrBookTotalPart(rs.getString("TongSoTap"));
					item.setfBookPrice(rs.getFloat("GiaTriSach"));
					item.setStrBookImage(rs.getString("FileAnh"));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
