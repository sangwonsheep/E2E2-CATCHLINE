package org.example.catch_line.review.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.catch_line.common.BaseTimeEntity;
import org.example.catch_line.member.model.entity.MemberEntity;
import org.example.catch_line.restaurant.model.entity.RestaurantEntity;
import org.hibernate.validator.internal.util.stereotypes.Lazy;

@Entity
@Table(name = "review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @Column(nullable = false)
    private Integer rating;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;

}
