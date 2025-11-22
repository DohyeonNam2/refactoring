package theater;

/**
 * Class representing a performance of a play.
 * @null playID and audience can not be null
 */
public class Performance {

    private String playID;
    private int audience;

    /**
     * Constructs a Play with the given name and type.
     * @param playID the ID of the play being performed
     * @param audience the size of the audience
     * @null No parameter may be null
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Return the playID of current play.
     * @return the play ID
     * @null Never returns null
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Sets the ID of current Play.
     * @param playID the new playID
     * @null given ID must not be null
     */
    public void setPlayID(String playID) {
        this.playID = playID;
    }

    /**
     * Return the audience size for current play.
     * @return the audience size
     * @null Never returns null
     */
    public int getAudience() {
        return audience;
    }

    /**
     * Sets the audience size of current Play.
     * @param audience the new audience size
     * @null given type must not be null
     */
    public void setAudience(int audience) {
        this.audience = audience;
    }
}
