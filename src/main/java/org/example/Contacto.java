package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Contacto que representa un contacto en una agenda.
 * @author Jose Alfonso Gimenez Berbel
 * @version 1.0
 */

class Contacto {

    /**
     * Atributo que almacena el nombre del contacto.
     */

    private String name;

    /**
     * Atributo que almacena la lista de números de teléfono asociados al contacto.
     */

    private List<String> phones;

    /**
     * Constructor de la clase Contacto que inicializa el nombre y agrega un número de teléfono.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Método que obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Método que obtiene la lista de números de teléfono del contacto.
     *
     * @return Lista de números de teléfono.
     */

    public List<String> getPhones() {
        return this.phones;
    }
}