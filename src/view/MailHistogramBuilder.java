package view;

import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<String> mail){
        
        Histogram<String> histo = new Histogram();
        for (String string : mail) {
            histo.increment(string);
        }
        
        return histo;
    }
}
