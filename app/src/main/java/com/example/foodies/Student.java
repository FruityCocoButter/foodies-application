public class Student extends Customer{
   
   String student_number;
   private int peoplesoft_number;
   
   public Student(String name, String Surname, String st_number){
      
      super(name,Surname);
      student_number = st_number;
      
   }
   
   String getStudentNumber(){
      
      return student_number;
      
   }
   
   boolean equals(Student student){
   
      return super.equals(student) && student.getStudentNumber().equals(student_number);
      
   }
   
   public String toString(){
      
      return super.toString()+" "+student_number;
   }
}