package exercicios.composicao.exemplo.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicios.composicao.exemplo.entities.Department;
import exercicios.composicao.exemplo.entities.HourContract;
import exercicios.composicao.exemplo.entities.Worker;
import exercicios.composicao.exemplo.entities.enums.WorkerLevel;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scan.nextLine();

        System.out.println("Enter work data");
        System.out.print("Name: ");
        String workerName = scan.nextLine();
        System.out.print("Level: ");
        String workerLevel = scan.nextLine();
        System.out.print("Base salary: ");
        Double workerBaseSalary = scan.nextDouble();
        System.out.println();

        Worker worker = new Worker(
                workerName,
                WorkerLevel.valueOf(workerLevel),
                workerBaseSalary,
                new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = scan.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            Double value = scan.nextDouble();
            System.out.print("Duration in hours: ");
            int duration = scan.nextInt();
            System.out.println();

            HourContract contract = new HourContract(date, value, duration);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println(
                "Income for "
                + monthAndYear
                + ": "
                + String.format("%.2f", worker.income(year, month)));

        scan.close();
    }
}
