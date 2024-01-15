/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Seller {
      private int id,age;
    private String sellername,gender,address,contactnum;

    public Seller() {
         this.id = 0;
        this.age = 0;
        this.sellername = "";
        this.gender = "";
        this.address = "";
        this.contactnum = "";
        
    }
    
    
    
        public Seller(int id, int age, String sellername, String gender, String address, String contactnum) {
        this.id = id;
        this.age = age;
        this.sellername = sellername;
        this.gender = gender;
        this.address = address;
        this.contactnum = contactnum;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSupname() {
        return sellername;
    }

    public void setSupname(String sellername) {
        this.sellername = sellername;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

   

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", age=" + age + ", supname=" + sellername + ", gender=" + gender + ", address=" + address + ", contactnum=" + contactnum +'}';
    }
    
}
