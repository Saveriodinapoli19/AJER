/*Scrivi un programma Java che analizzi tre numeri interi (definiti come num1, num2, num3). Il programma
dovrebbe determinare e stampare:
1. Il numero più grande.
2. Se la somma dei primi due numeri è maggiore del terzo.
3. Se almeno uno dei numeri è pari.*/
public class EsercizioOperatori {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 32;
        int num3 = 13;

        numeroPiuGrande(num1, num2, num3);
        sommaDiNum1Num2(num1, num2, num3);
        numPari(num1, num2, num3);
    }

    public static void numeroPiuGrande(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("num1 : " + num1 + " è il numero più grande");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("num2 : " +  num2 + " è il numero più grande");
        }
        if(num3> num1 && num3 > num2){
            System.out.println("num3 : " + num3 + " è il più grande");
        }
    }
    public static void sommaDiNum1Num2(int num1, int num2, int num3){
        if(num1 + num2 > num3){
            System.out.println("La somma di " + num1 + "+" + num2 + " è maggiore di " + num3);
        }else{
            System.out.println(num3 + " è più grande di num1 e num2");
        }
    }
    public static void numPari(int num1, int num2, int num3){
        if(num1 % 2 == 0 || num2 % 2 ==0 || num3 % 2 == 0){
            System.out.println("Almeno uno dei numeri è pari");
        }else {
            System.out.println("Nessun numero è pari");
        }
    }

    }
