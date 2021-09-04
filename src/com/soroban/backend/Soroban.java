package com.soroban.backend;

public class Soroban {
    
    public Column[] columns;

    public Soroban(){

        this.columns = new Column[12];

    }

    public void setState(int value) {

        for(int i = 0; i < 12; i++){
            columns[i] = new Column();
            columns[i].setValue(value % 10);
            value /= 10;
        }

    }

    public int getState() {

        int value = 0;

        for(int i = 0; i < 12; i++) {
            value += columns[i].getValue() * Math.pow(10, i);

        }

        return value;

    }

    public void printState() {
        int godan[] = new int[12];
        int ichidan[] = new int[12];


        //Le todos os Ichidans e Godans
        for(int i = 0; i < 12; i++){
            godan[i] = columns[i].getGodan();
            ichidan[i] = columns[i].getIchidan();
        }

        //Imprime os Godans
        for(int i = 0; i < 12; i++){
            if(godan[i] == 0) System.out.print("|X");
            else System.out.print("| ");
        }

        System.out.print("|\n");

        for(int i = 0; i < 12; i++){
            if(godan[i] == 1) System.out.print("|X");
            else System.out.print("| ");
        }

        //Imprime a linha separatoria
        System.out.print("|\n");


        System.out.print("-------------------------\n");
        
        //Imprime os Ichidans
        for(int i = 0; i < 12; i++){
            if(ichidan[i] == 0) System.out.print("| ");
            else System.out.print("|X");

        }

        System.out.print("|\n");

        for(int i = 0; i < 12; i++) {
            if(ichidan[i] == 1) System.out.print("| ");
            else System.out.print("|X");
        }

        System.out.print("|\n");

        for(int i = 0; i < 12; i++){

            if(ichidan[i] == 2) System.out.print("| ");
            else System.out.print("|X");

        }

        System.out.print("|\n");

        for(int i = 0; i < 12; i++) {
            if(ichidan[i] == 3) System.out.print("| ");
            else System.out.print("|X");
        }

        System.out.print("|\n");

        for(int i = 0; i < 12; i++) {
            if(ichidan[i] == 4) System.out.print("| ");
            else System.out.print("|X");
        }

        System.out.print("|\n");

    }

}

