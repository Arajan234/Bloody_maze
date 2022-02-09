package part.second.volume.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeFriends {
    Scanner scan = new Scanner(System.in);

    public void theBeginNingOfTheWay() {
        scan = new Scanner(System.in);
        try {
            System.out.println("И вот 3 друга продолжали свой путь. В пути встретили мудрого человека!\n" +
                    "Варианты:\n" +
                    "    1 - пройти мимо\n" +
                    "    2 - поговорить с ним");

            byte a = scan.nextByte();
            if (a == 1) {
                passBy();
            } else if (a == 2) {
                talkToHim();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                theBeginNingOfTheWay();
            }
        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            theBeginNingOfTheWay();
        }
    }

    void passBy() {
        scan = new Scanner(System.in);
        try {
            System.out.println("Они прошли мимо, но Мудрый человек остановил и спросил про книгу.\n" +
                    "Варианты:\n" +
                    "    1 - обмануть\n" +
                    "    2 - искать с ним книгу");
            byte a = scan.nextByte();
            if (a == 1) {
                oneCheat();
            } else if (a == 2) {
                lookForABookWithHim();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                passBy();
            }
        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            passBy();
        }
    }

    void talkToHim() {
        scan = new Scanner(System.in);
        try {
            System.out.println("Они поговорили с ним и оказывется что он тоже ищет тот же книгу\n" +
                    "Варианты:\n" +
                    "    1 - обмануть\n" +
                    "    2 - искать с ним книгу");
            byte a = scan.nextByte();
            if (a == 1) {
                twoCheat();
            } else if (a == 2) {
                lookForABookWithHim();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                talkToHim();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            talkToHim();
        }
    }

    void oneCheat() {
        scan = new Scanner(System.in);
        try {

            System.out.println("Они обманули и не сказали про книгу, и продолжали путь вместе.\n" +
                    "\n" +
                    "3 друга: Как вас зовут и как вы сюда попали?\n" +
                    "\n" +
                    "Мудрый человек: Меня Антон зовут, мы сюда пришли с большой командой," +
                    "но они погибли, остался только я. \n" +
                    "Нас сюда отправили чтобы найти какую ту книгу, я не знаю почему им надо это книга, " +
                    "но если я найду эту книгу и отдам им, они заплатят больше миллион доллоров!\n" +
                    "Здесь много пауков и паутина, " +
                    "если добраться до эту книгу объязательно надо убить хоть 2 паука чтобы открыть паутины.\n" +
                    "А как вы сюда попали?\n" +
                    "Варианты:\n" +
                    "    1 - обмануть\n" +
                    "    2 - сказать правду");
            byte a = scan.nextByte();
            if (a == 1) {
                twoCheat();
            } else if (a == 2) {
                tellTheTruth();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                twoCheat();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            twoCheat();
        }
    }

    void lookForABookWithHim() {
        scan = new Scanner(System.in);
        try {

            System.out.println("они продолжали искать книгу вместо с ним. \n" +
                    "\n" +
                    "3 друга: Как вас зовут и как вы сюда попали?\n" +
                    "\n" +
                    "Мудрый человек: Меня Антон зовут, мы сюда пришли с большой командой,но они погибли, " +
                    "остался только я. \n" +
                    "Нас сюда отправили чтобы найти какую ту книгу," +
                    " я не знаю почему им надо это книга, но если я найду эту книгу и отдам им, " +
                    "они заплатят больше миллион доллоров!\n" +
                    "Здесь много пауков и паутина," +
                    " если добраться до эту книгу объязательно надо убить хоть 2 паука чтобы открыть паутины.\n" +
                    "А как вы сюда попали?\n" +
                    "Варианты:\n" +
                    "    1 - обмануть\n" +
                    "    2 - сказать правду");
            byte a = scan.nextByte();
            if (a == 1) {
                twoCheat();
            } else if (a == 2) {
                tellTheTruth();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                lookForABookWithHim();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            lookForABookWithHim();
        }
    }

    void tellTheTruth() {
        scan = new Scanner(System.in);
        try {

            System.out.println("3 друга: Мы сначала не сказали правду, но хотим честно сказать," +
                    " что мы тоже ищем эту книгу, но хотим вместе искать книгу если вы не против.\n" +
                    "\n" +
                    "Антон: Я не против, но предупреждаю что здесь очень опасно.\n" +
                    "\n" +
                    "Они продолжили путь и встретили три дырки, в двух сидят пауки, а третий покрыт паутиной," +
                    " если открыть дыру покрытую паутиной, придется убить обоих пауков.\n" +
                    "Они вошли в первую дырку и увидели паука.\n" +
                    "       Выбор: как убить паука\n" +
                    "Если все подайдут, паук может навредить обоим, а если подайдут двое," +
                    " он может навредить одному.\n" +
                    "Варианты:\n" +
                    "    1 - подходят все \n" +
                    "    2 - подходят двое");
            byte a = scan.nextByte();
            if (a == 1) {
                oneAllFit();
            } else if (a == 2) {
                secondTwoFit();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                tellTheTruth();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            tellTheTruth();
        }
    }

    void twoCheat() {
        scan = new Scanner(System.in);
        try {

            System.out.println("3 друга: Мы туристы, мы сюда пришли снимать этот лабиринт и потерялись. " +
                    "Но мы можем помочь вас найти книгу и так интереснее будет, если конечно вы не против!\n" +
                    "\n" +
                    "Антон: Я не против, но предупреждаю что здесь очень опасно.\n" +
                    "\n" +
                    "Они продолжили путь и встретили три дырки, в двух сидят пауки," +
                    " а третий покрыт паутиной, если открыть дыру покрытую паутиной," +
                    " придется убить обоих пауков.\n" +
                    "Они вошли в первую дырку и увидели паука\n" +
                    "       Выбор: как убить паука\n" +
                    "Если все подайдут, паук может навредить обоим, а если подайдут двое," +
                    " он может навредить одному\n" +
                    "Варианты:\n" +
                    "    1 - подходят все \n" +
                    "    2 - подходят двое");
            byte a = scan.nextByte();
            if (a == 1) {
                oneAllFit();
            } else if (a == 2) {
                secondTwoFit();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                twoCheat();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            twoCheat();
        }
    }

    void oneAllFit() {
        scan = new Scanner(System.in);
        try {

            System.out.println("Походили все, убили паука и все остались живы.\n" +
                    "Вошли вторую дырку\n" +
                    "    1 - подходят все\n" +
                    "    2 - подходят двое");
            byte a = scan.nextByte();
            if (a == 1) {
                thirdAllFit();
            } else if (a == 2) {
                thirdTwoFit();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                oneAllFit();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            oneAllFit();
        }
    }

    void secondTwoFit() {
        scan = new Scanner(System.in);
        try {

            System.out.println("Подходили двое, убили паука, но потеряли друга\n" +
                    "Вошли вторую дырку\n" +
                    "    1 - подходят все\n" +
                    "    2 - подходят двое");
            byte a = scan.nextByte();
            if (a == 1) {
                thirdAllFit();
            } else if (a == 2) {
                thirdTwoFit();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                secondTwoFit();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            secondTwoFit();
        }
    }

    void thirdAllFit() {
        scan = new Scanner(System.in);
        try {

            System.out.println("Подходили все убили паука но потеряли уже 2 друга.\n" +
                    "\n" +
                    "Выжил только главный герой и мудрый человек. " +
                    "Они вышли из дырки и увидели что паутина открывается." +
                    " Они прошли через эту дыру и нашли книгу. Но книга нужна была и мудр-\n" +
                    "рому человеку. Либо его следует убить и забрать книгу, либо оставить его за деньгами," +
                    " или просто уйти оттуда без книги, но в таком случае задания не будет выполнено и\n" +
                    "смерть друзей будет бессмысленной.\n" +
                    "Главный герой: А если я скажу всю правду? " +
                    "Может он быть добрым и вернет мне эту книгу и мы останемся хорошими друзьями.\n" +
                    "Варианты:\n" +
                    "    1 - убить мудрого человека и взять книгу\n" +
                    "    2 - Рассказать всю правду");
            byte a = scan.nextByte();
            if (a == 1) {
                killAWiseManAndTakeABook();
            } else if (a == 2) {
                tellTheWholeTruth();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                thirdAllFit();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            thirdAllFit();
        }
    }

    void thirdTwoFit() {
        scan = new Scanner(System.in);
        try {

            System.out.println("подходили двое, убили паука и потеряли еще друга\n" +
                    "Выжил только главный герой и мудрый человек. Они вышли из дырки и увидели" +
                    " что паутина открывается. " +
                    "Они прошли через эту дыру и нашли книгу. Но книга нужна была и мудр-\n" +
                    "рому человеку. Либо его следует убить и забрать книгу, либо оставить его за деньгами, " +
                    "или просто уйти оттуда без книги, но в таком случае задания не будет выполнено и\n" +
                    "смерть друзей будет бессмысленной.\n" +
                    "Главный герой: А если я скажу правду? " +
                    "Может он быть добрым и вернет мне эту книгу и мы останемся хорошими друзьями.\n" +
                    "Варианты:\n" +
                    "    1 - убить мудрого человека и взять книгу\n" +
                    "    2 - Рассказать всю правду");
            byte a = scan.nextByte();
            if (a == 1) {
                killAWiseManAndTakeABook();
            } else if (a == 2) {
                tellTheWholeTruth();
            } else {
                System.out.println("Такого варианта нет, выбери один из вариантов");
                thirdTwoFit();
            }

        } catch (InputMismatchException e) {
            System.out.println("Такого варианта нет, выбери один из вариантов");
            thirdTwoFit();
        }
    }

    void killAWiseManAndTakeABook() {
        System.out.println("Главный герой убил Мудрого человека и забрал книгу и спокойно вышел из лабиринта.");
    }

    void tellTheWholeTruth() {
        System.out.println("Главный герой рассказал всю правду. И потому что он был мудрым и добрым," +
                " он вернул книгу и они спокойно вышли из лабиринта и стали друзьями.\n");
    }
}