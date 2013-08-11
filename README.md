The http://grails.org/plugin/spring-security-ldap has great documentation. I put together a working example (at least in my environment) to complement the docs. When I was tasked with integrating our grails apps with Active Directory I remember their being a scarcity of examples.. so I hope this will save you some time in getting ldap working with Active Directory in your grails environment. 

Important files 

grails-app/conf/Config.groovy
src/groovy/com/javazquez/ldapexample/MyUserDetailsContextMapper.groovy
src/groovy/com/javazquez/ldapexample/MyUserDetails.groovy
grails-app/conf/spring/resources.groovy

once you have your Active Directory configurations entered (grails-app/conf/Config.groovy), fire up your app and 
test it out by logging in via the login controller.

Notes
1) You may have to update src/groovy/com/javazquez/ldapexample/MyUserDetailsContextMapper.groovy as my Active Directory environment may differ from yours. 
2) You may also want to update src/groovy/com/javazquez/ldapexample/MyUserDetails.groovy to hold more or less info than my config.

