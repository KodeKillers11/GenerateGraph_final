import java.io.*;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart
{
   public static void main( String[ ] args ) throws Exception
   {
      DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
      line_chart_dataset.addValue( 260 , "months" , "Jan" );
      line_chart_dataset.addValue( 270 , "months" , "Feb" );
      line_chart_dataset.addValue( 265, "months" , "Mar" );
      line_chart_dataset.addValue( 275 , "months" , "Apr" );
      line_chart_dataset.addValue( 285 , "months" , "May" ); 
      line_chart_dataset.addValue( 300 , "months" , "Jun" );

      JFreeChart lineChartObject = ChartFactory.createLineChart(
         "Months vs Efficiency","Months",
         "Efficiency",
         line_chart_dataset,PlotOrientation.VERTICAL,
         true,true,false);

      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      ChartUtilities.saveChartAsJPEG( new File( "C:\\LineChart.jpg" ),lineChartObject, width ,height);
   }
}
