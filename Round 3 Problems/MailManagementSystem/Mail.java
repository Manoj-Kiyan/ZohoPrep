import java.util.*;

public class Mail {
    public String sender;

    public String receiver;

    public String subject;

    public String content;

    public List<String> tags;

    public boolean isspam;

//Constructors:
    public Mail(String sender,String receiver,String subject,String content){
        this.sender=sender;
        this.receiver=receiver;
        this.subject=subject;
        this.content=content;
        this.tags=new ArrayList<>();
        this.isspam=false;
    }

//Getters and Setters:
    public String getSender(){
        return sender;
    }
    public String getReceiver(){
        return receiver;
    }
    public String getSubject(){
        return subject;
    }
    public String getContent(){
        return content;
    }
    public List<String> getTags(){
        return tags;
    }
    public boolean  isspam(){
        return isspam;
    }

    public void SetSpam(boolean spam){
        isspam=spam;
    }


    public void addTag(String tag){
        if(!tags.contains(tag)){
            tags.add(tag);
        }
    }

    public void removeTag(String tag){
        tags.remove(tag);
    }


    @Override
    public String toString() {
        return "From : " + sender + "\n"+
                "To : " + receiver + "\n"+
                "Subject : " + subject + "\n"+
                "Content : " + content + "\n"+
                "Tags : " + tags + "\n"+
                "Spam : " + isspam ;
    }
}
