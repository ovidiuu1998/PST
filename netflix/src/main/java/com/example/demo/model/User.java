package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
//Se face maparea
@Table(name = "user")
//Generez un Sequeance number pentru a retine ultima valoare din
//baza de date
@SequenceGenerator(name = "user_q",initialValue = 2, allocationSize = 9000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data
public class User {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_q")
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "email")
    private String email;
    @Column(name = "parola")
    private String parola;
    @Column(name="data_nasterii")
    private String data_nastere;

    @ManyToOne
    private Calificativ calificativ;
    @ManyToOne
    private Abonament abonament;




}
