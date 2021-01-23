package com.hkarabakla;

import com.hkarabakla.services.BookService;
import com.hkarabakla.services.CategoryService;
import com.hkarabakla.services.OrderToService;
import com.hkarabakla.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.hkarabakla");
        appContext.refresh();

        UserService userService = (UserService) appContext.getBean("userService");
        userService.userOperations();

        CategoryService categoryService = (CategoryService) appContext.getBean("categoryService");
        categoryService.categoryOperations();

        BookService bookService = (BookService) appContext.getBean("bookService");
        bookService.BookOperations();

        OrderToService orderToService = (OrderToService) appContext.getBean("orderToService") ;
        orderToService.OrdersOperations();
     /*   OrdersService ordersService = (OrdersService) appContext.getBean("ordersService");
        ordersService.OrderOperations(); */

        appContext.close();
    }
}
