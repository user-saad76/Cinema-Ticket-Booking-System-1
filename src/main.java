
import java.util.Scanner;

class Movie{
    String movieName;
    int ticketPrice;
    int[][] availableSeats;
   void AvaiableSeats(){
       for(int x = 0;x<availableSeats[0].length;x++){
           System.out.print(" Seat - " + (x+1));
           if(availableSeats[0][x] == 0){
               System.out.println(" Available ");
           }
           else{
               System.out.println(" Booked ");
           }
       }
   }


}



public class main {
       static void PersonalDetails(String[] names,String[] emails,String[] phoneNumbers,int totalCustomers ){
           for(int x = 0;x<totalCustomers;x++){
               System.out.println("Name : " + names[x]);
               System.out.println("Email : " + emails[x]);
               System.out.println("PhoneNumber: " + phoneNumbers[x]);


           }
       }
       static void TotalRevenue(int[] Revenue ){
             int total = 0;
             for(int x = 0;x< Revenue.length;x++){
                 total = total + Revenue[x];
             }
           System.out.println("Total Revenue of Cinema : " + total);
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
             movie[i].availableSeats = new int[1][totalSeats];
         }

        int totalCustomers = 5;
        int[] Revenue = new int[totalCustomers];
        String[] names = new String[totalCustomers];
        String[] emails = new String[totalCustomers];
        String[] phoneNumbers = new String[totalCustomers];
            for(int x = 0;x<totalCustomers;x++){
                System.out.println();
                System.out.print("Enter movie you want to watch : ");
                String movieName = input.nextLine();
                boolean isMovieValid = false;
                int movieIndex = 0;
                for(int y = 0;y<totalMovies;y++){
                    if(movieName.equalsIgnoreCase(MoviesNames[y])){
                        isMovieValid = true;
                        movieIndex = y;
                        System.out.println(" Movie:  " + movieName);
                        movie[y].AvaiableSeats();
                        break;
                    }

                }
                if(isMovieValid){
                    System.out.print("Booked your seat  (Y/N) : ");
                    String BookedSeat = input.nextLine();
                    if(BookedSeat.equalsIgnoreCase("Y")){
                        boolean Booked = false;
                         for(int count = 0;count<totalSeats;count++){
                             if(movie[movieIndex].availableSeats[0][count] == 0){
                                 movie[movieIndex].availableSeats[0][count] = 1;
                                 Revenue[movieIndex] = movie[movieIndex].ticketPrice;
                                 Booked = true;
                                 break;
                             }
                         }
                         if(Booked){
                             System.out.print("Enter your name : ");
                             names[x] = input.nextLine();
                             System.out.print("Enter your email : ");
                             emails[x] = input.nextLine();
                             System.out.print("Enter your phone number : ");
                             phoneNumbers[x] = input.nextLine();
                             System.out.println();
                             System.out.println("You have booked a seat for " + movieName + " successfully");

                         }
                         else{
                             System.out.println("All seats are already booked,enter another movie you want to watch");
                         }
                    }
                    else{
                        System.out.println("Cancel ");

                    }
                }
                else{
                    System.out.println("You have enter movie which are not available ");
                }
            }
        PersonalDetails(names,emails,phoneNumbers,totalCustomers);
        TotalRevenue( Revenue );
    }
}
