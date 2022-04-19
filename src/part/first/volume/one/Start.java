package part.first.volume.one;

import java.util.Scanner;

public class Start {

        void vxodVLabitint () {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы должны найти в лаберинте книгу.С вами отправится 4 друга.\n" +
                "\n" +
                "На входе в лабиринт был старый дед, который проведёт вас до книги\n" +
                "\n" +
                "Пройдя чуть дальше, вы встретили проход, который перекрывает вам паутина //1\n" +
                "1-Убрать паутину \n" +
                "2-Осмотреть её ");


        int s1 = scanner.nextInt();

            if (s1 == 1 ) {
                uborkaPutini();
            }
            if (s1 == 2){
                OsmotrPautini();
        }else {
            System.out.println("Такокго варианта нет");
            vxodVLabitint();
        }


    }

        void uborkaPutini () {
        System.out.println("Убирая паутину, одного из команды укусили ");
        Council council = new Council();
        council.GrandfatherAdvice();
    }
        void OsmotrPautini () {
        System.out.println("Осматривая паутину, одного из команды укусили");
        Council council = new Council();
        council.GrandfatherAdvice();
    } }






