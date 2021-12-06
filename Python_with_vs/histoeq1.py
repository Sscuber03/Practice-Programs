# import Opencv
import cv2
  
# import Numpy
import numpy as np
  
# read a image using imread
img = cv2.imread(r"C:\Users\sscub\Downloads\testimage.jpg", 0)
  
# creating a Histograms Equalization
# of a image using cv2.equalizeHist()
equ = cv2.equalizeHist(img)
  
# stacking images side-by-side
res = np.hstack((img, equ))
  
# show image input vs output
msg='Image'
cv2.imshow(msg, res)
  
cv2.waitKey(0)
cv2.destroyAllWindows()