package Q_LE2;
public class Pair <Y,N> {
    private Y key; private N value;

    public Pair(Y key, N value) {
        this.key = key;
        this.value = value;
    }
    public void setKey(Y key) {
        this.key = key;
    }
    public void setValue(N value) {
        this.value = value;
    }
    public Y getKey() {
        return key;
    }
    public N getValue() {
        return value;
    }
    public static void header(int n) {
        System.out.println("Lab Exercise: " + n + "-Q1");
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: Checking execution time");
        System.out.println("=============================================\n");
    }
    public static void footer(int n) {
        int lab = n;
        System.out.println("=============================================");
        System.out.println("Completion of Lab Exercise " + n + " is successful!");
        System.out.println("Signing off -Ethan ");
    }
}
