package com.backend.tourBooking.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_category;
    private String name;
    private String description;

    public Category() {
    }

    public Category(Long id_categoria, String name, String description) {
        this.id_category = id_category;
        this.name = name;
        this.description = description;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
