package study.shop.domain.item;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("book")
public class Book extends Item{

    private String author;

    private String isbn;

    public Book(Long id, String name, int price, int quantity, String author, String isbn) {
        super(id, name, price, quantity);
        this.author = author;
        this.isbn = isbn;
    }
}
