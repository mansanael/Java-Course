public class Payment {
    String phoneNumber;
    String network;
    double amount;
    String currency;

    /**
     * Initial constructor for the payment class
     * @param phoneNumber phone number for payment
     * @param network payment network
     * @param amount the amount in double to pay for
     * @param currency the currency for payment
     */
    public Payment( String phoneNumber, String network, double amount, String currency){

        this.amount = amount;
        this.currency = currency;
        this.network = network;
    }


    /**
     *
     * @param phoneNumber
     * @return the phoneNumber formatted with +223
     */
    private String formatPhoneNumber(String phoneNumber){
        if (phoneNumber.startsWith("0") && phoneNumber.length() == 10){
            return  "+223" + phoneNumber.substring(0,10);
        } else {
            return phoneNumber;
        }
    }


    /**
     *
     * @return string of the number with +223
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
