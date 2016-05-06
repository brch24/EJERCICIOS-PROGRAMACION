
package com.upao.test;

import com.upao.propuestos1.Author;
import com.upao.propuestos1.Book;

public class Test01 {

    
    public static void main(String[] args) 
    {
       Author n2=new Author("Chang ", "chang.2404@hotmail.com", 'M');
        System.out.println(n2);
        
        Book n1=new Book("Test de ejercicios",n2, 19.99, 3);
        System.out.println(n1);
    }
    
}
