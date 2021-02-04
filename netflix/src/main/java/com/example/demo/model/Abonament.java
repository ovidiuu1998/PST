package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

//Adnotari mapare
@Entity
//Se face maparea
@Table(name = "abonament")
//Generez un Sequeance number pentru a retine ultima valoare din
//baza de date
@SequenceGenerator(name = "abonament_q",initialValue = 2, allocationSize = 5000)
//Generez Getter si setters cu adnotarea lomboc, fara sa fiu nevoit sa le declar separat.
@Data


public class Abonament {
    //Indica ca e chiere primara
    @Id
    //Indic bazei de date ca generez valorile si sequence numberul generat mai sus
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abonament_q")
    @Column(name = "abonament_id")
    private Integer abonament_id;
    @Column(name = "data_inceput")
    private String data_inceput;
    @Column(name = "data_sfarsit")
    private String data_sfarsit;
    @Column(name = "data_reabonare")
    private String data_reabonare;
    @Column(name= "user_user_id")
    private Integer user_user_id;
    @Column(name ="tip_abonament")
    private String tip_abonament;

}
