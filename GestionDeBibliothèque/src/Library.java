import java.util.ArrayList;
public class Library {
	private int id ;
	private String name;
	private String address;
    private int numTel;
    ArrayList<Book> list = new ArrayList<Book>();
    ArrayList<Rent> list  = new ArrayList<Rent>();
	private Library(int id, String name, String address, int numTel, ArrayList<Book> list) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.numTel = numTel;
		this.list = list;
	}
    
}
