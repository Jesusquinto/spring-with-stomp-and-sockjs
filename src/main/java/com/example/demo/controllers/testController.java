package com.example.demo.controllers;

import com.example.demo.models.documents.Mensaje;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class testController {
    
    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje reciveObject(Mensaje mensaje){
         mensaje.setFecha(new Date().getTime());
         if(mensaje.getTipo().equals("NUEVO_USUARIO")){
             mensaje.setTexto("Se ha unido a la cachoneria");
         }
                                  
        return mensaje;
    }
    
}
