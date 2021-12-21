package part.first.volume.one;

import java.util.Scanner;

public class interchange {


    void beginning(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Укусанный напал на деда\n" +
                "1-Убить укусанного\n" +
                "2-Не трогать и связать");

        byte s1 = scanner.nextByte();

        if (s1 == 1) {
            Inspection();
        }

        if (s1 == 2) {
            Ignore();
        }

    }

    void Inspection(){
        System.out.println("Убив укусанного, вы потеряли друга и деда. Стоит проститься с погибшими." );
        history history = new history();
        history.chest();
    }
    void Ignore(){
        System.out.println("Связав его, вы потеряли деда \n" +
                "\n" +
                "Пройдя чуть дальше, вы заметили, что верёвка, которой вы связали друга, просто валяется\n" +
                "\n" +
                "Сзади одного из друзей оказался заражённый, и он пронзил его мечом .Придётся убить друга, так как он может убить ещё больше людей");
    }
}
