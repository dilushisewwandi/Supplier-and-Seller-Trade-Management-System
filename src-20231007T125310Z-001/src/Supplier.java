/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Supplier {
      private int id,age;
    private String supname,gender,address,contactnum,companyname;

    public Supplier() {
         this.id = 0;
        this.age = 0;
        this.supname = "";
        this.gender = "";
        this.address = "";
        this.contactnum = "";
        this.companyname = "";
    }
    
    
    
        public Supplier(int id, int age, String supname, String gender, String address, String contactnum, String companyname) {
        this.id = id;
        this.age = age;
        this.supname = supname;
        this.gender = gender;
        this.address = address;
        this.contactnum = contactnum;
        this.companyname = companyname;
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
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
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

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "supplier{" + "id=" + id + ", age=" + age + ", supname=" + supname + ", gender=" + gender + ", address=" + address + ", contactnum=" + contactnum + ", companyname=" + companyname + '}';
    }
    
}
