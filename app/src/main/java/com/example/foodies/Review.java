class Review{
   
  int service_rating;
  int cleaniliness_rating;
  int waiting_rating;
  int food_quality;
  int affordability;
  String comment; 
   
  public Review(int service,int cleaniliness, int waiting, int food_quality,int affordability){
   
      service_rating = service;
      cleaniliness_rating = cleaniliness;
      waiting_rating = waiting;
      this.food_quality = food_quality;
      this.affordability = affordability;
  } 
  
  void addComment(String comment){
   
      this.comment= comment;
  }
  
  
  String displayReview() {
  
        String reviewText = "Service Rating: " + service_rating +
                            "\nCleanliness Rating: " + cleaniliness_rating +
                            "\nWaiting Rating: " + waiting_rating +
                            "\nFood Quality Rating: " + food_quality +
                            "\nAffordability Rating: " + affordability +
                            "\nComment: " + (comment != null ? comment : "No comment");
        return reviewText;
   }
}