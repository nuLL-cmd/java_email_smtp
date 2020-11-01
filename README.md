# Java email smtp 

A sample project for send email using Java, and the libs Activation, Additionnal and Mail.

The configuration  protocols smtp in class.java i for conection with service gmail google is required<br/>.
Example:<br/><br/>
        Properties props = new Properties();<br/>
        props.put("mail.smtp.host", "smtp.gmail.com");<br/>
        props.put("mail.smtp.starttls.enable", "true");<br/>
        props.put("mail.smtp.auth", "true");<br/>
        props.put("mail.smtp.port", "587");<br/>

For send email with these service, will neccessary configure two steps in our account google.

Step one:<br/>
Unlock your account for acces apps. Using the link<br/>
https://myaccount.google.com/lesssecureapps?pli=1&rapt=AEjHL4NFExAbZ1PaOgBtZNk9QHymbqc_4kcCXAj7F-TErkqGHRYDrUAvWpZGtZg5lUhxdg5KXeEeNKEsE6TaMQh2626rrOYDJg

<br/>Step two:<br/>
Permission for acces your account using email and password<br/>
https://accounts.google.com/b/0/DisplayUnlockCaptcha


<br/>
<br/>

If will  use for android development, is neccessary build the class AsyncTask for execute the process in thread separated (future implementation)<br/>
else if will use in simple java project, is not neccessasry, but is possible to implement with asycn in simple java project
<br/>
<br/>
<br/>

Thanks for reading<br/>
@automatoDev 2020
