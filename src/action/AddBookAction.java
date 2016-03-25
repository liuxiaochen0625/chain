package action;

import service.BookService;

import com.opensymphony.xwork2.Action;

public class AddBookAction implements Action{
	private String book;
	private String tip;
	
	@Override
	public String execute() throws Exception {
		BookService bookService = new BookService();
		bookService.addBook(book);
		setTip("恭喜你，图书添加成功！");
		return SUCCESS;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
}
