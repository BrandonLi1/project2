import java.util.Scanner;




public class LinearEquationLogic {


    private String equation;
    private LinearEquation LinearEquation;
    private Scanner scan;




    public LinearEquationLogic() {
        scan = new Scanner(System.in);
    }


    private double getX(){
        System.out.print("Enter an x value: ");
        double x = scan.nextDouble();
        scan.nextLine();
        return x;
    }


    public void start() {
        System.out.print("Enter coordinate 1: ");
        String c1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String c2 = scan.nextLine();
        int x1 = Integer.parseInt(c1.substring(1, c1.indexOf(",")));
        int y1 = Integer.parseInt(c1.substring(c1.indexOf(",")+2, c1.indexOf(")")));
        int x2 = Integer.parseInt(c2.substring(1, c2.indexOf(",")));
        int y2 = Integer.parseInt(c2.substring(c2.indexOf(",")+2, c2.indexOf(")")));
        LinearEquation equation = new LinearEquation(x1 , y1, x2, y2);
        if (x1==x2) {
            System.out.println(equation.equation());
        } else {
            System.out.println(equation.lineInfo());
            System.out.println(equation.coordinateForX(getX()));
        }
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String answer = scan.nextLine();
        if (answer.equals("y")) {
            start();
        } else {
            System.out.println("Thank you for using the slope calculator, goodbye!");
        }
    }
}
