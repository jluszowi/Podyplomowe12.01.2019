public class EmployeeTester {
       public static void main(String[] args) {

           Employee employee1 = new Employee("Jan", 32, 3000);
           Employee employee2 = new Employee("Jan", 32, 3000);

          if (employee1.equals(employee2)) {
              System.out.println("Ten sam pracownik!!!");
          }
    }

}
