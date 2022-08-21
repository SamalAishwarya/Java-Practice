package string;

public class stringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Pune");
        buffer.append(",Maharashtra");
        System.out.println(buffer);
        buffer.codePointBefore(1);
        System.out.println(buffer);
        buffer.trimToSize();
        System.out.println(buffer);
    }
}
