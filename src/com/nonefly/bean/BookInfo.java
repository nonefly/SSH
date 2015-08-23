package com.nonefly.bean;


public class BookInfo implements java.io.Serializable {

	// Fields

	private Integer bookId;
	private String detail;
	private String bookAuthor;
	private String bookImage;
	private Integer bookEdition;
	private Integer bookPageNum;
	private String isbn;
	private Integer bookSize;
	private Integer bookWordNum;
	private Float bookOrigPrice;
	private String bookContext;
	private String bookRecommend;
	private Integer bookNum;
	private Float bookDiscount;

	// Constructors

	/** default constructor */
	public BookInfo() {
	}

	/** full constructor */
	public BookInfo(String detail, String bookAuthor, String bookImage,
			Integer bookEdition, Integer bookPageNum, String isbn,
			Integer bookSize, Integer bookWordNum, Float bookOrigPrice,
			String bookContext, String bookRecommend, Integer bookNum,
			Float bookDiscount) {
		this.detail = detail;
		this.bookAuthor = bookAuthor;
		this.bookImage = bookImage;
		this.bookEdition = bookEdition;
		this.bookPageNum = bookPageNum;
		this.isbn = isbn;
		this.bookSize = bookSize;
		this.bookWordNum = bookWordNum;
		this.bookOrigPrice = bookOrigPrice;
		this.bookContext = bookContext;
		this.bookRecommend = bookRecommend;
		this.bookNum = bookNum;
		this.bookDiscount = bookDiscount;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookImage() {
		return this.bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public Integer getBookEdition() {
		return this.bookEdition;
	}

	public void setBookEdition(Integer bookEdition) {
		this.bookEdition = bookEdition;
	}

	public Integer getBookPageNum() {
		return this.bookPageNum;
	}

	public void setBookPageNum(Integer bookPageNum) {
		this.bookPageNum = bookPageNum;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getBookSize() {
		return this.bookSize;
	}

	public void setBookSize(Integer bookSize) {
		this.bookSize = bookSize;
	}

	public Integer getBookWordNum() {
		return this.bookWordNum;
	}

	public void setBookWordNum(Integer bookWordNum) {
		this.bookWordNum = bookWordNum;
	}

	public Float getBookOrigPrice() {
		return this.bookOrigPrice;
	}

	public void setBookOrigPrice(Float bookOrigPrice) {
		this.bookOrigPrice = bookOrigPrice;
	}

	public String getBookContext() {
		return this.bookContext;
	}

	public void setBookContext(String bookContext) {
		this.bookContext = bookContext;
	}

	public String getBookRecommend() {
		return this.bookRecommend;
	}

	public void setBookRecommend(String bookRecommend) {
		this.bookRecommend = bookRecommend;
	}

	public Integer getBookNum() {
		return this.bookNum;
	}

	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}

	public Float getBookDiscount() {
		return this.bookDiscount;
	}

	public void setBookDiscount(Float bookDiscount) {
		this.bookDiscount = bookDiscount;
	}

}