package com.javazquez.ldapexample

/**
 * Created by Juan Vazquez.
 * URL: http://javazquez.com/juan
 * Code is provide for educational purposes. Any use in a production system is at your own risk.
 */
import org.springframework.ldap.core.DirContextAdapter
import org.springframework.ldap.core.DirContextOperations
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper

class MyUserDetailsContextMapper implements UserDetailsContextMapper {
	UserDetails mapUserFromContext(DirContextOperations ctx, String username, Collection authorities) {

	//Grab the specific Active Directory information you want
    String fullname = ctx.originalAttrs.attrs['cn'].values[0]
    String email = ctx.originalAttrs.attrs['mail'].values[0].toString().toLowerCase()
	
    def titleobj = ctx.originalAttrs.attrs['sn']	
	String title = (titleobj  == null) ? '' : titleobj.values[0]
    String phone = ctx.getStringAttribute('telephoneNumber')
    String photo = ctx.getObjectAttribute('extensionAttribute10')
    def userDetails = new MyUserDetails(username, '', true, true, true, true,
            authorities, fullname, email, title , photo, phone)

    return userDetails
}

void mapUserToContext(UserDetails user, DirContextAdapter ctx) {
    throw new IllegalStateException("Only retrieving data from LDAP is currently supported")
}

}
