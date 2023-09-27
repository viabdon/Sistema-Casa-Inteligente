package com.odiadores;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Telefone {

    ArrayList<Contato> listaContatos = new ArrayList<>();

    public void adicionarContato(Contato cont) {
        listaContatos.add(cont);
    }

    JSONObject jsonObject;
    // Cria o parse de tratamento
    JSONParser parser = new JSONParser();
    // Variaveis que irao armazenar os dados do arquivo JSON
    Contato cont = new Contato("", "", "");

    public Telefone() {
        super();
    }

    public void setDefault() throws FileNotFoundException, IOException, ParseException {

        JSONArray telefoneArquivo = (JSONArray) parser
                .parse(new InputStreamReader(new FileInputStream("contato.json"),
                        StandardCharsets.UTF_8));
        for (Object o : telefoneArquivo) {
            JSONObject tel_ = (JSONObject) o;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = tel_.get("nome").toString();
            String email = tel_.get("email").toString();
            String telefone = tel_.get("telefone").toString();

            Contato contato = new Contato(nome, email, telefone);
            adicionarContato(contato);
        }

    }

    public void listarContatos() {
        for (Contato cont : listaContatos) {
            System.out.println(cont.imprimirDados());
        }
    }
}
