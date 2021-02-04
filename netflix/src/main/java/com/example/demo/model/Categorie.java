package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "categorie")
//Generez un Sequeance number pentru a retine ultima valoare din
//baza de date
@SequenceGenerator(name = "categorie_q",initialValue = 2, allocationSize = 5000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data

public class Categorie {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categorie_q")
    @Column(name = "categorie_id")
    private Integer categorie_id;
    @Column(name = "nume")
    private String nume;





}
