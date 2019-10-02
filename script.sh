catalina stop
rm -rf /opt/servers/tomcat8/webapps/arapp
cp -f /opt/servers/tomcat8/webapps $works/appl/target/arapp.war
catalina start
