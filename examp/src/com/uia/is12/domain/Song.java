package com.uia.is12.domain;

import java.util.ArrayList;

public class Song {
    private String Name;
    private ArrayList<Verse> verse;
    
    public Song(){
        
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(String Name){
        
    }
    
    public ArrayList<Verse> getVerse(){
        return verse;
    }

    public void setVerse(ArrayList<Verse> verse) {
        this.verse = verse;
    }

    
    
  
}
