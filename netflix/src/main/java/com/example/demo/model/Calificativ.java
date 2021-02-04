package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "calificativ_film")
//Generez un Sequeance number pentru a retine ultima valoare din
//baza de date
@SequenceGenerator(name = "calificativ_film_q",initialValue = 2, allocationSize = 5000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data


public class Calificativ {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "calificativ_film_q")
    @Column(name = "calificativ_film_id")
    private Integer calificativfilm_id;
    @Column(name = "data_acordare_nota")
    private String data_acordare_nota;



}

