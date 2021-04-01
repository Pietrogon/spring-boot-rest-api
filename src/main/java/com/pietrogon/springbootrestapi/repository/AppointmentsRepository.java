package com.pietrogon.springbootrestapi.repository;

import com.pietrogon.springbootrestapi.entity.Appointments;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentsRepository  extends CrudRepository<Appointments, Long> {

    Iterable<Appointments> findByUserId(Long id);
}