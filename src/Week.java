public enum Week {
    Monday("Бул куну кампуста: Zoom"),Tuesday("Бул куну кампуста: Session"),Wednesday("Бул куну кампуста: Zoom"),Thursday("Бул куну кампуста: session"),Friday("Бул куну кампуста: Zoom"),Saturday("Бул куну кампуста: English, soft skills and football"),Sunday("Бул куну кампуста: Дем алыш");

    private String what;
    Week(String what) {
        this.what = what;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }
}
