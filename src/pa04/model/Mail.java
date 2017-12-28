package pa04.model;

public class Mail {
    
    private final String mail;
    private final int id;

    public Mail(String mail, int id) {
        this.mail = mail;
        this.id = id;
    }

    public String getMail() {
        return mail;
    }  

    public int getId() {
        return id;
    }
    
}
package pa04.model;

public class Mail {
    
    private final String mail;
    private final int id;

    public Mail(String mail, int id) {
        this.mail = mail;
        this.id = id;
    }

    public String getMail() {
        return mail;
    }  

    public int getId() {
        return id;
    }
    

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }  
    
    public String getDomain(){
        String[] dom = mail.split("@");
        return dom[1];
    }

}
package pa04.model;

public class Mail {
    
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }  
    
    public String getDomain(){
        String[] dom = mail.split("@");
        return dom[1];
    }

}
