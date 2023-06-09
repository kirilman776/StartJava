public class VariablesTheme {   

    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера.");
        byte core = 3;
        short ram = 4096;
        int ssd = 512000;
        long  frequency = 3200000000L;
        float screensize = 17.3F;
        double weight = 2.66;
        char os = 'W';
        boolean russiankeybord = true;
        System.out.println("Количество ядер: " + core);
        System.out.println("Оперативная память, Мб: " + ram);
        System.out.println("Долговременная память, Мб: " + ssd);
        System.out.println("Частота процессора, Гц: " + frequency);
        System.out.println("Диагональ монитора, Дм: " + screensize);
        System.out.println("Вес, Кг: " + weight);
        System.out.println("Операционная система: " + os);
        System.out.println("Русская клавиатура: " + russiankeybord);

        System.out.println("\n2.Расчет стоимости товара со скидкой.");
        short pen = 100;
        short pencil = 200;
        float discount = 0.11F;
        System.out.println("Общая стоимость товаров без скидки = " + (pen + pencil));
        System.out.println("Cумма скидки = " + ((pen + pencil)*discount));
        System.out.println("Общая стоимость товаров со скидкой = " + ((pen + pencil)*(1 - discount)));

        System.out.println("\n3.Вывод слова JAVA.");
        System.out.println("   J    a  v     v  a   ");                                                  
        System.out.println("   J   a a  v   v  a a  ");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa ");                                                
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов.");
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long ln = 9223372036854775807L;
        System.out.println("Максимальное начение byte = " + b +", увеличенное на 1 = " + (b++) + ", уменьшенное на 1 = " + (b--));
        System.out.println("Максимальное начение short = " + s +", увеличенное на 1 = " + (s++) + ", уменьшенное на 1 = " + (s--));
        System.out.println("Максимальное начение int = " + i +", увеличенное на 1 = " + (i++) + ", уменьшенное на 1 = " + (i--));
        System.out.println("Максимальное начение long = " + ln +", увеличенное на 1 = " + (ln++) + ", уменьшенное на 1 = " + (ln--));

        System.out.println("\n5.Перестановка значений переменных.");
        int num1 = 2;
        int num2 = 5;
        System.out.println("I.C помощью третьей переменной. Исходные значения " + num1 + ", " + num2); 
        int num3 = num1;
        num1 = num2;
        num2 = num3;    
        System.out.println("Значения после перестановки " + num1 + ", " + num2);
        System.out.println("II.C помощью арифметических операций. Исходные значения " + num1 + ", " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Значения после перестановки " + num1 + ", " + num2);
        System.out.println("III.C помощью побитовой операции. Исходные значения " + num1 + ", " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Значения после перестановки " + num1 + ", " + num2);

        System.out.println("\n6.Вывод символов и их кодов.");
        char c35 = (char) 35;
        char c38 = (char) 38;
        char c64 = (char) 64;
        char c94 = (char) 94;
        char c95 = (char) 95;
        System.out.println(c35 + " " +(int)c35);
        System.out.println(c38 + " " +(int)c38);
        System.out.println(c64 + " " +(int)c64);
        System.out.println(c94 + " " +(int)c94);
        System.out.println(c95 + " " +(int)c95);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка.");
        char ch47 = '/';
        char ch92 = '\\';
        char ch40 = '(';
        char ch41 = ')';
        char ch95 = '_';
        System.out.println("     " + ch47 + ch92 + "     ");
        System.out.println("    " + ch47 + "  " + ch92 + "    ");
        System.out.println("   " + ch47 + ch95 + ch40 + " " + ch41 + ch92 + "  ");
        System.out.println("  " + ch47 + "      " + ch92 + " ");
        System.out.println(" " + ch47 + ch95 + ch95 + ch95 + ch95 +  ch47 + ch92 + ch95 + ch95 + ch92 + " ");

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа.");
        int num = 123;
        System.out.println("Число " + num + " содержит: " + (num/100) + 
                           " сотню," + (num%100/10) + " десятка, " + (num%10) + " единицы.");
        System.out.println("Сумма его цифр = " +((num/100) + (num%100/10) + (num%10)));
        System.out.println("Произведение = " + ((num/100) * (num%100/10) * (num%10)));

        System.out.println("\n9.Вывод времени.");
        int sec = 86399;
        System.out.println(sec/3600 + ":" + sec%3600/60 + ":" + sec%60);
    }
}