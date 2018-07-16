import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Employee[] emp = new Employee[2];

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scan.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scan.nextLine();
        System.out.println("Podaj wypłate");
        double wyplata = scan.nextDouble();
        scan.nextLine();
        System.out.println("Podaj imię");
        String imie1 = scan.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko1 = scan.nextLine();
        System.out.println("Podaj wypłate");
        double wyplata1 = scan.nextDouble();



        emp[0] = new Employee(imie,nazwisko,wyplata);
        emp[1] = new Employee(imie1,nazwisko1,wyplata1);

        double suma = emp[0].getWyplata() + emp[1].getWyplata();
        System.out.println(emp[0].getWyplata() + "+" + emp[1].getWyplata()+ "+" + "=" + suma);

    }


}

