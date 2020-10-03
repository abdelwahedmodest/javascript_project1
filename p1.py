

import  cv2, time

#create a video object. zero for external  camera
video = cv2.VideoCapture(0)



while True:
    #a = a + 1
    #Create a  frame  object
    check, frame = video.read()

    print(check)
    print(frame)  #Representing  image

    #Converting to grayscale
    #gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

    #Show  the frame !
    cv2.imshow("Capturing", frame)
    #cv2.imshow("Capturing", gray)


    #for press  any  key  to out  (miliseconds)
    cv2.waitKey(0)

    #for playing
    key = cv2.waitKey(1)
    #print(a)
    if key == ord('q'):
        break
        




#Shutdown the camera
video.release()

cv2.destroyAllWindows



