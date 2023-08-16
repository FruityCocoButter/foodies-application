import java.util.Arrays;

class Menu{
   
   MenuItem[][] items;  
      
   public Menu(MenuItem[][] items){
      
      this.items = items;
   } 
   
   void removeItem(){
   
   }
   
   void addItem(){}
   
   void addCategory(){}
   
   void displayMenu(){
      
      StringBuilder menuString = new StringBuilder();

      for (int i=0;i<items.length;i++){
        for (int j=0; j<items[i].length;j++){
        
            menuString.append(Arrays.deepToString(items[i][j].toString())+" ");
        }
      }
      
      System.out.println(menuString.toString());
   }
   
}