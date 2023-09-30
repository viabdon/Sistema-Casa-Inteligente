package com.odiadores;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DecodificadorTelefone extends Telefone {

    JSONObject jsonObject;
    // Cria o parse de tratamento
    JSONParser parser = new JSONParser();
    // Variaveis que irao armazenar os dados do arquivo JSON
    Contato cont = new Contato("", "", "");

    public DecodificadorTelefone(String nome) {
        super(nome);
    }

    public void setDefault() throws IOException, ParseException {
        // Use o ClassLoader para carregar o arquivo do classpath
        JSONArray telefoneArquivo = (JSONArray) parser
                .parse(new InputStreamReader(new FileInputStream("contato.json"), "UTF-8"));

        for (Object o : telefoneArquivo) {
            JSONObject tel_ = (JSONObject) o;
            String nome = tel_.get("nome").toString();
            String email = tel_.get("email").toString();
            String telefone = tel_.get("telefone").toString();

            Contato contato = new Contato(nome, email, telefone);
            adicionarContato(contato);
        }
    }
}
