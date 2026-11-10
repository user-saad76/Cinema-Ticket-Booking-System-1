
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
        int count = 0;
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
            PersonalDetails(names,emails,phoneNumbers,totalCustomers);
            System.out.println("****************************");
            System.out.println();
            System.out.print("Enter movie you want to watch : ");
            String movieName = input.nextLine();
            boolean isMovieValid = false;
            for(int y = 0;y<totalMovies;y++){
                if(movieName == MoviesNames[y]){
                    isMovieValid = true;
                    break;
                }
            }
            if(isMovieValid){
                System.out.print("Booked your seat  (Y/N) : ");
                String BookedSeat = input.nextLine();
                if(BookedSeat=="Y"){
                    seats[count][x] = 1;
                }
                else{
                    System.out.print(" None ");
                }




            }
        }


    }
}
