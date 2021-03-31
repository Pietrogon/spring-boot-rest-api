package com.pietrogon.springbootrestapi;

import org.springframework.data.repository.CrudRepository;

public interface AppointmentsRepository  extends CrudRepository<Appointments, Integer> {
}