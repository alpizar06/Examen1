package com.uia.is12.business;

import com.uia.is12.data.SongDAO;
import com.uia.is12.domain.Song;

public class SongBusiness {
    
    private SongDAO songDAO;
    
    public SongBusiness(){
       this.songDAO = new SongDAO();
    }
    
    public Song getSong(){
        return songDAO.getSong() ;
    }
}
