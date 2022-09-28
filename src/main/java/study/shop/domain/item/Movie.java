package study.shop.domain.item;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("movie")
public class Movie extends Item {

    private String director;

    private String actor;

    public Movie(Long id, String name, int price, int quantity, String director, String actor) {
        super(id, name, price, quantity);
        this.director = director;
        this.actor = actor;
    }
}
