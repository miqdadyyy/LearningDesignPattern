public class NullPatternDemo {
   public static void main(String[] args) {

      AbstractCustomer customer1 = CustomerFactory.getCustomer("name1");
      AbstractCustomer customer2 = CustomerFactory.getCustomer("name2");
      AbstractCustomer customer3 = CustomerFactory.getCustomer("name3");
      AbstractCustomer customer4 = CustomerFactory.getCustomer("name4");

      System.out.println("Customers");
      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());
   }
}