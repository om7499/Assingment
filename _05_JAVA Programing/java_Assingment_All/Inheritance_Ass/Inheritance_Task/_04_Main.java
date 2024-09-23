package Inheritance_Task;

class Book{
	private String title ;
	private String author;
	private int year;
	public Book(String title,String author,int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	void displayInfo() {
		System.out.println("Title : "+title +", Author : "+author+", Year : "+year);
	}
}

//fiction book
class fictionBook extends Book {
	private String genre;
	public fictionBook(String title,String author,int year,String genre) {
		super( title, author, year);
		this.genre = genre;
	}
	void read(){
		System.out.print("genre : "+genre+" " );
		super.displayInfo();
		System.out.println("Enjoy reading the fiction Book ");
		System.out.println("---------------------------------------------------");
	}
}

// non-fiction book
class nonfictionBook extends Book{
	private String topic;
	public nonfictionBook(String title,String author,int year,String topic) {
		super(title,author,year);
		this.topic = topic;
	}
	void study() {
		System.out.print("Topic : "+topic+" ");
		super.displayInfo();
		System.out.println("use this non-fiction book for study");
		
	}
}
public class _04_Main {
	public static void main(String[] args) {
		fictionBook fbook = new fictionBook(" math","Ram",2024,"genre2.7");
		fbook.read();
		nonfictionBook nbook = new nonfictionBook("english","shym",2000,"gen-4.0");
		nbook.study();
	}
}

/* output :

genre : genre2.7 Title :  math, Author : Ram, Year : 2024
Enjoy reading the fiction Book 
---------------------------------------------------
Topic : gen-4.0 Title : english, Author : shym, Year : 2000
use this non-fiction book for study
*/