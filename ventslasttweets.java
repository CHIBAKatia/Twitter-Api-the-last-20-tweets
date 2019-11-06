package twitter4j;

import java.util.ArrayList;
import java.util.List;

public class ventslasttweets {
	 public static void main(String[] args) 
	 {
		Twitter twitter = new TwitterFactory().getInstance();
		
		try {
			
		 		       	  // recuperer les 20 dernier tweets d'un utilisateur
						  List<Status> recent_tweets = new ArrayList<>();
				          recent_tweets = twitter.getUserTimeline(86391789);
				          System.out.println(recent_tweets);
				          

				        
				          // recuperation du nombre de ses tweets
				          int nbr_recent_tweets = recent_tweets.size();
						  System.out.println("Nombre de tweets : " +nbr_recent_tweets);
				          
				          
				          
				          
							
			
		} catch (TwitterException te) {
			// TODO Auto-generated catch block
			
		}
		  
		 
		 
	 }
}
