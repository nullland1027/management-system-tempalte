package tool;

public class Tools {
    public static String transCoding(String rStr, String coding) {
        try {
            byte buffer[] = rStr.getBytes("ISO-8859-1");
            String nStr = new String(buffer, coding);
            return nStr;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
