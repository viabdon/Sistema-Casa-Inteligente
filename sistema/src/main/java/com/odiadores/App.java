package com.odiadores;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        Telefone telefone1 = new Telefone();

        telefone1.setDefault();
    }
}
