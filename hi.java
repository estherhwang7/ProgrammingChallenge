public class Customer {
    private String name;
    private String address;

    public Customer(String n, String a) {
       name = n;
       address = a;
    }

    public String toString() {
       return "Name: " + name + "\nAddress: " + address;
    }

    public static void main(String[] args) {
       Customer c = new Customer("Fran Santiago", "123 Main St., Anytown, USA");
       System.out.println(c);
 
       // Testing OnlineCustomer
       OnlineCustomer c2 = new OnlineCustomer("Jasper Smith", "456 High St., Anytown, USA", "jsmith456@gmail.com");
       System.out.println(c2);
    }
}

class OnlineCustomer extends Customer {
    private String email; 

    public OnlineCustomer(String n, String a, String e) {
        super(n, a); 
        email = e;
    }

    public String toString() {
        return super.toString() + "\nEmail: " + email;
    } 
}
