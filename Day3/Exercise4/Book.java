
package Exercise4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

class Book{
    private String name;
    private List<Author> authors = new ArrayList<Author>();
    private double price;
    private int qtyInStock = 0;
    public Book(String name, List<Author> authors, double price, int qtyInStock){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        authors.add(author);
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName(){
        return name;
    }
    public List<Author> getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    public String toDisplay(){
        StringBuffer output = new StringBuffer(String.format("%s by ",name));
        Iterator<Author> authorIterator = authors.iterator();
        while(authorIterator.hasNext()){
            output.append(authorIterator.next().toDisplay());
        }
        output.append(String.format("Price : %f and number of books available : %d",price,qtyInStock));
        return output.toString();
    }
    public void printAuthors(){
        for(Author author : authors){
            author.toDisplay();
            //String.format("%s %c at %s\n",author.getName(), author.getGender(), author.getEmail());
        }
    }
    public void addAuthors(Author author){
        authors.add(author);
    }
    
    public static Author setAuthor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author name : ");
        String name = scanner.next();
        System.out.print("Enter author email : ");
        String email = scanner.next();
        System.out.print("Enter author gender : ");
        char gender = scanner.next().charAt(0);
        return new Author(name, email, gender);
    }
    
    public static void main(String[] args){
        Author author = Book.setAuthor();
        List<Author> manyAuthor = new ArrayList<Author>();
        manyAuthor.add(author);
        manyAuthor.add(author);
        manyAuthor.add(author);
        Book book = new Book("XYZ", manyAuthor, 500, 3);
        book.addAuthors(author);
        System.out.println(book.toDisplay());
    }
}