import pojo.Book;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestSaxParser
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Locate the file
        File xmlFile = new File("example.xml");

        //Create the parser instance
        BooksXmlParser parser = new BooksXmlParser();

        //Parse the file
        ArrayList books = parser.parseXml(new FileInputStream(xmlFile));

        //Verify the result
        //System.out.println(books);
        Book book = new Book();
        for(int i = 0; i < books.size(); i++)
        {
            System.out.println("Книга: " + (i+1));
            book = (Book) books.get(i);
            System.out.println("Автор: " + book.getAuthor());
            System.out.println("Название: " + book.getTitle());
            System.out.println("Переплет: " + book.getBinding());
            System.out.println("Количество страниц: " + book.getPages());
            System.out.println("Цена: " + book.getPrice());

        }


    }
}
