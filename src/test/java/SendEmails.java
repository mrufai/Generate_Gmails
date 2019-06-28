import org.apache.commons.mail.SimpleEmail;

public class SendEmails {

    public static void main(String[] args) {

        /*
            first Step:  go to  : https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
         */


        String username="spartabatch11@gmail.com",
                password ="cybertek2019",
                Receiver ="spartabatch11@gmail.com",
                MSG = "How are you, It's been long time no see";



        sendEmails( username, password, Receiver , MSG );
        System.out.println("Send");


    }

    public static void sendEmails(String username, String password, String Receiver, String MSG){

        SimpleEmail email=new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);


        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.setSubject("Testing");
            email.addTo(Receiver);
            email.send();
            Thread.sleep(3000);
        } catch (Exception e) {   }


    }

}
