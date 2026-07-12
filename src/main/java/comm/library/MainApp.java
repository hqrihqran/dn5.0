package comm.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            
            BookService service = (BookService) context.getBean("bookService");
            
            // Test with a sample book
            service.addBook("The Alchemist");
        }
    }
}