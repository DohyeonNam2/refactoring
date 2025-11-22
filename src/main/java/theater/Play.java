package theater;

/**
 * A Play with a name and type (e.g., tragedy or comedy).
 * @null name and type can not be null
 */
public class Play {

    private String name;
    private String type;

    /**
     * Constructs a Play with the given name and type.
     * @param name the play name
     * @param type the play type
     * @null No parameter may be null
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Return the play neme of this play.
     * @return the play neme
     * @null Never returns null
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this Play.
     * @param name the new name
     * @null given name must not be null
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the play type of this play.
     * @return the play type
     * @null Never returns null
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of this Play.
     * @param type the new type
     * @null given type must not be null
     */
    public void setType(String type) {
        this.type = type;
    }
}
