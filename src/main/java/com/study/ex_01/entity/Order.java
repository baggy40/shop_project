package com.study.ex_01.entity;

import com.study.ex_01.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    //orderItem에 있는 order에 의해 관리된다는 의미
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL,
        orphanRemoval = true, fetch = FetchType.LAZY)//고아 객체제거
    private List<OrderItem> orderItems = new ArrayList<>();

}
