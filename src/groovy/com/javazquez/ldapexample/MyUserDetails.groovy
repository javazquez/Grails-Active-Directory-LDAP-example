package com.javazquez.ldapexample

/**
 * Created by Juan Vazquez.
 * URL: http://javazquez.com/juan
 * Code is provide for educational purposes. Any use in a production system is at your own risk.
 */
import org.springframework.security.core.userdetails.User

class MyUserDetails extends User {
    // extra instance variables final String fullname final String email final String title
    String fullname
    String email
    String title
    String phone

    String photo

    MyUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
                  boolean credentialsNonExpired, boolean accountNonLocked, Collection authorities,
                  String fullname, String email, String title, String photo, String phone) {

        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities)

        this.fullname = fullname
        this.email = email
        this.title = title
        this.photo = photo
        this.phone = phone
    }
}
