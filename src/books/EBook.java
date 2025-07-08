package books;

public class EBook extends Book{
	Filetype file_type;

	public EBook(String iSBN, String title, int yearOfPublishing, double price) {
		super(iSBN, title, yearOfPublishing, price);
		this.booktype = BookType.EBOOK;
	}

	public EBook(String iSBN, String title, int yearOfPublishing, double price,Filetype file_type) {
		this(iSBN, title, yearOfPublishing, price);
		this.file_type = file_type;
	}

	@Override
	public void checkandsend(int quantity, String email_address) {
		System.out.println("sending to MailService");
	}

}
