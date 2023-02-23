// 1. Define a class called UserAccount with Data member: username, emailId, password
// Method: Constructor, getter and setter method.
// Define another class called Yahoo which inherits from UserAccount class with Data
// member: securityQuestion, securityAnswer
// Method: Constructor, getter and setter method.
// Define another class called Twitter which inherits from UserAccounr class with Data
// Member: Actype (Private or Public), TwitMsg.
// Create object of class yahoo and twitter and display all the user of yahoo and twitter
// with all detail.


import java.util.Scanner;

class UserAccount {
    private String username;
    private String emailId;
    private String password;

    public UserAccount(String username, String emailId, String password) {
        this.username = username;
        this.emailId = emailId;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Yahoo extends UserAccount {
    private String securityQuestion;
    private String securityAnswer;

    public Yahoo(String username, String emailId, String password, String securityQuestion, String securityAnswer) {
        super(username, emailId, password);
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }
}

class Twitter extends UserAccount {
    private String actype;
    private String twitMsg;

    public Twitter(String username, String emailId, String password, String actype, String twitMsg) {
        super(username, emailId, password);
        this.actype = actype;
        this.twitMsg = twitMsg;
    }

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public String getTwitMsg() {
        return twitMsg;
    }

    public void setTwitMsg(String twitMsg) {
        this.twitMsg = twitMsg;
    }
}

public class Que1_Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = sc.nextLine();
        System.out.println("Enter the emailId");
        String emailId = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        System.out.println("Enter the securityQuestion");
        String securityQuestion = sc.nextLine();
        System.out.println("Enter the securityAnswer");
        String securityAnswer = sc.nextLine();
        System.out.println("Enter the actype");
        String actype = sc.nextLine();
        System.out.println("Enter the twitMsg");
        String twitMsg = sc.nextLine();

        Yahoo yahoo = new Yahoo(username, emailId, password, securityQuestion, securityAnswer);
        Twitter twitter = new Twitter(username, emailId, password, actype, twitMsg);

        System.out.println("Yahoo Details");
        System.out.println("Username: " + yahoo.getUsername());
        System.out.println("EmailId: " + yahoo.getEmailId());
        System.out.println("Password: " + yahoo.getPassword());
        System.out.println("SecurityQuestion: " + yahoo.getSecurityQuestion());
        System.out.println("SecurityAnswer: " + yahoo.getSecurityAnswer());

        System.out.println("Twitter Details");
        System.out.println("Username: " + twitter.getUsername());
        System.out.println("EmailId: " + twitter.getEmailId());
        System.out.println("Password: " + twitter.getPassword());
        System.out.println("Actype: " + twitter.getActype());
        System.out.println("TwitMsg: " + twitter.getTwitMsg());
        sc.close();
    }
}