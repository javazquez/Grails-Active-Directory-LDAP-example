The http://grails.org/plugin/spring-security-ldap has great documentation. I put together a working example (at least in my environment) to complement the docs. When I was tasked with integrating our grails apps with Active Directory I remember there being a scarcity of examples.. so I hope this will save you some time in getting ldap working with Active Directory in your grails environment. 

Important files 

<a href='https://github.com/javazquez/Grails-Active-Directory-LDAP-example/blob/master/grails-app/conf/Config.groovy' target='_blank' >grails-app/conf/Config.groovy</a> <br/>
<a href='https://github.com/javazquez/Grails-Active-Directory-LDAP-example/blob/master/src/groovy/com/javazquez/ldapexample/MyUserDetailsContextMapper.groovy' target='_blank'>src/groovy/com/javazquez/ldapexample/MyUserDetailsContextMapper.groovy</a><br/>
<a href='https://github.com/javazquez/Grails-Active-Directory-LDAP-example/blob/master/src/groovy/com/javazquez/ldapexample/MyUserDetails.groovy' target='_blank'>src/groovy/com/javazquez/ldapexample/MyUserDetails.groovy</a><br/>
<a href='https://github.com/javazquez/Grails-Active-Directory-LDAP-example/blob/master/grails-app/conf/spring/resources.groovy' target='_blank'>grails-app/conf/spring/resources.groovy</a><br/>

once you have your Active Directory configurations entered (grails-app/conf/Config.groovy), fire up your app and 
test it out by logging in via the login controller.

Notes<br/>
<ul>
<li> This uses Grails 2.X and likely won't work with 3.X
<li> You may have to update MyUserDetailsContextMapper.groovy as my Active Directory environment may differ from yours. </li>
<li> You may also want to update MyUserDetails.groovy to hold more or less info than my config. </li>
</ul>
