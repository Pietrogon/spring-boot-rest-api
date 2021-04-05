package com.pietrogon.springbootrestapi.controller;

import com.pietrogon.springbootrestapi.entity.Appointments;
import com.pietrogon.springbootrestapi.repository.AppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AppointmentsController {
    @Autowired
    public AppointmentsController(final AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }

    private final AppointmentsRepository appointmentsRepository;

    @PostMapping(path="/appointments")
    @ResponseBody
    @PreAuthorize("hasRole('USER')")
    public void saveAppointment(@RequestBody Appointments appointments) {
        appointmentsRepository.save(appointments);
    }
}
