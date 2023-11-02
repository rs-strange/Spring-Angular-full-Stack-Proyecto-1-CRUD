package com.org.project.fullstack.proyectofullstack.controller;

import com.org.project.fullstack.proyectofullstack.model.Pais;
import com.org.project.fullstack.proyectofullstack.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    private IPaisService iPaisService;

    @GetMapping("/listarPaises")
    public ResponseEntity<List<Pais>> listar(){
        List<Pais> paises = iPaisService.listar();
        return new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
    }

    @PostMapping("/registrarPais")
    public ResponseEntity<Pais> registrar(@RequestBody Pais pais){
        Pais paisRegistrado = iPaisService.registrar(pais);
        return new ResponseEntity<Pais>(paisRegistrado, HttpStatus.OK);
    }

    @PutMapping("/actualizarPais")
    public ResponseEntity<Pais> actualizar(@RequestBody Pais pais){
        Pais paisActualizado = iPaisService.actualizar(pais);
        return new ResponseEntity<Pais>(paisActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/eliminarPais/{idPais}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idPais) throws Exception{
        Pais pais = iPaisService.buscarPorId(idPais);
        if(null == pais){
            throw new Exception("Pais no encontrado");
        }
        iPaisService.eliminar(idPais);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/buscarPorId/{idPais}")
    public ResponseEntity<Pais> buscarPorId(@PathVariable Long idPais) throws Exception{
        Pais paisEncontrado = iPaisService.buscarPorId(idPais);
        if(null == paisEncontrado){
            throw new Exception("ID Pais no se encuentra en BD");
        }

        return new ResponseEntity<Pais>(paisEncontrado, HttpStatus.OK);
    }

}
