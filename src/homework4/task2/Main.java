package homework4.task2;

public class Main {
    public static void main(String[] args) {
        PrintArray printArr = new PrintArray();

        String[] arrString = {"Hello", "World"};
        Integer[] arrInt = {5, 10, 15, 20, 25, 30};

        printArr.printArray(arrString);
        printArr.printArray(arrInt);
    }
}
