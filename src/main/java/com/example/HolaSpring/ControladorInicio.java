/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HolaSpring;

import com.example.domain.Persona;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;
    
        @GetMapping("/")
        public String inicio(Model model){
            var mensaje ="Enviado mensajes";
            //creo una variable de tipo persona
            var persona = new Persona();
            //Set para guardar la data de tipo persona
            persona.setNombre("Cristian");
            persona.setApellido("Arce");
            persona.setEmail("cristian.arce@utp.edu.co");
            
            var persona2 = new Persona();
            //Set para guardar la data de tipo persona
            persona2.setNombre("David");
            persona2.setApellido("Arce");
            persona2.setEmail("cristian.arce@utp.edu.co");
            
            //Crear array tipo persona
            
            var personas=Arrays.asList(persona,persona2);
            
            //La envio al modelo para mostrarla en el index
            model.addAttribute("mensaje",mensaje);
            model.addAttribute("saludo", saludo);
            model.addAttribute("persona", persona);
            model.addAttribute("personas", personas);
            return "index";
    }   
    
}
