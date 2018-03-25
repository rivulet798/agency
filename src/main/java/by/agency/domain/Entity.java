package by.agency.domain;

/**
 * Entity is the abstract base class for travel contexts
 * which allows an application to define traveling, user and review entities.
 * An Entities object encapsulates id-information needed
 * for the various rendering operations that Java supports.
 *
 * @author      Katsiaryna Baranovskaya
 * @version     1.0
 */
public abstract class Entity{
    /**
     * Parameter - unique key of an entity.
     */
    private int id;

    /**
     * @return the value of current id.
     */
    public int getId() {
        return id;
    }

    /**Set id value.
     *@param id the key of entity
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @see java.lang.Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        return id == entity.id;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return id;
    }

    /**
     * @see java.lang.Object#toString() ()
     */
    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }
}
