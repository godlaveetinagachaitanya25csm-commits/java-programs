public class hostelroombooking{
    void hostel(int hostelroomnumber){
        System.out.println("hostelroom  details:");
        System.out.println("hostelroomnumber:" + hostelroomnumber);

    }
    void hostel(int hostelroomnumber,String studentname){
        System.out.println("hostelroom  details:");
        System.out.println("hostelroomnumber" + hostelroomnumber);
        System.out.println("studentname"+studentname);
    }
   void hostel(int hostelroomnumber,String studentname, int numberofdays){
        System.out.println("hostelroom  details:");
        System.out.println("hostelroomnumber" + hostelroomnumber);
        System.out.println("studentname"+studentname);
        System.out.println("numberofdays" + numberofdays);
    }
    public static void main(String[] args) {
        hostelroombooking h = new hostelroombooking();
        h.hostel(304);
       

        h.hostel(304 ,"chaitanya");
        h.hostel(304 ,"chaitanya", 100);

    }

}


 