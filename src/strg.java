public class strg {
    static void main() {
        String name = "Rahul";
        System.out.println(name);
        int va= name.length();
        System.out.println(va);
        String lower = name.toLowerCase();
        System.out.println(lower);

        String up = name.toUpperCase();
        System.out.println(up);
        String nontr = "     Rahul    ";
        System.out.println(nontr);
        String trimed;
        System.out.println(nontr.trim());
        String b = name.substring(2,4);
        System.out.println(b);
        System.out.println(name.replace("Rahul" ,"Musakn"));
        System.out.println(name.startsWith("Rah"));
        System.out.println(name.endsWith("ul"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('l'));
        System.out.println(name.equals("Rahuly"));
        System.out.println(name.equalsIgnoreCase("eSecondlecture"));
    }
}

