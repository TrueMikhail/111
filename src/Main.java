import java.time.LocalDate;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {


        System.out.println(getMasterOfOldestViolin(
                new Violin("Stradivary", LocalDate.of(1555,12,6)),
                new Violin("John", LocalDate.of(1655,12,6)),
                new Violin("Max", LocalDate.of(1755,12,6)),
                new Violin("Don", LocalDate.of(1855,12,6)),
                new Violin("Leo", LocalDate.of(1955,12,6))
        ));
    }
    public static String getMasterOfOldestViolin (Violin... violins) {
        PriorityQueue <Violin> queueViolins = new PriorityQueue<>();
        for (Violin violin : violins) {
            queueViolins.add(violin);
        }
        return queueViolins.element().getNameOfMaster();
    }
}