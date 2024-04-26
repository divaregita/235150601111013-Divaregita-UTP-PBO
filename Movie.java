class Movie {
    private String title;
    private String[] genre;
    private double rating;
        
    public Movie(String title, String[] genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String title() {
        return title;
    }
    public String[] genre() {
        return genre;
    }
    public double rating() {
        return rating;
    }
}

        
        
       
    
