package com.ms_taller.albarragan_ganegrin_juanfbrinezg.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/nombre")
public class NombreController {
    @GetMapping("/albarragan")
    public ResponseEntity<String> getAlejandro() {
        String data = "{ \"data\" : \"Alejandro Barragán Amrotegui\"}";
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(data);
    }

    @GetMapping("/ganegrin")
    public ResponseEntity<String> getGabriel() {
        String data = "{ \"data\" : \"Gabriel Andrés Negrín Hernández\"}";
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(data);
    }

    @GetMapping("/juanfbrinezg")
    public ResponseEntity<String> getJuanFelipe() {
        String data = "{ \"data\" : \"Juan Felipe Briñez Gómezz\"}";
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(data);
    }

}
