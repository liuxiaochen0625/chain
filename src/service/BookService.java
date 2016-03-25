package service;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	private static List<String> books;
	static {
		books = new ArrayList<>();
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
	}
	// 业务逻辑方法，该方法返回全部图书
	public List<String> getLeeBooks()
	{
		return books;
	}
	// 业务逻辑方法，向List中添加图书。
	public void addBook(String book)
	{
		books.add(book);
	}
}
