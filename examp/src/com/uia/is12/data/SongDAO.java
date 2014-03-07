/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;


import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class SongDAO {
    
    public SongDAO(){
    
    }
    
    public Song getSong(){
        Song song = new Song();
        ArrayList<Verse> verses= new ArrayList();
        
        verses.add(new Verse("When I find my code in tons of trouble,",5000));
        verses.add(new Verse("Friends and colleagues come to me,",5000));
        verses.add(new Verse("Speaking words of wisdom:",5000));
        verses.add(new Verse("Write in C.",5000));
        verses.add(new Verse("Write in C, Write in C,",5000));
        verses.add(new Verse("Write in C, oh, Write in C.",5000));
        verses.add(new Verse("BASIC's not the answer.",5000));
        verses.add(new Verse("Write in C",5000));
        
        song.setVerse(verses);
        return song;
    }
    //Pueden crear un metodo main para probar que todo este funcionando
    public static void main(String args[]){
        //NOTA: instancia de tipo PoemDAO
        SongDAO songDAO = new SongDAO();
        
        ArrayList<Verse> verses = new ArrayList();
        verses= songDAO.getSong().getVerse();
        
        for(Verse v: verses){
            System.out.println(v.getParagraph());
        }
        
    }
    
}
