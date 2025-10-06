package Material.Didactico.Material.Didactico.entities;

import java.io.Serializable;
import java.util.Objects;


public class Material {
    private Long id;
    private String nombre;
    private double precio;
    private String tipo;

    public Material() {
    }

    public Material(Long id, String nombre, double precio, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material material)) return false;
        return Double.compare(material.getPrecio(), getPrecio()) == 0 && Objects.equals(getId(), material.getId()) && Objects.equals(getNombre(), material.getNombre()) && Objects.equals(getTipo(), material.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getPrecio(), getTipo());
    }
}
