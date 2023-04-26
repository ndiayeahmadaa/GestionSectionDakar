package sn.ahiba.gmembrebacken.entities;

import jakarta.persistence.*;

@Entity
public class Fonction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String nom;
    @OneToOne
    private Membre membre;
    public Fonction(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Fonction() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
