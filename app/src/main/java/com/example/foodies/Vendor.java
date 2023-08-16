package com.example.foodies;
public class Vendor{
  
   private String vendorName;
   private String vendorNumber;
   private String location;
   private String email;
   private String phoneNumber;
   private Menu menu;

   public Vendor(String vendorName, String vendorNumber, String location, String email, String phoneNumber) {
   this.vendorName = vendorName;
      this.vendorNumber = vendorNumber;
      this.location = location;
      this.email = email;
      this.phoneNumber = phoneNumber;
   }

   // Getters and setters for each attribute

   public String getVendorName() {
      return vendorName;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public String getVendorNumber() {
      return vendorNumber;
   }

   public void setVendorNumber(String vendorNumber) {
      this.vendorNumber = vendorNumber;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @Override
   public String toString() {
      return "Vendor [vendorName=" + vendorName + ", vendorNumber=" + vendorNumber + 
            ", location=" + location + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
   }
}