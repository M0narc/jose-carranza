package com.globant.bootcamp.dia15.service;

import com.globant.bootcamp.dia15.domain.entity.Person;
import com.globant.bootcamp.dia15.domain.entity.Reservation;
import com.globant.bootcamp.dia15.service.crud.PersonService;
import com.globant.bootcamp.dia15.service.crud.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InactivityDeletionService {
    @Autowired
    private PersonService personService;
    @Autowired
    private ReservationService reservationService;

    public List<Person> deleteInactivePerson (List<Person> personList){
        for (Person person:personList) {
            personService.deletePerson(person.getId());
        }
        return personList;
    }

    public List<Reservation> deleteUnsoldReservation (List<Reservation> reservationList){
        for (Reservation reservation:reservationList) {
            reservationService.deleteReservation(reservation.getId());
        }
        return reservationList;
    }
}
