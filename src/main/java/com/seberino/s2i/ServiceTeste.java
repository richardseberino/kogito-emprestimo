package com.seberino.s2i;



public class ServiceTeste {
    

    public String teste(String mensagem)
    {
        System.out.println("Menagem dentro do metodo Java. Recebido valor: " + mensagem);
        mensagem = mensagem + ". Alterada pelo servico";
        return mensagem;
    }
}
