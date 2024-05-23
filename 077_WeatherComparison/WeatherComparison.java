public class WeatherComparison {
    
        // Dual Array that hold the weather data 
        int[][] weatherAndDay = {
// This will not run, but please take it.
            {0, 1, 2, 3, 4, 5, 6, 7},
            {2015, 37, 32 ,44, 34, 34, 38, 37},
            {2016, 37, 32, 44, 34, 34, 38, 37},
            {2017, 52, 50, 49, 53, 47, 45, 48},
            {2018, 22, 28, 28, 27, 21, 19, 22},
            {2019, 37, 39, 40, 38, 42, 48, 56},
            {2020, 45, 53, 30, 32, 43, 51, 55}
        };
            
        
    

// Method that does the average of all the years 
        public void CombinedAverageOfEachYear(int[][] weatherAndDay)
        {
            int sum = 0;
            int average = 0;
            for (int i = 0; i < weatherAndDay.length; i++)
            {
                for (int j = 0; j < weatherAndDay[i].length; j++)
                {
                    sum += weatherAndDay[i][j];
                }
                average = sum / weatherAndDay[i].length;
                System.out.println("The average of year " + (i + 2015) + " is " + average);
            }
        }
    
    // Method that does the average of each year 
       public void fiveYearAverage(double[][] weatherAndDay) {
            double sum = 0;
            int count = 0;
            for (double[] week : weatherAndDay) {
                for (double temp : week) {
                    sum += temp;
                    count++;
                }
            }
            double avg = sum / count;
            System.out.println("THIS IS THE AVERAGE OF ALL 5 YEARS: " + avg);
        }
    
    // Method that does the average of each week 
        public void dailyAvg(double[][] weatherAndDay) {
            for (int day = 1; day <= 7; day++) {
                double sum = 0;
                int count = 0;
                for (double[] week : weatherAndDay) {
                    sum += week[day - 1];
                    count++;
                }
                double avg = sum / count;

                System.out.println("The AVERAGE OF EACH DAY IS: " + avg);
            }
        }

// main method 
        public static void main(String[] args){}

 }


