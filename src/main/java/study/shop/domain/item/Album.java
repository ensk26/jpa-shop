package study.shop.domain.item;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("album")
public class Album extends Item{

    private String artist;

    private String etc;

    public Album(Long id, String name, int price, int quantity, String artist, String etc) {
        super(id, name, price, quantity);
        this.artist = artist;
        this.etc = etc;
    }
}
