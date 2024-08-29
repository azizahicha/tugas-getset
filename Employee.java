//Object class
public class Employee {
    String name;
    double salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*Constructor*/
    public Employee() {
        name = "";
        salary = 0;
    }


        // Constructor parameter
        public Employee(String name, double salary) {
            this.name= name;
            this.salary= salary;
        }


            //Methode
            public void print() {
                System.out.println("name: "+name);
                System.out.println("salary: "+salary);
            }



        
    }

