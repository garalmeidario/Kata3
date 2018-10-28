package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
