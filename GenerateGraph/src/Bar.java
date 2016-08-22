import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;
import java.io.File;

public class Bar {
	public static void main(String[] args) {
		// Create a simple pie chart
		DefaultPieDataset pieDataset = new DefaultPieDataset();
		pieDataset.setValue("Occupied", new Integer(55));
		pieDataset.setValue("Free", new Integer(11));
		pieDataset.setValue("On the way", new Integer(34));
		//pieDataset.setValue("D", new Integer(5));
		JFreeChart chart = ChartFactory.createPieChart(
				"Time Distribution", // Title
				pieDataset, // Dataset
				true, // Show legend
				true, // Use tooltips
				false // Configure chart to generate URLs?
				);
		try {
			ChartUtilities.saveChartAsJPEG(new File("C:\\chart2.jpg"), chart,
					500, 300);
		} catch (Exception e) {
			System.out.println("Problem occurred creating chart.");
		}
	}
}

