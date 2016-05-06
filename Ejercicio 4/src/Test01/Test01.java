
package Test01;

import com.upao.propuestos3.Author;
import com.upao.propuestos3.Book;

public class Test01 {

    public static void main(String[] args) 
    {
        Author h=new Author("Chang ", "chang.2404@hotmail.com", 'M');
        Book b=new Book("Aprendiendo a Programar", h, 99, 5);
        System.out.println(b);
    }
    
}