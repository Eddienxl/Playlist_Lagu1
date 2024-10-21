public class Song {
    private String title;
    private Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }

    public String getTitle() {
        return title;
    }

    public void setNext(Song next) {
        this.next = next;
    }

    public Song getNext() {
        return next;
    }
}
