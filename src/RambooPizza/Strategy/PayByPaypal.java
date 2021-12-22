package RambooPizza.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PayByPaypal implements PayStrategy{

    private static final List<String> users = new ArrayList<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private boolean signedIn;

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                String email = READER.readLine();
                System.out.print("Enter the password: ");
                String password = READER.readLine();
                if (email.length() > 6) {
                    signedIn = true;
                    System.out.println("Login has been successful.");
                } else {
                    signedIn = false;
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public boolean pay(double paymentAmount) {
        if (signedIn) {
            System.out.println("Paid " + paymentAmount + "$ with Paypal");
            return true;
        }
        else
            return false;
    }


}
