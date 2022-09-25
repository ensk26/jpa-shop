package study.shop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;

    private int price;

    private int Quantity;

    public Item(Long id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        Quantity = quantity;
    }
}
