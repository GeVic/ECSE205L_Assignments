
package knn;


import java.util.Scanner;
/**
 *
 * @author NAYA
 */
public class Knn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner object
        Scanner in = new Scanner(System.in);
       
        // Action movie matrix
        double action_movie[][] = {{100, 0},{90,17}};
        // Comedy movie matrix
        double comedy_movie[][] = {{0,100},{21,80}};
              
        // getting test cases as user input 
        System.out.println("Enter the Test cases :: ");
        double Test_xaxis = in.nextInt();      
        double Test_yaxis = in.nextInt();
        
        // To store the result of the Euclidean Distance of each joner
        double Compare_action_movie[] = new double[2];
        double Compare_comedy_movie[] = new double[2];
              
        // variable to temporarily hold the value
        double comedy_min, action_min;
        // distance for action movie
        for(int i = 0 ; i < 2; i++){           
            Compare_action_movie[i] = EuclideanDistance(action_movie[i][i], action_movie[i][1], Test_xaxis, Test_yaxis);
            Compare_comedy_movie[i] = EuclideanDistance(comedy_movie[i][i], comedy_movie[i][1], Test_xaxis, Test_yaxis);      
        }
                
        // minimum Euclidean Distance
        int i = 0;
        action_min = Math.min(Compare_action_movie[i], Compare_action_movie[i+1]);
        comedy_min = Math.min(Compare_comedy_movie[i], Compare_comedy_movie[i+1]);
     
        if(comedy_min <= action_min){      
            System.out.println("Its nearer to the Comedy movie");
        }
        else{
            System.out.println("It is nearer to the Action movie");
        }
    }           
    // Function to calculate the Euclidean Distance
    public static double EuclideanDistance(double movie_xaxis, double movie_yaxis, double test_xaxis, double test_yaxis){
            double x_result = movie_xaxis - test_xaxis;      
            double y_result = movie_yaxis - test_yaxis;  
            double x_square = Math.pow(x_result, 2);      
            double y_square = Math.pow(y_result, 2);          
            double Euclidean_distance = Math.sqrt(x_square + y_square);     
            return Euclidean_distance;
        }      
}
    
