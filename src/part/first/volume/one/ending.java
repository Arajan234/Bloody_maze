package part.first.volume.one;

import java.util.Scanner;

public class ending {
    void chest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На вашу команду покатился огромный валун \n" +
                "1-Спрятаться в ближайшее место\n" +
                "2-Бежать дальше");
        byte s1 = scanner.nextByte();

        if (s1 == 1) {
            naughty();
        }

        if (s1 == 2) {
            escape();
        }

    }
    void naughty(){
        System.out.println("Один из членов команды пробежал в страхе дальше и его придавило валуном. Стоит проститься с погибшими ");
    }
    void escape(){
        System.out.println("Пробежав дальше, вы нашли ближайшее укрытие, но один из членов команды не успел и его придавило валуном. Стоит проститься с погибшими ");
    }


}
