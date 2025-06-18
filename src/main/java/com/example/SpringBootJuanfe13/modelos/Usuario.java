package com.example.SpringBootJuanfe13.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

@Table(name = "usuario")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    Integer id;

    @Column(name = "nombres", length = 50)
    private Integer id;
    String nombres;

    @Column(name = "contraseña", length = 10)
    private Integer id;
    String contraseña;

    @Column(name = "correo", length = 30)
    private Integer id;
    String correo;

    @Column(name = "edad")
    private Integer id;
    Integer edad;

    @Column(name = "fechaNacimiento")
    private Integer id;
    LocalDate fechaNacimiento;

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String contraseña, String correo, Integer edad, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
