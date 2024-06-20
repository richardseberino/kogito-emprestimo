package com.seberino.s2i;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;

public class AvisaCliente 
{

    @Inject Mailer mail;   

    @ApplicationScoped
    public String enviaEmail(String email, String mensagem)
    {
        System.out.println("Envia comunicado ao cliente! " + mensagem);
        //mail = new Mail();
        mail.send(Mail.withText("seberino@hotmail.com", "teste de envio de email", "Mensagem de teste"));
        return "email enviado!";
    }

}



