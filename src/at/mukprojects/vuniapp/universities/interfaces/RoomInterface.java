/**
 * Copyright (C) 2013 by
 * Mathias Markl and Kerrim Abd El Hamed
 *
 * This program is free software!
 * You are allowed to redistribute it and/or modify it
 * under the terms of the GNU General Public License, version 2.
 * For details of the GNU General Public License see
 * http://www.gnu.org/licenses/gpl-2.0.html
 */

package at.mukprojects.vuniapp.universities.interfaces;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONException;

import at.mukprojects.vuniapp.models.Room;

/**
 * Das Interface RoomInterface wird in alle Universit&auml;ten implementiert,
 * welche eine Raumsuche implementiert haben.
 * 
 * @author Mathias
 */
public interface RoomInterface extends Serializable {
    /**
     * Diese Methode sucht nach R&auml;men, die mit dem Input
     * &uuml;bereinstimmen und liefert diese zur&uuml;ck.
     * 
     * @param input
     *            Parameter nach welchem gesucht werden soll.
     * @return Liste an &Uuml;bereinstimmungen.
     * @throws JSONException
     *             Wird geworfen, wenn die Umwandlung des String nicht
     *             funktioniert.
     * @throws IOException
     *             Wird geworfen, falls es beim Laden der Daten zu einem Fehler
     *             kommt.
     */
    ArrayList<Room> searchRooms(String input) throws JSONException, IOException;

    /**
     * Diese Methode sucht nach R&auml;men, die mit dem Input
     * &uuml;bereinstimmen und liefert diese zur&uuml;ck. Es wird null
     * zur&uuml;ckgeliefert, falls kein passender Raum gefunden wurde.
     * 
     * @param input
     *            Ein Raum, der bereits teilweise ausgelesen werden konnte und
     *            durch den Service, um die fehlenden Paramerter erg&auml;nzt
     *            wird.
     * @return Fall ein eindeutiger Raum gefunden wird, so wird dieser, mit den
     *         Informationen aus der Datenbank erg&auml;gnzt. Wenn mehrere
     *         R&auml;umne gefunden werden so wird eine Liste zur&uuml;ck
     *         geliefert.
     * @throws JSONException
     *             Wird geworfen, wenn die Umwandlung des String nicht
     *             funktioniert.
     * @throws IOException
     *             Wird geworfen, falls es beim Laden der Daten zu einem Fehler
     *             kommt.
     */
    ArrayList<Room> searchRooms(Room input) throws JSONException, IOException;
}
