public class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    void showCollege() {
        System.out.println("College: " + collegeName);
    }
    public static void main(String[] args) {
        College c = new College("DCL");
        c.showCollege();
    }
}