package derece.oop;

public class Derece {
    private final String[] name;
    private final int[] degree;

    public Derece(String[] name, int[] degree) {
        this.name = name;
        this.degree = degree;
    }
    public int getFirst() {
        int first = degree[0];
        for (int i = 0; i < degree.length; i++) {
            if (first > degree[i]) {
                first = degree[i];
            }
        }
        return first;
    }
    public int getSecond(){
        int first = getFirst();
        int second = degree[0];
        for (int i = 0; i < degree.length; i++) {
            if( second > degree[i] && degree[i] > first) {
                second = degree[i];
            }
        }
        return second;
    }
    public int getThird(){
        int third = degree[0];
        int first = getFirst();
        int second = getSecond();
        for (int i = 0; i < degree.length; i++) {
            if (third>degree[i] && degree[i] > second) {
                third = degree[i];
            }
        }
        return third;
    }
    public void getRank() {
        int counta = 0;
        int countb = 0;
        int countc = 0;
        for (int i = 0; i < degree.length; i++) {
            if(degree[i] >=200 && degree[i] <= 299){
                counta++;
            }
            else if(degree[i] >=300 && degree[i] <= 399){
                countb++;
            }
            else {
                countc++;
            }
        }
        System.out.println("A --> " + counta + "\n" + "B --> " + countb + "\n" + "C --> " + countc );
    }

    public String getName1(){
        int a = getFirst();
        int number1 = 0;
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == a)
                number1 = i;
        }
        return name[number1];
    }
    public String getName2(){
        int b = getSecond();
        int number2 = 0;
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == b)
                number2 = i;
        }
        return name[number2];
    }
    public String getName3(){
        int c = getThird();
        int number3 = 0;
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == c)
                number3 = i;
        }
        return name[number3];
    }
    public void procress(){
        System.out.println("Birinci: " + getName1() + "--> " +  getFirst() + "'");
        System.out.println("İkinci: " + getName2() + "--> " + getSecond() + "'");
        System.out.println("Üçüncü: " + getName3() + "--> " +getThird() + "'");
        getRank();

    }
}
