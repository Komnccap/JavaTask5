import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int sizeCount = 0, index = 0, index2 = 0;
        Random rand = new Random();
        long tNum = rand.nextInt(800000000, 899999999);
        String[] people = {"Иван Иванов", "Светлана Петрова", "Кристина Белова","Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова","Мария Савина","Мария Рыкова",
                "Марина Лугова", "Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};
        Map<String, Long> tb = new HashMap<>();
        while(sizeCount != people.length){
            tb.put(people[index],tNum);
            sizeCount++;
            index++;
        }
        System.out.println(tb);

        // Вывод только имён
        ArrayList<String> onlynames = new ArrayList<>();
        for (int i = 0; i < tb.size(); i++) {
            String buff = tb.toString();
            String[] names = buff.split(" ");
            onlynames.add(names[index2]);
            index2 += 2;

        }
        System.out.println(onlynames);

        Map<String, Integer> counter = new HashMap<>();
        for(String x : onlynames){
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }
        System.out.println(counter);
        counter.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);


    }
}
