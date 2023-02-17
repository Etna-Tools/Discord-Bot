package net.etna.api.object;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Eliott Belinguier
 * @since 1.0
 * @version 1.0
 */
public class User {

    @SerializedName("id")
    private final long id;
    @SerializedName("login")
    public final String login;
    @SerializedName("firstname")
    public final String firstName;
    @SerializedName("lastname")
    public final String lastName;
    @SerializedName("email")
    public final String email;
    @SerializedName("close")
    protected boolean closed;
    @SerializedName("roles")
    protected final List<String> roles;
    @SerializedName("created_at")
    protected final Date createdAt;
    @SerializedName("updated_at")
    protected final Date updatedAt;

    protected User() {
        this.id = -1;
        this.login = null;
        this.firstName = null;
        this.lastName = null;
        this.email = null;
        this.closed = true;
        this.roles = new ArrayList<String>();
        this.createdAt = null;
        this.updatedAt = null;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public Date getCreatedAt() {
        return this.createdAt != null ? new Date(this.createdAt.getTime()) : null;
    }

    public Date getUpdatedAt() {
        return this.updatedAt != null ? new Date(this.updatedAt.getTime()) : null;
    }

    public boolean isStudent() {
        return this instanceof Student;
    }

    public Student getAsStudent() {
        if (!isStudent())
            throw new UnsupportedOperationException("This user is not a student.");
        return (Student) this;
    }

}
