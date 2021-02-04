package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "filme")
//Generez un Sequeance number pentru a retine ultima valoare din
//baza de date
@SequenceGenerator(name = "filme_q",initialValue = 2, allocationSize = 5000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data


public class Filme {


    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme_q")
    @Column(name = "filme_id")
    private Integer id_film;
    @Column(name = "titlu")
    private String titlu;
    @Column(name = "descriere_film")
    private String descriere;
    @Column(name = "an_aparitie")
    private String an;
    @Column(name= "durata_film")
    private String durata;
    @Column(name ="data_adaugare")
    private String data;

    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private Calificativ calificativ;



}
