package com.pietrogon.springbootrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AppointmentsController {
    @Autowired
    private AppointmentsRepository appointmentsRepository;

    @GetMapping(path="/appointments")
    public @ResponseBody
    Iterable<Appointments> getAllAppointments() {
        return appointmentsRepository.findAll();
    }

    @GetMapping(path="/appointments/{id}")
    public @ResponseBody
    Optional<Appointments> getAppointment(@PathVariable Integer id) {
        return appointmentsRepository.findById(id);
    }

    @DeleteMapping(path="/appointments/{id}")
    public @ResponseBody
    void deleteAppointment(@PathVariable Integer id) {
        appointmentsRepository.deleteById(id);
    }

    @PostMapping(path="/appointments")
    public @ResponseBody
    void saveAppointment(@RequestBody Appointments appointments) {
        appointmentsRepository.save(appointments);
    }

    @PutMapping(path="/appointments")
    public @ResponseBody
    void updateAppointment(@RequestBody Appointments appointments) {
        appointmentsRepository.save(appointments);
    }
}
