package com.hospital.management_system.controller;

import com.hospital.management_system.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {
    @Autowired
    private MedicoService service;

}
