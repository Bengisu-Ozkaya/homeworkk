package derece.oop;

public class DereceTest {
    public static void main(String[] args) {
        String[] name = {"Kadir","Gokhan","Hakan","Suzan","Pinar","Mehmet","Ali","Emel","Firat","James","Jale","Ersin","Deniz","Gozde","Anil","Burak"};
        int[] degree = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        Derece myderece = new Derece (name,degree);
        myderece.procress();
    }
}
