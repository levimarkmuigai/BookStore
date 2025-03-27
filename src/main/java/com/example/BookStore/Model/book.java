package com.example.BookStore.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
