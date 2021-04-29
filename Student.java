class Student{
String name;
String qualification;
String address;
int age;

void display()
{
System.out.println(name+" is "+age+" years old "+ " completed "+ qualification+" in "+address+"...!!");
}

public static void main(String[] args){

Student Aishwarya= new Student();
Aishwarya.name=" Aishwarya";
Aishwarya.age=21;
Aishwarya.qualification="Engineering";
Aishwarya.address="Tumkur";
Aishwarya.display();

Student Vaishnavi= new Student();
Vaishnavi.name=" Vaishnavi";
Vaishnavi.age=22;
Vaishnavi.qualification="Engineering";
Vaishnavi.address="Ballari";
Vaishnavi.display();

Student Girija= new Student();
Girija.name=" Girija";
Girija.age=22;
Girija.qualification="Engineering";
Girija.address="Davanagere";
Girija.display();

Student Sunil= new Student();
Sunil.name=" Sunil";
Sunil.age=24;
Sunil.qualification="Engineering";
Sunil.address="Banglore";
Sunil.display();

Student Harshitha= new Student();
Harshitha.name=" Harshitha";
Harshitha.age=21;
Harshitha.qualification="Engineering";
Harshitha.address="Chickballapur";
Harshitha.display();

}

}