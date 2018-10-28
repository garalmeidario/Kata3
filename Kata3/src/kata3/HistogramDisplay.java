package kata3;

import java.awt.Dimension;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame.*;

public class HistogramDisplay extends JFrame{
        
    private final Histogram<String> histogram;
            
    public HistogramDisplay(Histogram histogram){
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        
         pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                                                     "Dominios email","Nº de emails",
                                                     dataSet, PlotOrientation.VERTICAL,
                                                     false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for(String key : histogram.keySet()){
            dataSet.addValue(histogram.get(key),"", key);
        }
        return dataSet;
    }
    
}
