package modular.java.core;

import modular.java.utils.operacoes.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.multi(3, 3));
    }
}
