package action;

import java.util.List;

import service.BookService;

import com.opensymphony.xwork2.Action;

public class GetBooksAction implements Action{
	private List<String> books;
	

	public List<String> getBooks() {
		return books;
	}


	public void setBooks(List<String> books) {
		this.books = books;
	}


	@Override
	public String execute() throws Exception {
		BookService bookService = new BookService();
		setBooks(bookService.getLeeBooks());
		return SUCCESS;
	}

}
