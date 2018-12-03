package kata5p2;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata5P2 {

    public static void main(String args[]) throws IOException{
        
        Kata5P2 maincontrol = new Kata5P2();
        maincontrol.control();
    }
    
    private void control() throws IOException{
        input();
        process();
        output();
    }
    
    private String filename;
    private Histogram<String> histogram;
    private void input() {
        filename = "C:\\Users\\eddyh\\OneDrive\\Documentos\\NetBeansProjects\\Kata5P2\\email.txt";
    }

    private void process() throws IOException {
        List<Mail> mailList = MailListReader.read(filename);
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
