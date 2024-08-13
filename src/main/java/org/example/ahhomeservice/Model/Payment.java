package org.example.ahhomeservice.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String transaction_id;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;



}
