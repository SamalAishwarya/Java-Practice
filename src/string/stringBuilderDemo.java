package string;
//String Builder
//        - mutable(modify)
//        - not thread safe
//        - non synchronized
//	- fast
public class stringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("codekul");
        System.out.println(builder);
        builder.append("pvt");
        System.out.println(builder);
        builder.append("Ltd");
        System.out.println(builder);
        builder.insert(0,"**");
        System.out.println(builder);
    }
}
