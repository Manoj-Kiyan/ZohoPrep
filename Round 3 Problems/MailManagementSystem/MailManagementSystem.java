import java.util.*;
import java.util.stream.Collectors;

public class MailManagementSystem {
    private List<Mail> mails;
    
    private Set<String> spamWords;

    public Scanner scanner;


    public MailManagementSystem() {
        mails=new ArrayList<>();

        spamWords=new HashSet<>(Arrays.asList("lottery","winner","prize","urgent","conguratulations"));

        scanner=new Scanner(System.in);

    }

    public void storeMail() {
        System.out.println("Enter the Sender Mail-Id : ");
        String sender = scanner.nextLine();
        System.out.println("Enter the Receiver Mail-Id : ");
        String receiver=scanner.nextLine();
        System.out.println("Subject : ");
        String subject=scanner.nextLine();
        System.out.println("Content : ");
        String content=scanner.nextLine();


        Mail mail=new Mail(sender, receiver, subject, content);
        checkspam(mail);
        mails.add(mail);
        System.out.println("Mail Stored Succesfully!");
        
    }

    public void deleteMail(){
        System.out.println("Enter the index to delete : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if(index >= 0 && index <mails.size()){
            mails.remove(index);
            System.out.println("Mail number "+ index + "deleted Succesfully");
        }else{
            System.out.println("Invalid Mail Index or Deleted Mail Not Found");
        }
    }

    public void addTag() {
        System.out.println("Enter E-mail index : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if(index >=0 && index <mails.size()){
            System.out.println("Enter tag : ");
            String tag=scanner.nextLine();
            mails.get(index).addTag(tag);
            System.out.println("Tag has been added succesfully!");
        }else{
            System.out.println("Invalid Index!");
        }
    }

    public void showStats(){
        System.out.println("Mail Statistics :");
        System.out.println("Total mails : "+mails.size());
        System.out.println("Enter no of recent mails to display : ");
        int n=scanner.nextInt();
        scanner.nextLine();
         
        System.out.println("Show Recent "+ n + " Mails : ");
        mails.stream()
                    .skip(Math.max(0,mails.size()-n))
                    .forEach(System.out::println);

    }

    private void 
    checkspam(Mail mail){
        String content=mail.getContent().toLowerCase();
        for(String word:spamWords){
            if(content.contains(word)){
                mail.SetSpam(true);
                break;
            }

        }
    
    }

    public void search(){
        System.out.println("Enter Search Query : ");
        String query=scanner.nextLine();

        List<Mail> results=mails.stream().filter(mail ->  mail.getSender().toLowerCase().contains(query) ||
                                                         mail.getReceiver().toLowerCase().contains(query) ||
                                                         mail.getSubject().toLowerCase().contains(query) ||
                                                         mail.getContent().toLowerCase().contains(query) ||
                                                         mail.getTags().stream().anyMatch(tag -> tag.toLowerCase().matches(query))).collect(Collectors.toList());
        if(results.isEmpty()){
            System.out.println("No mails found matching the querry");
        }else{
            System.out.println("Search Results :");
            results.forEach(System.out::println);
        }
    }

        public void wildSearch(){
            System.out.println("Enter WildSearch Query : ");
            final String patterns=scanner.nextLine().toLowerCase().replace("*", ".*");

            List<Mail> results=mails.stream().filter(mail -> mail.getSender().toLowerCase().matches(patterns) ||
                                                             mail.getReceiver().toLowerCase().matches(patterns)||
                                                             mail.getSubject().toLowerCase().matches(patterns) ||
                                                             mail.getContent().toLowerCase().matches(patterns) ||
                                                             mail.getTags().stream().anyMatch(tag -> tag.toLowerCase().matches(patterns))).collect(Collectors.toList());
            if(results.isEmpty()){
                System.out.println("No mails found matching the pattern");
            }else{
                System.out.println("WildSearch Results :");
                results.forEach(System.out::println);
            }
    }

    public void displayMenu(){
        System.out.println("Mail Management System : ");
        System.out.println("1. Store Mail ");
        System.out.println("2. Delete Mail ");
        System.out.println("3. Add Tag ");
        System.out.println("4. Show Statistics ");
        System.out.println("5. Search ");
        System.out.println("6. WildSearch ");
        System.out.println("7. Exit ");
    }
}
