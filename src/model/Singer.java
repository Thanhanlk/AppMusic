/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Singer {
    private int idSinger;
    private String fullName;
    private Date dateOfBirth;
    private String hometown;
    private String careerInfo;

    public Singer() {
        super();
    }

    public Singer(int idSinger, String fullName, Date dateOfBirth, String hometown, String careerInfo) {
        super();
        this.idSinger = idSinger;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.hometown = hometown;
        this.careerInfo = careerInfo;
    }

    public int getIdSinger() {
        return idSinger;
    }

    public void setIdSinger(int idSinger) {
        this.idSinger = idSinger;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCareerInfo() {
        return careerInfo;
    }

    public void setCareerInfo(String careerInfo) {
        this.careerInfo = careerInfo;
    }

    
}
