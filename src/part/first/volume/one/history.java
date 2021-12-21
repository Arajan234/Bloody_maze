package part.first.volume.one;

import java.util.Scanner;

public class history {
    void chest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("пройдя дальше, один из членов команды увидил сундук и решил его открыть \n" +
                "1-Остановить его\n" +
                "2-Продолжить свой путь\n" +
                "3-Открыть вместе");
        byte s1 = scanner.nextByte();

        if (s1 == 1) {
            naughty();
        }

        if (s1 == 2) {
            cast();
        }

        if (s1 == 3) {
            self();
        }


    }
    void naughty(){
        System.out.println("Он не послушал вас и открыл сундук");
        ending ending = new ending();
        ending.chest();
    }
    void cast(){
        System.out.println("Продолжив свой путь, вы заметили, что одного из команды не хватает");
        ending ending = new ending();
        ending.chest();
    }
    void self(){
        System.out.println("Открыв сундук, там ничего не оказалась");
        ending ending = new ending();
        ending.chest();
    }


}
