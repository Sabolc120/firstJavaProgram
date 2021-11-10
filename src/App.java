import java.util.Scanner;

public class App {
    static int eredmeny;
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Írd be az első számot: "); //Bekérem az első számot...
            int firstNumber = scanner.nextInt();
            System.out.println("Írd be a második számot: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Kérek egy operátort: +,-,/,%,*");
            char operátor = scanner.next().charAt(0);
            System.out.println("Első szám: " + firstNumber + " Második szám: " + secondNumber + " Művelet operátor: "+ operátor); // Ellenőrző
            if(operátor == '+'){   //Műveletek az operátor alapján..
                eredmeny = firstNumber + secondNumber;
                System.out.println("Összeadásos eredmény: "+ eredmeny);
            }
            else if(operátor == '-'){
                eredmeny = firstNumber - secondNumber;
                System.out.println("Kivonásos eredmény: "+eredmeny);
            }
            else if(operátor == '/'){
                eredmeny = firstNumber / secondNumber;
                System.out.println("Osztásos eredmény: "+eredmeny);
            }
            else if(operátor == '*'){
                eredmeny = firstNumber * secondNumber;
                System.out.println("Szorzásos eredmény: "+eredmeny);
            }
            else if(operátor == '%'){
                eredmeny = firstNumber % secondNumber;
                System.out.println("Maradékos osztásos eredmény: "+eredmeny);
            }   
        }
        catch(Exception exception){
            System.out.println("Helytelen bevitel.");
        }
    }
}