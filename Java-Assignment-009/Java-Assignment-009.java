import java.util.Scanner;

class basicCal {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

class Scientific extends basicCal {
    int square(int a) {
        return (int) Math.pow(a, 2);
    }

    int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

}

class calculator {
    public static void main(String[] args) {
        System.out.println("Enter which process you want to do");
        System.out.println("Enter 1 to add two numbers");
        System.out.println("Enter 2 to subract two numbers");
        System.out.println("Enter 3 to multiply two numbers");
        System.out.println("Enter 4 to divide two numbers");
        System.out.println("Enter 5 to square two numbers");
        System.out.println("Enter 6 to sqrt two numbers");
        System.out.println("Enter 7 to power the two numbers");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int given = input.nextInt();
        Scientific objScientific = new Scientific();

        int firstNumber = 0;
        int secondNumber = 0;

        if ( (given == 1) || (given == 2) || (given == 3) || (given == 4) || (given == 7) ) {

            System.out.println("Enter the first number you want");
            firstNumber = input.nextInt();
            System.out.println("Enter the second number you want");
            secondNumber = input.nextInt();
        }
        else if ( (given == 5) || (given == 6) ) {
            System.out.println("Enter the number you want");
            firstNumber = input.nextInt();
        }

        switch (given) {
            case 1:
                System.out.println("The sum of the numbers is: ");
                System.out.println(objScientific.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("The subraction of the numbers is: ");
                System.out.println(objScientific.sub(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("The multiple of the numbers is: ");
                System.out.println(objScientific.mul(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("The division of the numbers is: ");
                System.out.println(objScientific.div(firstNumber, secondNumber));
                break;
            case 5:
                System.out.println("The square of the numbers is: ");
                System.out.println(objScientific.square(firstNumber));
                break;
            case 6:
                System.out.println("The square root of the numbers is: ");
                System.out.println(objScientific.sqrt(firstNumber));
                break;
            case 7:
                System.out.println("The power of the numbers is: ");
                System.out.println(objScientific.power(firstNumber, secondNumber));
                break;                        
            default:
                System.out.println("Enter the correct Number");
                break;
        }
    }
}


class shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class rectangle extends shape{
    void printRec() {
        System.out.println("This is Rectangle");
    }
}

class circle extends shape {
    void printCir() {
        System.out.println("This is circle");
    }
}

class square extends rectangle {
    public static void main(String[] args) {
        square objSquare = new square();
        objSquare.printSquare();
        objSquare.printRec();
    }

    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

class Member {
    String name ;
    int age ;
    int salary ;
    int phoneNumber ;
    String address ;

    void printDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(phoneNumber);
        System.out.println(address);
    }
}

class Employee extends Member {
    void set() {
        Scanner Empinput = new Scanner(System.in);
        Member objMember = new Member();

        String Special = "";

        System.out.println("Enter the Employee name");
        objMember.name = Empinput.nextLine();
        System.out.println("Enter the Employee Age");
        objMember.age = Empinput.nextInt();
        System.out.println("Enter the Employee Salary");
        objMember.salary = Empinput.nextInt();
        System.out.println("Enter the Employee Phone number");
        objMember.phoneNumber = Empinput.nextInt();
        Empinput.nextLine();
        System.out.println("Enter the Employee Address");
        objMember.address = Empinput.nextLine();
        System.out.println("Enter the Employee Specialization");
        Special = Empinput.nextLine();

        objMember.printDetails();
        getMethod(Special);
    }

    void getMethod(String special) {
        System.out.println(special);
    }
}

class Manager extends Member{
    void set() {
        Scanner ManInput = new Scanner(System.in);
        Member obj1Member = new Member();

        String Department = "";

        System.out.println("Enter the Manager Name");
        obj1Member.name = ManInput.nextLine();
        System.out.println("Enter the Manager Age");
        obj1Member.age = ManInput.nextInt();
        System.out.println("Enter the Manager Salary");
        obj1Member.salary = ManInput.nextInt();
        System.out.println("Enter the Manager Phone Number");
        obj1Member.phoneNumber = ManInput.nextInt();
        ManInput.nextLine();
        System.out.println("Enter the Manager address");
        obj1Member.address = ManInput.nextLine();
        System.out.println("Enter the Manager Department");
        Department = ManInput.nextLine();

        obj1Member.printDetails();
        getMethod(Department);
    }

    void getMethod(String Depart) {
        System.out.println(Depart);
    }
}

class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.set();

        Manager obj2 = new Manager();
        obj2.set();
    }
}


