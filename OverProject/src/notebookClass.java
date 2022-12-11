import java.util.Random;

public class notebookClass {
    int parId, parOZU,  parHD;
    String parOS, parColour;
    int[] parOperationMemory = new int[] {6, 8, 12, 16, 18, 24};
    int[] parHDVolume = new int[] {500, 1500, 2000, 4000};
    String[] parOperationSystem = new String[] {"Windows", "Linux", "Ubuntu"};
    String[] parColours = new String[] {"Black", "White", "Silver"};
    public notebookClass() {
        Random rand = new Random();
        int argId = rand.nextInt(10000,90000);
        parId = argId;
        parColour = parColours[rand.nextInt(parColours.length)];
        parOS = parOperationSystem[rand.nextInt(parOperationSystem.length)];
        parHD = parHDVolume[rand.nextInt(parHDVolume.length)];
        parOZU = parOperationMemory[rand.nextInt(parOperationMemory.length)];
    }
    public void nbList() {
        System.out.printf("ID ноутбука: %d \n", parId);
        System.out.printf("Операционная система %s \n", parOS);
        System.out.printf("Колличество оперативной памяти: %d ГБ \n", parOZU);
        System.out.printf("объём ЖД: %d ГБ \n", parHD);
        System.out.printf("Цвет ноутбука: %s \n", parColour);
        System.out.println(" ");
    }
    public void filterListColor() {

    }
}
