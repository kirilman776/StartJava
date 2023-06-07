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


    }
}