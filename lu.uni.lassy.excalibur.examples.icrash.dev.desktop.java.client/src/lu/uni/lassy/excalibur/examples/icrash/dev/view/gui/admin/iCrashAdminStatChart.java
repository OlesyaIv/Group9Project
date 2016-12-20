package lu.uni.lassy.excalibur.examples.icrash.dev.view.gui.admin;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary.DtQualityDataset;

public class iCrashAdminStatChart extends JDialog {

	JFreeChart barChart;
	DefaultCategoryDataset dataset;
	final String satisfaction = "SATISFACTION";
	final String maintenance = "MAINTENANCE";
	final String timeout = "TIMEOUT";
	final String period = "Satisfaction bars";
	double sat;
	double maince;
	double time;

	public iCrashAdminStatChart(String applicationTitle, String chartTitle, DtQualityDataset aDtQualityDataset) {
		super();
		dataset = new DefaultCategoryDataset();
		dataset.addValue(aDtQualityDataset.satisfaction.getValue(), satisfaction, period);
		dataset.addValue(aDtQualityDataset.maintenance.getValue(), maintenance, period);
		dataset.addValue(aDtQualityDataset.timeout.getValue(), timeout, period);
		barChart = ChartFactory.createBarChart(chartTitle, "Category", "Score", dataset, PlotOrientation.VERTICAL, true,
				true, false);
		ChartPanel chartPanel = new ChartPanel(barChart);
		// chartPanel.setLayout(new GridLayout());
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		setContentPane(chartPanel);

	}

	public void updateDataset(DtQualityDataset aDtQualityDataset) {
		dataset.setValue(aDtQualityDataset.satisfaction.getValue(), satisfaction, period);
		dataset.setValue(aDtQualityDataset.maintenance.getValue(), maintenance, period);
		dataset.setValue(aDtQualityDataset.timeout.getValue(), timeout, period);
	}
}
