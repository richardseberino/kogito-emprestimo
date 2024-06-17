package com.seberino.s2i;

import javax.enterprise.context.ApplicationScoped;

public class AvisaCliente 
{

    @ApplicationScoped
    public String enviaEmail(String email, String mensagem)
    {
        System.out.println("Envia comunicado ao cliente! " + mensagem);

        return "email enviado!";
    }

}
