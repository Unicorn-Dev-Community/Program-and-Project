import cv2
img=cv2.imread('image.png',1);

cv2.imshow('original image',img);
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY);
cv2.imshow('gray image',gray);

cv2.waitKey(0)
cv2.destroyAllWindows()
