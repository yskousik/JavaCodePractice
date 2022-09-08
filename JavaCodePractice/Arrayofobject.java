class Student{
    public int rollno;
    public String name;
    Student(int rollno , String name){
        this.rollno = rollno;
        this.name = name;
    }
}

public class Arrayofobject {
    public static void main(String args[]){
    
    Student arr[] = new Student [3];
    arr[0] = new Student(12, "Kousik");
    arr[1] = new Student(17, "Arpita");
    arr[2] = new Student(11, "Topu");
    for(int i=0; i< arr.length; i++){
        System.out.println("Element at " + i +" index is : RollNo: "+ arr[i].rollno +" Name: "+ arr[i].name);
    }

   }
}
