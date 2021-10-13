
from subprocess import call
import time
import os
import glob
import smtplib
import base64
from email.mime.image import MIMEImage
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import sys

gmail_user = "ajworld789@gmail.com"
gmail_pwd = "sample@12345"
FROM = 'ajworld789@gmail.com'


#IMAGE



# msg = MIMEMultipart()
# time.sleep(1)
# msg['Subject'] ="SECURITY"

# #BODY with 2 argument

# #body=sys.argv[1]+sys.argv[2]
# body="THIS IS FROM PANTECH SOLUTION REGARDING SECURITY BREACH"          
# msg.attach(MIMEText(body,'plain'))
# time.sleep(1)
print('Hello signup to AJ world')
name=input('Name: ')
mail=input('Mail: ')
password1=input('Enter password: ')
password2=input('Re-Enter password: ')
while password1 != password2:
    print("Password didn't match")
    password1=input('Enter password: ')
    password2=input('Re-Enter password: ')
quit='y'
while password1==password2:
    if str(quit) != 'n' :


        TO = [mail] #must be a list
        msg = MIMEMultipart()
        time.sleep(1)
        msg['Subject'] ="Congrats"

        body="YOU HAVE SUCCESSFULLY SIGNED-UP"          
        msg.attach(MIMEText(body,'plain'))
        time.sleep(1)
        try:
                server = smtplib.SMTP("smtp.gmail.com", 587) #or port 465 doesn't seem to work!
                server.ehlo()
                server.starttls()
                server.login(gmail_user, gmail_pwd)
                server.sendmail(FROM, TO, msg.as_string())
                server.close()
                print ('successfully sent the mail')
        except:
                print ("failed to send mail")
    print()
    print("Hello,",name )
    print('Signin now')
    n=1
    while n==1:
        name1=input('Enter user name: ')
        password3=input('Enter password: ')
        if name1 != name or password1 != password3:
            TO = [mail] #must be a list
            msg = MIMEMultipart()
            time.sleep(1)
            msg['Subject'] ="SECURITY"

            body="THIS IS FROM AJ WORLD REGARDING SECURITY BREACH"          
            msg.attach(MIMEText(body,'plain'))
            time.sleep(1)
            try:
                    server = smtplib.SMTP("smtp.gmail.com", 587) #or port 465 doesn't seem to work!
                    server.ehlo()
                    server.starttls()
                    server.login(gmail_user, gmail_pwd)
                    server.sendmail(FROM, TO, msg.as_string())
                    server.close()
                    print ('successfully sent the mail')
            except:
                    print ("failed to send mail")
            print()

            print('User name or password not right.')
        else:

            while name1==name and password3==password1:
                print('Welcom to AJ world',name)
                print('you have successfully signed in')
                logout=input('If you want to logout, Type "y" or continue type "n": ')
                if logout=='y' or logout=='Y':
                    print('You have successfully logout')
                    n=0
                    break
    print()
    quit=input('Type "y" to quit or "n" to continue: ')
    if quit== 'y' or quit== "Y":

        break
    
