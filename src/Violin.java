import java.time.LocalDate;

public class Violin implements Comparable<Violin> {
    private String nameOfMaster;
    private LocalDate producingDate;

    public Violin(String nameOfMaster, LocalDate producingDate) {
        this.nameOfMaster = nameOfMaster;
        this.producingDate = producingDate;
    }

    public String getNameOfMaster() {
        return nameOfMaster;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "nameOfMaster='" + nameOfMaster + '\'' +
                ", producingDate=" + producingDate +
                '}';
    }

    @Override
    public int compareTo(Violin o) {
        return producingDate.compareTo(o.producingDate);
    }
}
