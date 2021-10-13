import serial #Serial imported for Serial communication
import time #Required to use delay functions
import pyautogui
person=0
ArduinoSerial = serial.Serial('COM3',9600) #Create Serial port object called arduinoSerialData
time.sleep(2) #wait for 2 seconds for the communication to get established

while 1:
    incoming = int (ArduinoSerial.readline()) #read the serial data and print it as line
    #   print (incoming)
    
    if incoming==0 and person==0:
        person=1
        print("here")
        pyautogui.typewrite(['space'], 0.2)
    if incoming==1 and person==1:
        person=0
        pyautogui.typewrite(['space'], 0.2)

    
    
