package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.AuthorRepo;
import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.CategoryRepo;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

@Component
public class BookService {
    private final BookRepo bookRepo;
   private final CategoryRepo categoryRepo;
   private final AuthorRepo authorRepo;

    public BookService(BookRepo bookRepo, CategoryRepo categoryRepo, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.categoryRepo = categoryRepo;
        this.authorRepo = authorRepo;
    }
    public void BookOperations(){
    Book b2 = new Book();
        b2.setIsbn(UUID.randomUUID().toString());
        b2.setName("Simyacı");
        b2.setDescription("Simyacı, Brezilyalı eski şarkı sözü yazarı Paulo Coelho'nun, yayınlandığı 1988 yılından bu yana dünyayı birbirine katan, eleştirmenler tarafından bir `fenomen' olarak değerlendirilen üçüncü romanı. ");
        b2.setPublishedDate(LocalDate.of(2019,06,17));
        b2.setCurrency("tl");
        b2.setPrice(17.22);
        b2.setImageUrl("https:resim1");

        Author a1 = new Author();
        a1.setName("Paulo Chole");
        b2.setAuthors(Collections.singleton(a1));


        bookRepo.save(b2);
        //Kitap ismine göre arama
        System.out.println(bookRepo.findByName("Simyacı"));
        //yazar ismine göre arama
        System.out.println(bookRepo.findAllByAuthors_NameContainingIgnoreCase("Paulo Chole"));

    }
}
