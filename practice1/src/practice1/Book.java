package practice1;

public class Book {

	public int id = 0;
	public String title;
	public String author;
	public String publicationYear;
	public String[][] bookList;
	
	public int AddBook(int id, String title, String author, String publicationYear) {
		if (bookList[id][0] != null) {
			bookList[id][0] = title;
			bookList[id][1] = author;
			bookList[id][2] = publicationYear;
			id += 1;
			return 1;
		}
		else {
			throw new IllegalArgumentException("ID("+id+") 는 이미 존재합니다.");
		}
	}
	
	public String[] SearchBook(int id) {
		if (bookList[id][0] != null) {
			return bookList[id];
		}
		else {
			throw new IllegalArgumentException("검색된 도서가 없습니다.");
		}
	}
	
	public String[] RemoveBook() {
		if (bookList[id][0] != null) {
			String[] bookInfo = bookList[id];
			bookList[id][0] = null;
			bookList[id][1] = null;
			bookList[id][2] = null;
			return bookInfo;
		}
		else {
			throw new IllegalArgumentException("해당 ID("+id+") 의 도서를 찾을 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
