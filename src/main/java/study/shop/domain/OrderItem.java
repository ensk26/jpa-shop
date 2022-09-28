package study.shop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import study.shop.domain.item.Item;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Orders orders;  //주문

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;  //주문 상품

    private int orderPrice; //주문 가격

    private int count;  //수량

    public OrderItem(Long id, Orders orders, Item item, int orderPrice, int count) {
        this.id = id;
        this.orders = orders;
        this.item = item;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
