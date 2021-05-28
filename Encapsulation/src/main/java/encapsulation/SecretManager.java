package encapsulation;

/**
 * Simple example of encapsulation, where we have hidden our variables,
 * bounded the them with getter and setter methods to prevent illegal access,
 * and our class {@link SecretManager} has successfully encapsulated all its members as a single unit.
 */
public class SecretManager {

    private String personalSecret = "I am SECRET!";

    public String getPersonalSecret(int code) {
        if (isAuthorized(code))
            return personalSecret;
        else return null;
    }

    public void setPersonalSecret(int code, String personalSecret) {
        if (null == personalSecret) {
            System.out.println("Null not accepted");
            return;
        }
        if (isAuthorized(code)) {
            this.personalSecret = personalSecret;
            System.out.println("secret has been changed.");
        }
    }

    private boolean isAuthorized(int code) {
        if (123 == code)
            return true;
        else {
            System.out.println("Invalid code!");
            return false;
        }
    }

    public static void main(String[] args) {
        SecretManager secretManager = new SecretManager();
        secretManager.setPersonalSecret(123, "HI");
        System.out.println("Here is your secret : " + secretManager.getPersonalSecret(123));
    }
}
