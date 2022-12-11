import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Сколько ноутбуков вывести?");
        int quantity = scan.nextInt();
        for (int i = 0; i < quantity ; i++) {
            System.out.printf("Ноутбук №%d \n", count + 1);
            notebookClass nb = new notebookClass();
            HashSet<notebookClass> myNotebookSet = new HashSet<>();
            myNotebookSet.add(nb);
            count++;
            for (notebookClass notebookClass : myNotebookSet) {
                notebookClass.nbList();
            }
        }
        System.out.println("Хотите сделать фильтрацию? 1-ДА 2-НЕТ");
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("По каким критериям хоите отфильтровать? 1-Цвет, 2-ОЗУ, 3-ОС, 4- объём ЖД");
            answer = scan.nextInt();
            if (answer == 1){
                HashSet<notebookClass> myNotebookSet = new HashSet<>();
                for (notebookClass notebookClass : myNotebookSet) {
                    notebookClass.filterListColor();
                    notebookClass.parColour.equals("white");
                }
            }
            else if (answer == 2) {

            }
            else if (answer == 3){

            }
            else if (answer == 4){

            }
            else {
                System.out.println("Введено некорректное значение");
            }

        }
        else {
            System.out.println("Завершение программы11111");
        }
    }
}