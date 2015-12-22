package Exercise4;

import java.util.Scanner;

public class Author{
    private String name,email;
    private char gender;
    
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return gender;
    }
    public String toDisplay(){
        String output = String.format("%s %c at %s\n",name, gender, email);
        return output;
    }
    public static void main(String[] args){
        Author author = new Author("R.K. Narayan", "rknarayan@gmail.com", 'M');
        System.out.println(author.toDisplay());
        author.setEmail("r.k.narayan@gmail.com");
        System.out.println(author.toDisplay());
    }
}
