package jpabook.jpashop.domain.item;

import jpabook.jpashop.controller.BookForm;
import jpabook.jpashop.domain.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item{

    private String author;
    private String isbn;

    public static Book createBook(BookForm form) {
        Book book = new Book();
        book.setId(form.getId());
        book.setName(form.getName());
        book.setPrice(form.getPrice());
        book.setStockQuantity(form.getStockQuantity());
        book.setAuthor(form.getAuthor());
        book.setIsbn(form.getIsbn());

        return book;
    }
}
