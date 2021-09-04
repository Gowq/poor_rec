package com.soroban.backend;

import java.util.Scanner;

public class Challenges{

    private Soroban soroban;

    private int correctValue;

    public Challenges(Soroban soroban){

        this.soroban = soroban;

    }

    public Challenges(){

    }

    public void setSoroban(Soroban soroban) {
        this.soroban = soroban;
    }
    
    public String readNumber(){

        //tem q trocar por uma funÃ§Ã£o q gere um numero aleatorio
        correctValue = 42;

        soroban.setState(correctValue);

        soroban.printState();

        return "a";

    }

    public void writeNumber(){

        //tem q trocar por uma funÃ§Ã£o q gere um numero aleatorio
        correctValue = 42;

        System.out.print(correctValue);

    }

    public int checkAnswer(int answer){

        if(answer == correctValue) return 1;

        return 0;

    }

    public void sumNumber(){

        //tem q trocar por uma funÃ§Ã£o q gere um numero aleatorio
        int number1 = 24;
        int number2 = 69;

        soroban.setState(number1);
        soroban.printState();

        System.out.println(number2);

        correctValue = number1 + number2;

    }

    public void diffNumber(){

        //tem q trocar por uma funÃ§Ã£o q gere um numero aleatorio
        int number1 = 24;
        int number2 = 69;

        soroban.setState(number1);
        soroban.printState();

        System.out.println(number2);

        correctValue = Math.abs(number1 - number2);

    }

    public void multNumber(){

        //tem q trocar por uma funÃ§Ã£o q gere um numero aleatorio
        int number1 = 24;
        int number2 = 69;

        soroban.setState(number1);
        soroban.printState();

        System.out.println(number2);

        correctValue = number1 * number2;

    }

    public void divNumber(){

        //tem q trocar por uma funÃ§Ã£o q gere um numero aleatorio
        int number1 = 24;
        int number2 = 69;

        soroban.setState(number1);
        soroban.printState();

        System.out.println(number2);

        correctValue = number1 / number2;

        System.out.println(correctValue);

    }

    public int convert(int value){

        int ichidan;
        int godan;
        int newValue = 0;

        for(int i = 0; i < 12; i++){

            ichidan = value % 10;
            value /= 10;

            godan = value % 10;
            value /= 10;

            newValue += ((godan * 5) + ichidan) * Math.pow(10, i);

        }

        return newValue;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Soroban soroban = new Soroban();

        Challenges challenge = new Challenges();

        int answer;
    
        challenge.setSoroban(soroban);

        System.out.println("Teste de Leitura(1/6):\n Leia o estado de soroban a seguir e digite qual numero ele representa.");

        challenge.readNumber();

        answer = scan.nextInt();

        if(challenge.checkAnswer(answer) == 1)  System.out.println("Acertou!");
        else                                    System.out.println("Errou...");

        System.out.print("Teste de Escrita(2/6):\n Monte o numero ");

        challenge.writeNumber();

        System.out.print(" no soroban:");

        answer = scan.nextInt();

        answer = challenge.convert(answer);

        System.out.println("RESPOSTA: " + answer);

        if(challenge.checkAnswer(answer) == 1)  System.out.println("Acertou!");
        else                                    System.out.println("Errou...");

        System.out.println("Teste de Soma(3/6):\n Monte no soroban a soma dos seguintes numero e estado de soroban:");

        challenge.sumNumber();

        answer = scan.nextInt();

        answer = challenge.convert(answer);

        if(challenge.checkAnswer(answer) == 1)  System.out.println("Acertou!");
        else                                    System.out.println("Errou...");

        System.out.println("Teste de Subtracao(4/6):\n Monte no soroban o modulo da subtracao dos seguintes numero e estado de soroban:");

        challenge.diffNumber();

        answer = scan.nextInt();

        answer = challenge.convert(answer);

        if(challenge.checkAnswer(answer) == 1)  System.out.println("Acertou!");
        else                                    System.out.println("Errou...");

        System.out.println("Teste de Multiplicacao(5/6):\n Monte no soroban a multiplicacao dos seguintes numero e estado de soroban:");

        challenge.multNumber();

        answer = scan.nextInt();

        answer = challenge.convert(answer);

        if(challenge.checkAnswer(answer) == 1)  System.out.println("Acertou!");
        else                                    System.out.println("Errou...");

        System.out.println("Teste de Divisao(6/6):\n Monte no soroban a divisao inteira dos seguintes numero e estado de soroban:");

        challenge.divNumber();

        answer = scan.nextInt();

        answer = challenge.convert(answer);

        if(challenge.checkAnswer(answer) == 1)  System.out.println("Acertou!");
        else                                    System.out.println("Errou...");

        scan.close();

    }

}
