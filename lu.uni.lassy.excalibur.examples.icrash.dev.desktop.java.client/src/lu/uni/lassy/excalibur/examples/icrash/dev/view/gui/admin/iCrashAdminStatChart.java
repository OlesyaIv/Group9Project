package lu.uni.lassy.excalibur.examples.icrash.dev.view.gui.admin;

import javax.swing.JDialog;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class iCrashAdminStatChart extends JDialog {

	 public iCrashAdminStatChart( String applicationTitle , String chartTitle )
	   {
	      super( );        
	      
		 JFreeChart barChart = ChartFactory.createBarChart(chartTitle,"Category","Score",createDataset(),PlotOrientation.VERTICAL,true,true,false);
		         
		      ChartPanel chartPanel = new ChartPanel( barChart );        
		      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
		      setContentPane( chartPanel ); 
	 }
	   private CategoryDataset createDataset( )
	   {
	      final String satisfaction = "SATISFACTION";        
	      final String maintenance = "MAINTENANCE";        
	      final String timeout = "TIMEOUT";        
	      final String period = "period";          
	      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  

	      dataset.addValue( 8.0 , satisfaction , period);                 
	      dataset.addValue( 3.0 , maintenance , period );        
	      dataset.addValue( 5.0 , timeout , period );                    

	      return dataset; 
	   }
}
