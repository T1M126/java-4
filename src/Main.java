import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 76;
        double height = 1.67;
        int bmi = service.calculate(weight, height);

        System.out.println(bmi);
    }
}