public class MonthSalary {
    public static void main(String[] args) {
        double factor, year, monthyfactor;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter factor:");
        factor = sc.nextDouble();
        System.out.println("Enter year:");
        year = sc.nextDouble();
        monthyfactor = factor * 4000000 + year * 500000;
        if(factor<=1)System.out.println("Re-Enter");
        else if (factor<=5) System.out.println("Monthy Factor:" +monthyfactor);
        else
            System.out.println("Re-Enter");
    }
}
