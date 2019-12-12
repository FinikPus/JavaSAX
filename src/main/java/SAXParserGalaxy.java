

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import pojo.Book;

import java.util.ArrayList;
import java.util.Stack;

public class SAXParserExample extends DefaultHandler {

    private ArrayList galaxyList = new ArrayList();

    //Каждый читаемый xml элемент помещается в стек
    private Stack elementStack = new Stack();

    //Каждый прочитанный объект помещается в стек
    private Stack objectStack = new Stack();

    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        System.out.println("Start Element :" + qName);
        this.elementStack.push(qName);
        if (qName.equalsIgnoreCase("BOOK")) {
            Book book = new Book();
            this.objectStack.push(book);

        }
    }

    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        this.elementStack.pop();
        if (qName.equalsIgnoreCase("BOOK")) {
            Book object = (Book) this.objectStack.pop();
            this.galaxyList.add(object);
        }
        System.out.println("End Element :" + qName);

    }

    public void characters(char ch[], int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();

        if (value.length() == 0) {
            return; // ignore white space
        }

        //handle the value based on to which element it belongs
        if (currentElement().equalsIgnoreCase("TITLE")) {
            Book book = (Book) this.objectStack.peek();
            book.setTitle(value);
        } else if (currentElement().equalsIgnoreCase("AUTHOR")) {
            Book book = (Book) this.objectStack.peek();
            book.setAuthor(value);
        } else if (currentElement().equalsIgnoreCase("BINDING")) {
            Book book = (Book) this.objectStack.peek();
            book.setBinding(value);
        } else if (currentElement().equalsIgnoreCase("PAGES")) {
            Book book = (Book) this.objectStack.peek();
            book.setPages(value);
        } else if (currentElement().equalsIgnoreCase("PRICE")) {
            Book book = (Book) this.objectStack.peek();
            book.setPrice(value);
        }
    }

    private String currentElement() {
        return (String) this.elementStack.peek();
    }

    public ArrayList getBookList() {
        return galaxyList;
    }
}


