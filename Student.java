class Student {
    int rollno;
    int age;
    String name;
    Student(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

}
class AgeComparator extends Student
{

    AgeComparator(int rollno, String name, int age) {
        super(rollno, name, age);
    }
}
