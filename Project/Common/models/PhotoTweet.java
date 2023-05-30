package Common.models;

import java.util.*;

public class PhotoTweet extends Tweet{
    private int tweetid; //Generated by hashcode
    private ArrayList<Photo> photopost = new ArrayList<>();

    public PhotoTweet(String text, ArrayList<Photo> photopost) {
        super(text);
        this.photopost = photopost;
    }
    //Converts a photo tweet's ID into to hashCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), photopost);
    }

    public int getTweetid() {
        return tweetid;
    }

    public void setTweetid(int tweetid) {
        this.tweetid = tweetid;
    }

    public ArrayList<Photo> getPhotopost() {
        return photopost;
    }

    public void setPhotopost(ArrayList<Photo> photopost) {
        this.photopost = photopost;
    }
    
    
}
