package com.dh.hibernate.aula33.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "times")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cidade;
    private String estado;
    @OneToMany(mappedBy = "time", fetch = FetchType.LAZY)
    private Set<Jogador> jogadores = new HashSet<>();

    public Time() {
    }
}
