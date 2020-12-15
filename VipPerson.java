/**
 * VipPerson
 */
public class VipPerson {

    private String name;
    private double creditlimit;
    private String emailaddress;

public VipPerson() {
    this("default", 50000.00, "123@email.com");
    }
public VipPerson(String name, Double creditlimit){
        this(name, creditlimit, "unknown@email.com");
    }
public VipPerson(String name, Double limit, String email){
    this.name = name;
    this.creditlimit = limit; 
    this.emailaddress = email;
}

public String getName() {
    return name;
}
public double getcreditlimit() {
    return creditlimit;
}
public String getemailaddress() {
    return emailaddress;
}



public static void main(String[] args) {
    VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        System.out.println(person1.getcreditlimit());
        System.out.println(person1.getemailaddress());
        System.out.println("******************************");
    VipPerson person2  = new VipPerson("siddhant", 25000.00);
       System.out.println(person2.getName());
       System.out.println(person2.getcreditlimit());
       System.out.println("*******************************");
       
    VipPerson person3 =  new VipPerson("aditi", 20000.00, "aditibisht@gmail.com");
       System.out.println(person3.getName());
       System.out.println(person3.getcreditlimit());
       System.out.println(person3.getemailaddress());   
}




}