package class14;

public class task {
    String createEmail(String firstName,String lastName,String emailType){

        return(firstName+lastName+"@"+emailType+".com");
    }

    public static void main(String[] args) {
        task task=new task();
        String fullmail=task.createEmail("john","snow","gmail");
        System.out.println(fullmail);
    }
}
