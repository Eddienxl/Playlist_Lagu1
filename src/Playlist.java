public class Playlist {
    private Song head;
    private Song tail;

    public Playlist() {
        head = null;
        tail = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        addSong(newSong);
    }

    public void addSong(Song newSong) {
        if (head == null) {
            head = newSong;
            tail = newSong;
        } else {
            tail.setNext(newSong);
            tail = newSong;
        }
    }

    public void displayPlaylist() {
        Song current = head;
        int index = 1;
        if (current == null) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("Daftar lagu dalam playlist:");
            while (current != null) {
                System.out.println(index + ". " + current.getTitle());
                current = current.getNext();
                index++;
            }
        }
    }
}
