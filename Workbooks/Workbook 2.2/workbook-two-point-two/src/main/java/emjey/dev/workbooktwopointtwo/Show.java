package emjey.dev.workbooktwopointtwo;

// This file is made by EmJey
// Project: Workbook 2.2
// FileName: Show
// Date: 2023/09/11
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Show {
    private String title;
    private String episode;
    private double rating;

    public Show(String title, String episode, double rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
