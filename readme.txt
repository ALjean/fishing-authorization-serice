keytool -genkeypair -alias jwt -keyalg RSA -dname "CN=jwt, L=Berlin, S=Berlin, C=DE" -keypass mySecretKey -keystore jwt.jks -storepass mySecretKey



keytool -list -rfc --keystore jwt.jks | openssl x509 -inform pem -pubkey

http://stytex.de/blog/2016/02/01/spring-cloud-security-with-oauth2/