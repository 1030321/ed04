package org.example;

import java.util.*;

/**
 * Clase "Agenda" que representa una agenda de contactos.
 * @author Jose Alfonso Gimenez Berbel
 * @version 1.0
 */

public class Agenda implements IAgenda {

    /**
     * Atributo que almacena la lista de contactos en la agenda.
     */

    private List<Persona> contacts; // Lista de Contacto

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

    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }
        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método que elimina un contacto de la agenda.
     *
     * @param name Nombre del contacto para eliminarlo.
     */

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

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

    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
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

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}