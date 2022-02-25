public class 1st_problem {
    public static void main(String[] args) {

    }
}

class Person {
    private String name;
    private String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String toString() {
        return "Person[ name = " + this.name + ", address = " + this.address + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String newProgram) {
        this.program = newProgram;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double newFee) {
        this.fee = newFee;
    }

    @Override
    public String toString() {
        return "Student[ Person[ name = " + this.getName() + ", address = " + this.getAddress() + "], program = " + this.program + ", year = " 
        + this.year + ", fee = " + this.fee + "]";
    }
}

class Stuff extends Person {
    private String school;
    private double pay;

    Stuff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double Pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[ Person[ name = " + this.getName() + ", address = " + this.getAddress() + "], school = " + this.school + ", pay = " + this.pay + "]";
    }
}