package org.example;

import java.util.*;

/**
 * Clase "Agenda" que representa una agenda de contactos.
 * @author Jose Alfonso Gimenez Berbel
 * @version 1.0
 */

public class Agenda {

    /**
     * Atributo que almacena la lista de contactos en la agenda.
     */

    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor de la clase Agenda que inicializa la lista de contactos.
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método que añade un nuevo contacto a la agenda.
     *
     * @param name Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }
        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método que elimina un contacto de la agenda.
     *
     * @param name Nombre del contacto para eliminarlo.
     */

    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método que modifica el número de teléfono de un contacto.
     *
     * @param name Nombre del contacto.
     * @param oldPhone Número de teléfono antiguo.
     * @param newPhone Nuevo número de teléfono.
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método que obtiene la lista de contactos almacenados en la agenda.
     *
     * @return Lista de contactos.
     */

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}