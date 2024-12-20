package org.example.commerces.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Order_details {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String  id;

    private  String  User_id;

    private String Total;

    private String Payment_id;
}
