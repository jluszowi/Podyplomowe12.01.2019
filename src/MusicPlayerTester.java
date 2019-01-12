public class MusicPlayerTester {

    public static void main(String[] args) {
        MusicPlayer Mp3 = new Mp3();
        Mp3.Odtwarzaj();
        System.out.println("Odtwarza Mp3");
        Mp3.pauza();
        System.out.println("pauza Mp3");
        Mp3.stop();
        System.out.println("stop Mp3");
        Mp3.nastepny();
        System.out.println("następny utwór Mp3");
        Mp3.poprzedni();
        System.out.println("poprzedni utwór Mp3");

        System.out.println();

        MusicPlayer CD = new CD();
        CD.Odtwarzaj();
        System.out.println("Odtwarza CD");
        CD.pauza();
        System.out.println("pauza CD");
        CD.stop();
        System.out.println("stop CD");
        CD.nastepny();
        System.out.println("następny utwór CD");
        CD.poprzedni();
        System.out.println("poprzedni utwór CD");

    }



}
