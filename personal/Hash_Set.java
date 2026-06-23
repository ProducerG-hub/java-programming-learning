package personal;

import java.util.HashSet; // stores data with dynamic sizes without duplication

public class Hash_Set {
    HashSet <String> emails = new HashSet<>();

    public void setEmails() {
        emails.add("gwamaka@example.com");
        emails.add("david@ceo.com");
        emails.add("stephen@yahoo.com");
        emails.add("gwamaka@example.com");

        System.out.println("There are " + emails.size() + " emails stored");

        // displaying
        for (String email: emails){
            System.out.println(email);
        }

    }

    public static void main(String[] args) {
        Hash_Set list = new Hash_Set();
        list.setEmails();
    }
}
