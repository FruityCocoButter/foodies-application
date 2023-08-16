
public class Staff extends Customer {

    String staff_number;

    public Staff(String name, String Surname,String staff_number){

        super(name, Surname);
        this.staff_number=staff_number;
    }

    String getStaff_number(){

        return staff_number;
    }
    
    boolean equals(Staff staff){
   
      return super.equals(staff) && staff.getStaff_number().equals(staff_number);
      
   }
    
    public String toString(){
    
      return super.toString() +" "+ staff_number;
    }


}
