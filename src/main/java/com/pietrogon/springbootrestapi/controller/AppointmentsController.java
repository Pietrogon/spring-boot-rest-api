package com.pietrogon.springbootrestapi.controller;

import com.pietrogon.springbootrestapi.entity.Appointments;
import com.pietrogon.springbootrestapi.repository.AppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path="/appointments")
    @ResponseBody
    public Iterable<Appointments> getAllAppointments() {
        return appointmentsRepository.findAll();
    }

    @GetMapping(path="/appointments/{id}")
    @ResponseBody
    public Optional<Appointments> getAppointment(@PathVariable Long id) {
        return appointmentsRepository.findById(id);
    }

    @GetMapping(path="/appointments/user/{id}")
    @ResponseBody
    public Iterable<Appointments> getAppointmentByUserId(@PathVariable Long id) {
        return appointmentsRepository.findByUserId(id);
    }

    @DeleteMapping(path="/appointments/{id}")
    @ResponseBody
    public void deleteAppointment(@PathVariable Long id) {
        appointmentsRepository.deleteById(id);
    }

    @PostMapping(path="/appointments")
    @ResponseBody
    public void saveAppointment(@RequestBody Appointments appointments) {
        appointmentsRepository.save(appointments);
    }

    @PutMapping(path="/appointments")
    @ResponseBody
    public void updateAppointment(@RequestBody Appointments appointments) {
        appointmentsRepository.save(appointments);
    }
}
