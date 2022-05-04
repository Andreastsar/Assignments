package TestPackage;

 class LearnProtected {
     protected String fname = "Antonis";
     protected String lname = "Thodos";
     protected int age = 36;

 }

 class Teacher extends LearnProtected {
     private int teachingYears = 5;

     public static void main(String[] args) {
         Teacher myTeacher = new Teacher();

         System.out.println("Name: " + myTeacher.fname + " " + myTeacher.lname);
         System.out.println("Teach Years: " + myTeacher.teachingYears);
     }//end of main
 }// end of teacher
