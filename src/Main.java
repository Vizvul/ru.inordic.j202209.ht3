import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        float af;
        boolean ab = true;

        int b;
        float bf;
        boolean bb = false;

        int result = 0;
        boolean testOperetion = true;
        int operations;

        String[] resultMassiv = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 5; ) {

            System.out.println("Введите код операции (0 - математические, 1 - логические, 2 - побитовые, 3 - операции сдвига, 4 - работы с float(только математические), 5 - boolean, другое число прирывает работу программы");
            operations = sc.nextInt();
            // выбран математический
            if (operations == 0) {
                System.out.println("Введите первое число: ");
                a = sc.nextInt();
                System.out.println("Введите второе число: ");
                b = sc.nextInt();
                System.out.println("Введите код операции (0 - сумма, 1 - разность, 2 - произведение, 3 - деление, любое другое значение выйти");
                operations = sc.nextInt();
                for (int z = 0; z < 1; ) {
                    if (b == 0 && operations == 3) {
                        System.out.println("Значение делителя не может быть = 0, введите второе значение повторно");
                        System.out.println("Введите делитель: ");
                        b = sc.nextInt();
                    } else {
                        z = 1;
                    }
                }
                if (operations >= 0 && operations < 4) {
                    result = LassonMath.lassonMath(a, b, operations);
                } else {
                    j++;
                    testOperetion = false;
                }
                // Логические операции
            } else if (operations == 1) {
                System.out.println("Введите первое число: ");
                a = sc.nextInt();
                System.out.println("Введите второе число: ");
                b = sc.nextInt();
                resultMassiv[j] = LassonLogical.lassonLogical(a, b);
                System.out.println("Результат: ");
                System.out.println(resultMassiv[j]);
                testOperetion = false;
                j++;
                // Побитовые операции
            } else if (operations == 2) {
                System.out.println("Выберите операцию: 0 - побитовый оператор “НЕ”, 1 - побитовый оператор “И”, 2 - побитовое “ИЛИ”, 3 - побитовое исключающее “ИЛИ”, любое другое число войти заново");
                operations = sc.nextInt();
                if (operations == 0) {
                System.out.println("Введите число: ");
                a = sc.nextInt();
                resultMassiv[j] = LassonPobit.lassonPobit(a);

                System.out.println(resultMassiv[j]);
                testOperetion = false;
                j++;
                } else if (operations < 4 && operations > 0) {
                    System.out.println("Введите число: ");
                    a = sc.nextInt();
                    System.out.println("Введите число: ");
                    b = sc.nextInt();
                    resultMassiv[j] = LassonPobit.lassonPobit(a, b, operations);
                    System.out.println("Результат: ");
                    System.out.println(resultMassiv[j]);
                    testOperetion = false;
                    j++;
                } else {
                    testOperetion = false;
                    j++;
                }
                // Операции сдвига
            } else if (operations == 3) {
                System.out.println("Введите число: ");
                a = sc.nextInt();
                System.out.println("на сколько будем двигатся?");
                b = sc.nextInt();
                System.out.println("Куда будем двигатся: 0 - лево, 1 - право:");
                operations = sc.nextInt();
                if (operations == 1 || operations == 0) {
                    result = LessonDvig.lessonDvig(a,b,operations);
                } else {
                    testOperetion = false;
                    j++;
                }
                // Операция работы с float математические
            } else if (operations == 4) {
                System.out.println("Введите первое число float: ");
                af = sc.nextFloat();
                System.out.println("Введите второе число float: ");
                bf = sc.nextFloat();
                System.out.println("Введите код операции (0 - сумма, 1 - разность, 2 - произведение, 3 - деление, любое число запустить программу снова");
                operations = sc.nextInt();
                for (int z = 0; z < 1; ) {
                    if (bf == 0 && operations == 3) {
                        System.out.println("Значение делителя не может быть = 0, введите второе значение повторно");
                        System.out.println("Введите делитель: ");
                        bf = sc.nextInt();
                    } else {
                        z = 1;
                    }
                }
                if (operations >= 0 && operations < 4) {
                        System.out.println("Результат: ");
                        resultMassiv[j] = String.valueOf(LassonMath.lassonMath(af, bf, operations));
                        System.out.println(resultMassiv[j]);
                        testOperetion = false;
                        j++;
                    } else {
                        testOperetion = false;
                        j++;
                    } // Операции Boolean
            } else if (operations == 5) {
                for (int q = 0; q < 1; ) {
                System.out.println("Введите первое значение true or false: ");
                String as = sc.next();
                q = 1;
                if (as.equals("true")) {
                    ab = true;
                } else if (as.equals("false")) {
                    ab = false;
                } else {
                    System.out.println("ВВедены не корректные данные - следует ввести true или false");
                    q = 0;
                    }
                }
                for (int q = 0; q < 1; ) {
                System.out.println("Введите второе значение true or false: ");
                String bs = sc.next();
                q = 1;
                    if (bs.equals("true")) {
                        bb = true;
                    } else if (bs.equals("false")) {
                        bb = false;
                    } else {
                        System.out.println("ВВедены не корректные данные - следует ввести true или false");
                        q = 0;
                    }
                }
//                try {
//                    bb =sc.nextBoolean();
//                } catch (Exception npe) {
//                    System.out.println("ВВедены не корректные данные - следует ввести true или false");
//                }
//                System.out.println("Введите второе значение true or false: ");
//                    try {
//                        bb = sc.nextBoolean();
//                    } catch (Exception npe) {
//                        System.out.println("ВВедены не корректные данные - следует ввести true или false");
//                    }
                System.out.println("Введите код операции (0 - И, 1 - ИЛИ, 2 - логическое исключающее ИЛИ, любое другое число выйти из программы");
                operations = sc.nextInt();
                if (operations >= 0 && operations <= 2) {
                    System.out.println("Результат: ");
                    resultMassiv[j] = String.valueOf(LassonLogical.lassonLogical(ab, bb, operations));
                    System.out.println(resultMassiv[j]);
                    testOperetion = false;
                    j++;
                } else {
                    testOperetion = false;
                    j++;
                }
            } else {
                testOperetion = false;
                j = 5;
            }
            if (testOperetion) {
                System.out.println("Результат: ");
                System.out.println(result);
                resultMassiv[j] = String.valueOf(result);
                j++;
            }
        }
        for (int k = 0; k < resultMassiv.length; k++) {
            System.out.println("Посмотреть результаты работы программы? 0 - NO / 1 - YES");
            int chus = sc.nextInt();
            if (chus == 1) {
                System.out.println("Какой элемент показать? 1-5 - элемент, 0 - показать все, любой другой ввод выход из программы");
                chus = sc.nextInt();
                if (chus > 0 && chus < 6) {
                    System.out.println("Результат: ");
                    System.out.println(resultMassiv[chus - 1]);
                } else if (chus == 0) {
                    for (int f = 0; f < resultMassiv.length; f++) {
                        System.out.println((f + 1) + " результат = " + resultMassiv[f]);
                    }
                } else {
                    k = resultMassiv.length;
                }
            } else {
                k = resultMassiv.length;
            }
        }
    }
}
