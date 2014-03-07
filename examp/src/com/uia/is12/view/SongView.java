package com.uia.is12.view;

import com.uia.is12.business.SongBusiness;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SongView extends Thread{
    private SongBusiness songBusiness;
    
    public SongView(){
        songBusiness = new SongBusiness();
    }
    
    public void run(){
        try {
            Thread.sleep(1000);
             ArrayList<Verse> verses= new ArrayList<>();
             verses = songBusiness.getSong().getVerse();/*.getsong.getverse*/
            for (Verse v: verses) {
                
            
            Thread.sleep(v.getVerseTime());
            System.out.println(v.getParagraph());
            }  
        } catch (InterruptedException ex) {
            Logger.getLogger(SongView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        SongView song = new SongView();
        song.start();
    }
}
