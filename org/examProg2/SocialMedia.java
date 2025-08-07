package org.examProg2;

import java.util.function.Function;

public class SocialMedia extends Function {

    String userStandar;
    String moderator;
    String admin;

    public void Users(String userStandar, String moderator, String admin) {
        this.userStandar = userStandar;
        this.moderator = moderator;
        this.admin = admin;
    }
    public String getUserStandar() {
        return userStandar;
    }
    public void setUserStandar(String userStandar) {
        this.userStandar = userStandar;
    }
    public String getModerator() {
        return moderator;
    }
    public void setModerator(String moderator) {
        this.moderator = moderator;
    }
    public String getAdmin() {
        return admin;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public static void main(String[] args) {


    }
    }



