package kata3;

import java.awt.Dimension;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame.*;

public class HistogramDisplay extends JFrame{
    
    public HistogramDisplay(){
        super("Histograma");
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
        JFreeChart chart = ChartFactory.createBarChart( "Histograma JFreeChart",
                 "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL,
                 false,false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(7, "", "hotmail.es");
        dataSet.addValue(8, "", "ulpgc.es");
        dataSet.addValue(5, "", "ull.es");
        return dataSet;
    }
}
