package net.etna.api;

import static net.etna.api.APIServices.*;

/**
 * @author Eliott Belinguier
 * @since 1.0
 * @version 1.0
 */
public class EndPoints {

    /* USER ENDPOINTS */
    public static String EP_USER = API_AUTH + "/users/%s";
    public static String EP_USER_PICTURE = EP_USER + "/photo";

    /* STUDENT ENDPOINTS */
    public static String EP_STUDENT = API_MANAGER_STUDENT + "/students/%s";

}
