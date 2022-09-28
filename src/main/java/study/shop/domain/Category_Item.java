package study.shop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import study.shop.domain.item.Item;

import javax.persistence.*;

@Getter
@NoArgsConstructor
public class Category_Item {

    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name="Item_ID")
    private Item item;

    public Category_Item(Category category, Item item) {
        this.category = category;
        this.item = item;
    }
}
