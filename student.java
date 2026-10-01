class student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        
        Student student1 = new Student();
        Student student2 = new Student();

     
        student1.name = "Rahul";
        student1.age = 20;

    
        student2.name = "Priya";
        student2.age = 21;
        student1.display();
        student2.display();
    }
}