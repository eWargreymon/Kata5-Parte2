package kata5p2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
import static view.MailListReaderBD.read;

public class Kata5P2 {

    public static void main(String args[]) throws IOException, SQLException{
        
        Kata5P2 maincontrol = new Kata5P2();
        maincontrol.control();
    }
    
    private void control() throws IOException, SQLException{
        input();
        process();
        output();
    }
    
    private List<String> emails;
    private Histogram<String> histogram;
    
    private void input() throws SQLException {
        emails = read();
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(emails);
    }
    
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
