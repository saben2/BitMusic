package bitmusic.music.business;

import java.util.*;
import java.lang.*;
import bitmusic.music.data.*;
/**
 *
 * @author Amina Bouabdallah
 */
public class SongSearcher {
    
    HashMap<String, List<String>> tagIndex; // tag -> list de song id 
    HashMap<String, List<String>> userIndex; // userId -> list de song id
    SongLibrary songLibrary;
    /**
     * 
     * @param songLib 
     */
    public SongSearcher(SongLibrary songLib){
        songLibrary = songLib;
        tagIndex = new HashMap<String, List<String>>(); 
        userIndex = new HashMap<String, List<String>>();
    }
    /**
     * Local user wants to get the list of songs owned by userId. 
     * Requires a call to the method getSongsByUser of network.api.ApiMusic.
     * Response received directly in the UI
     * @param userID id of the user whose songs we are searching for
     * @param SearchID if of the current search
     */
    public void searchSongsbyUser(String userID, String SearchID){
        
         
    }
    /**
     * Method invoked when local user is requested his/her songs. 
     * Fetches the local SongLibrary, and Local User's categories of contacts.
     * @param userId requester's user id
     * @return SongLibrary containing only the songs which requester can access
     */
    public SongLibrary getSongsByUser(String userId){
        return null;
    }
    
    /**
     * 
     * @param searchId
     * @param tagList
     * @return 
     */
    public SongLibrary searchSongByTags(String searchId, List<String> tagList){
        return null;
    }
    
    /**
     * 
     * @param songId
     * @param rights 
     */
    public void changeRightsOfThisSong(String songId, Rights rights){
        
    }
            
}
