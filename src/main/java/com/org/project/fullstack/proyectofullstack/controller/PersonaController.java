package com.org.project.fullstack.proyectofullstack.controller;
import com.org.project.fullstack.proyectofullstack.model.Persona;
import com.org.project.fullstack.proyectofullstack.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private IPersonaService iPersonaService;

    @GetMapping
    public List<Persona> listar(){
        return iPersonaService.listar();
    }

    @PostMapping
    public ResponseEntity<Persona> registrar(@RequestBody Persona persona){
        Persona personaRegistrada = iPersonaService.registrar(persona);
        return new ResponseEntity<Persona>(personaRegistrada, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Persona> actualizar(@RequestBody Persona persona){
        Persona personaActualizada = iPersonaService.actualizar(persona);
        return new ResponseEntity<Persona>(personaActualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{idPersona}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idPersona) throws Exception{
        Persona persona = iPersonaService.buscarPorId(idPersona);
        if(null == persona){
            throw new Exception("Persona no encontrada");
        }
        iPersonaService.eliminar(idPersona);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{idPersona}")
    public ResponseEntity<Persona> buscarPorid(@PathVariable Long idPersona) throws Exception{
        Persona personaEncontrada = iPersonaService.buscarPorId(idPersona);
        if(null == personaEncontrada){
            throw new Exception("ID Persona no encontrada");
        }
         return new ResponseEntity<Persona>(personaEncontrada, HttpStatus.OK);
    }

}
