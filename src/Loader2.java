public class Loader2 {
    public static void main(String[] args) {
        String phone1 = "+7 900 764-33-04";
        String phone2 = "+7 (900) 764-33-04";
        String phone3 = "7-900-764-33-04";
        String phone4 = "7(900)7643304";

        System.out.println(formatPhoneNumber(phone1));

        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
    }


    // 79007643304

    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]";
        return phone.replaceAll(regex, "");
    }
}
