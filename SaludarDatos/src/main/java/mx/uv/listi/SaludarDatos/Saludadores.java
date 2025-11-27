/* Paquete 
package mx.uv.listi.SaludarDatos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saludadores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   private String nombre; 
}

*/

package mx.uv.listi.SaludarDatos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saludadores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    // Constructor vacío requerido por JPA
    public Saludadores() {
    }

    // (Opcional) Constructor de conveniencia
    public Saludadores(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // SETTERS
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


