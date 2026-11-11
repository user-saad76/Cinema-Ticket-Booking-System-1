
import java.util.Scanner;

class Movie{
    String movieName;
    int ticketPrice;
    int[][] availableSeats;
}



public class main {
       static void PersonalDetails(String[] names,String[] emails,String[] phoneNumbers,int totalCustomers ){
           for(int x = 0;x<totalCustomers;x++){
               System.out.println("Name : " + names[x]);
               System.out.println("Email : " + emails[x]);
               System.out.println("PhoneNumber: " + phoneNumbers[x]);
           }

       }

    public static void main(String[] args) {
        System.out.println("*************CINEMA-TICKET-BOOKING-SYSTEM************");
        Scanner input = new Scanner(System.in);
        System.out.println();
         int totalMovies = 3;
        int totalSeats = 5;
        String[] MoviesNames = {"The hacker","Love story","WWZ RTX"};
        int[] TicketPrices = {5600,8900,4500};
         Movie[] movie = new Movie[totalMovies];
         for(int i = 0;i<totalMovies;i++){
             movie[i] = new Movie();
             movie[i].movieName = MoviesNames[i];
             movie[i].ticketPrice =  TicketPrices[i];
         }
         int[][] seats = {
                 {0, 0, 0, 0, 0},
                 {0, 0, 0, 0, 0},
                 {0, 0, 0, 0, 0}
         };
         for(int row = 0;row<seats.length;row++){
             System.out.print(MoviesNames[row] + "  ");
             for(int column = 0;column<seats[row].length;column++){
                 System.out.print(seats[row][column] + "  ");
             }
             System.out.println();
         }
        System.out.println();
        System.out.println("*************************");
        System.out.println();
        int totalCustomers = 10;
        String[] names = new String[totalCustomers];
        String[] emails = new String[totalCustomers];
        String[] phoneNumbers = new String[totalCustomers];
            for(int x = 0;x<totalCustomers;x++){
                System.out.print("Enter your name : ");
                names[x] = input.nextLine();
                System.out.print("Enter your email : ");
                emails[x] = input.nextLine();
                System.out.print("Enter your phone number : ");
                phoneNumbers[x] = input.nextLine();
                System.out.println();
                System.out.println("****************************");
                System.out.println();
                System.out.print("Enter movie you want to watch : ");
                String movieName = input.nextLine();
                boolean isMovieValid = false;
                int movieIndex = 0;
                for(int y = 0;y<totalMovies;y++){
                    if(movieName.equalsIgnoreCase(MoviesNames[y])){
                        isMovieValid = true;
                        movieIndex = y;
                        break;
                    }
                }
                if(isMovieValid){
                    System.out.print("Booked your seat  (Y/N) : ");
                    String BookedSeat = input.nextLine();
                    if(BookedSeat.equalsIgnoreCase("Y")){
                        boolean Booked = false;
                         for(int count = 0;count<totalSeats;count++){
                             if(seats[movieIndex][count] == 0){
                                 seats[movieIndex][count] = 1;
                                 Booked = true;
                                 break;
                             }
                         }
                         if(Booked){
                             System.out.println("You have booked a seat for " + movieName + " successfully");
                         }
                         else{
                             System.out.println("All seats are already booked");
                         }
                    }
                    else{
                        System.out.print(" None ");
                    }
                }
                else{
                    System.out.println("You have enter movie which are not available ");
                }
            }


        PersonalDetails(names,emails,phoneNumbers,totalCustomers);

    }
}
