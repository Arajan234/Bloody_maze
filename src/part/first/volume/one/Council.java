package part.first.volume.one;

import java.util.Scanner;

public class Council {


    void GrandfatherAdvice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дед сообщил, что стоит осмотреть укус\n" +
                "1-Осмотреть\n" +
                "2-Проигнорировать просьбу деда");

        byte s1 = scanner.nextByte();
        byte s2 = scanner.nextByte();

        if (s1 == 1) {
            Inspection();
        }else {
            System.out.println("Такокго варианта нет");
            GrandfatherAdvice();
        }

        if (s2 == 2) {
            Ignore();
        }else {
            System.out.println("Такокго варианта нет");
            GrandfatherAdvice();
        }
    }

        void Inspection(){
            System.out.println("Осматривая укус, было замечено, что друг, которого укусили, странно ведёт себя ");
            interchange interchange = new interchange();
            interchange.beginning();
        }
        void Ignore(){
            System.out.println("Странно, что укусанный пауком, странно стал вести себя\n");
            interchange interchange = new interchange();
            interchange.beginning();
        }




}
