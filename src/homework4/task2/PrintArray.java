package homework4.task2;

public class PrintArray {
    public <S> void printArray(S[] list) {
        for (S item : list) {
            System.out.println(item);
        }
    }
}
