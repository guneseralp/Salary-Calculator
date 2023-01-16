public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double salaryRaise;


    Employee(String name, double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax(){
        if(this.salary < 1000){
            System.out.println("Maaşınıza vergi uygulanmaycaktır.");
            System.out.println("----------------------");
        }
        if(this.salary > 1000){
            tax = this.salary * 0.03;
        }
        System.out.println("Tax: " + tax);
    }
    void bonus(){
        if(this.workHours < 40){
            System.out.println("Ekstra ödeme alamazsınız.");
        }else{
            int extraHour = this.workHours % 40;
            bonus = extraHour * 30;
        }
        System.out.println("Bonus: " + bonus);
    }
    void raiseSalary(){
        if((2022 - this.hireYear) < 10 ){
            salaryRaise = this.salary * 0.05;
        }
        else if((2022 - this.hireYear) > 9 && (2022 - this.hireYear) < 20){
            salaryRaise = this.salary * 0.1;
        }
        else if ((2022 - this.hireYear) > 19){
            salaryRaise = this.salary * 0.15;
        }
        System.out.println("Salary Raise: " + salaryRaise);
        System.out.println("Your salary with Bonus and Tax: " + ((this.bonus - this.tax) + this.salary));
        System.out.println("Summerized Salary: " + ((this.bonus - this.tax) + this.salaryRaise + this.salary));
    }
    void printEmployee(){   // Metodun adına toString demek yerine printEmployee yazıldı.
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("Employee Work Hours In A Week: " + this.workHours);
        System.out.println("Employee Hire Year: " + this.hireYear);
    }
}
