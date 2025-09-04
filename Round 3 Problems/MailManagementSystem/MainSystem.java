
public class MainSystem {
    
    public static void main(String[] args) {

        MailManagementSystem system=new MailManagementSystem();
        int choices;
        do{
            system.displayMenu();
            System.out.println("Enter your choices : ");
            choices=system.scanner.nextInt();
            system.scanner.nextLine(); 
        
            switch(choices) {
                case 1:
                    system.storeMail();
                    break;
                case 2:
                    system.deleteMail();
                    break;
                case 3:
                    system.addTag();
                    break;
                case 4:
                    system.showStats();
                    break;
                case 5:
                    system.search();
                    break;
                case 6:
                    system.wildSearch();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Credentials...");
        }
        
    }while(choices !=7);

    system.scanner.close();
}

}
